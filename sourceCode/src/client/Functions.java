package client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;

public class Functions {
    static final int Server_Port = 9080;
    static final String Server_Ip = "localhost";

    public static void login(String emailOrId, String password, JLabel failed_login) {
        try (Socket socket = new Socket(Server_Ip, Server_Port);
             PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
             BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {

            // Send login request to the server
            out.println("LOGIN " + emailOrId + " " + password);

            // Read server response
            String response = input.readLine();
            System.out.println("Server: " + response);

            // Handle response based on role
            if (response != null && response.startsWith("Login successful:")) {
                if (response.contains("Admin")) {
                    openAdminFrame();
                } else if (response.contains("Doctor")) {
                    openDoctorFrame();
                } else if (response.contains("Patient")) {
                    openPatientFrame();
                }
            } else {
                System.out.println("Login failed. Please check your credentials.");
                failed_login.setVisible(true);
            }

        } catch (IOException ex) {
            System.out.println("Error connecting to server: " + ex.getMessage());
        }
    }

    // Placeholder GUI launchers
    private static void openAdminFrame() {
        System.out.println("Launching Admin dashboard...");
        new Admin().setVisible(true);
    }

    private static void openDoctorFrame() {
        System.out.println("Launching Doctor dashboard...");
        new Doctor().setVisible(true);
    }

    private static void openPatientFrame() {
        System.out.println("Launching Patient dashboard...");
        // new PatientFrame().setVisible(true);
    }

    // Register function for user registration
    public static void register(String firstName, String lastName,  String email, String Specialty ,String professionalId,String password) {
        try (Socket socket = new Socket(Server_Ip, Server_Port);
             PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
             BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {

            // Send registration request to the server with user details
            out.println("REGISTER " + firstName + " " + lastName + " " +email+""+Specialty+""+ professionalId + " " + email + " " + password);

            // Read server response
            String response = input.readLine();
            System.out.println("Server: " + response);

            // Handle registration response
            if (response != null && response.equals("Registration successful")) {
                System.out.println("Registration successful!");
                // You can add logic here to navigate to another frame or inform the user.
            } else {
                System.out.println("Registration failed. Please try again.");
                //failed_register.setVisible(true); // Show error message in the GUI
            }

        } catch (IOException ex) {
            System.out.println("Error connecting to server: " + ex.getMessage());
        }
    }
    
    
        public static List<String[]> fetchDoctorRequests() {
        List<String[]> doctorList = new ArrayList<>();
        try (Socket socket = new Socket(Server_Ip, Server_Port);
             PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
             BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {

            out.println("FETCH_DOCTORS");
            String response = input.readLine();

            if (response != null && response.startsWith("DOCTOR_LIST ")) {
                String data = response.substring("DOCTOR_LIST ".length());
                String[] entries = data.split("\\|");

                for (String entry : entries) {
                    if (!entry.isEmpty()) {
                        String[] doctorData = entry.split(";");
                        doctorList.add(doctorData);
                    }
                }
            }

        } catch (IOException e) {
            System.out.println("Error fetching doctors: " + e.getMessage());
        }
        return doctorList;
    }
        
    //--------accept and decline buttons in CheckDoc
    
    public static boolean acceptDoctorRequest(String professionalId) {
        try (Socket socket = new Socket(Server_Ip, Server_Port);
             PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
             BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {

            out.println("ACCEPT_DOCTOR " + professionalId);
            String response = input.readLine();
            return response != null && response.startsWith("SUCCESS");

        } catch (IOException ex) {
            System.out.println("Error accepting doctor: " + ex.getMessage());
            return false;
        }
    }

    public static boolean declineDoctorRequest(String professionalId) {
        try (Socket socket = new Socket(Server_Ip, Server_Port);
             PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
             BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {

            out.println("DECLINE_DOCTOR " + professionalId);
            String response = input.readLine();
            return response != null && response.startsWith("SUCCESS");

        } catch (IOException ex) {
            System.out.println("Error declining doctor: " + ex.getMessage());
            return false;
        }
    }
<<<<<<< HEAD
    
    //--------------------------CkeckCleint
    
    public static List<String[]> searchPatient(String firstName, String lastName) {
        List<String[]> patientList = new ArrayList<>();
        try (Socket socket = new Socket(Server_Ip, Server_Port);
             PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
             BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {

            out.println("SEARCH_PATIENT " + firstName + " " + lastName);
            String response = input.readLine();

            if (response != null && response.startsWith("PATIENT_LIST ")) {
                String data = response.substring("PATIENT_LIST ".length());
                String[] entries = data.split("\\|");

                for (String entry : entries) {
                    if (!entry.isEmpty()) {
                        patientList.add(entry.split(";"));
                    }
                }
            }

        } catch (IOException e) {
            System.out.println("Error searching patient: " + e.getMessage());
        }
        return patientList;
    }
=======
>>>>>>> 3bc25ccf0bed3a8ac49109db28ebd0e252793c72

}
