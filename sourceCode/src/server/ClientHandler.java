package server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class ClientHandler extends Thread {

    private final Socket client;
    private final PrintWriter out;
    private final BufferedReader input;
    private final Connection conn;

    public ClientHandler(Socket clientSocket, Connection conn) throws IOException {
        this.client = clientSocket;
        this.conn = conn;
        this.out = new PrintWriter(client.getOutputStream(), true);
        this.input = new BufferedReader(new InputStreamReader(client.getInputStream()));
    }

    @Override
    public void run() {
        try {
            String request;
            while ((request = input.readLine()) != null) {
                if (request.startsWith("LOGIN")) {
                    handleLogin(request);
                } else if (request.startsWith("REGISTER")) {
                    handleRegister(request);
                }else if (request.startsWith("FETCH_DOCTORS")) {
                    handleFetchDoctorRequests();
                } else if (request.startsWith("ACCEPT_DOCTOR")) {
                    handleAcceptDoctor(request);
                } else if (request.startsWith("DECLINE_DOCTOR")) {
                    handleDeclineDoctor(request);
                } else if (request.startsWith("SEARCH_PATIENT")) {
                    handleSearchPatient(request);
                }else if (request.startsWith("FETCH_ALL_DOCTORS")) {
                    handleFetchAllDoctors();
                } else if (request.startsWith("FETCH_ALL_PATIENTS")) {
                    handleFetchAllPatients();
                }else {
                    out.println("Unknown command.");
                }

            }
        } catch (IOException e) {
            System.out.println("Client disconnected: " + e.getMessage());
        }
    }

    private void handleLogin(String request) {
        String[] parts = request.split(" ");
        if (parts.length < 3) {
            out.println("Invalid login request");
            return;
        }

        String emailOrId = parts[1];
        String password = parts[2];

        try {
            // Try Admin login
            String sql = "SELECT * FROM admin WHERE email = ? AND password = ?";
            try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setString(1, emailOrId);
                stmt.setString(2, password);
                try (ResultSet rs = stmt.executeQuery()) {
                    if (rs.next()) {
                        out.println("Login successful: Admin");
                        System.out.println("Admin logged in: " + emailOrId);
                        return;
                    }
                }
            }

            // Try Doctor login
            sql = "SELECT * FROM doctor WHERE email = ? AND password = ?";
            try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setString(1, emailOrId);
                stmt.setString(2, password);
                try (ResultSet rs = stmt.executeQuery()) {
                    if (rs.next()) {
                        out.println("Login successful: Doctor");
                        System.out.println("Doctor logged in: " + emailOrId);
                        return;
                    }
                }
            }

            // Try Patient login
            sql = "SELECT * FROM patient WHERE social_security_number = ? AND password = ?";
            try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setString(1, emailOrId);
                stmt.setString(2, password);
                try (ResultSet rs = stmt.executeQuery()) {
                    if (rs.next()) {
                        out.println("Login successful: Patient");
                        System.out.println("Patient logged in: " + emailOrId);
                        return;
                    }
                }
            }

            out.println("Login failed: Invalid credentials");
            System.out.println("Login failed for: " + emailOrId);

        } catch (Exception e) {
            out.println("Database error: " + e.getMessage());
            System.out.println("Error during login: " + e.getMessage());
        }
    }

    private void handleRegister(String request) {
        
        String[] parts = request.split(" ");
        if (parts.length < 6) {
            System.out.println("hleo from regester123");
            return;
        }

        String firstName = parts[0];
        String lastName = parts[1];
        String email = parts[2];
        String specialty = parts[3]; 
        String professionalId = parts[4];
        String password = parts[5];

        try {
            // Check if the user already exists in doctor_requests
            String checkSql = "SELECT * FROM doctor_requests WHERE professional_id = ? OR email = ?";
            try (PreparedStatement stmt = conn.prepareStatement(checkSql)) {
                stmt.setString(1, professionalId);
                stmt.setString(2, email);
                try (ResultSet rs = stmt.executeQuery()) {
                    if (rs.next()) {
                        out.println("Registration failed: Request already exists.");
                        return;
                    }
                }
            }
            System.out.println("first name "+firstName);
            // Insert the new user into the doctor_requests table
            String insertSql = "INSERT INTO doctor_requests (first_name, last_name,  email,specialty, professional_id, password) VALUES (?, ?, ?, ?, ?, ?)";
            try (PreparedStatement stmt = conn.prepareStatement(insertSql)) {
                stmt.setString(1, firstName);
                stmt.setString(2, lastName);
                stmt.setString(3, specialty);
                stmt.setString(4, professionalId);
                stmt.setString(5, email);
                stmt.setString(6, password);

                int rowsAffected = stmt.executeUpdate();
                if (rowsAffected > 0) {
                    out.println("Registration request successful. Your account is pending admin approval.");
                    System.out.println("Doctor registration request submitted: " + email);
                } else {
                    out.println("Registration failed: Could not insert data.");
                }
            }

        } catch (Exception e) {
            out.println("Database error: " + e.getMessage());
            System.out.println("Error during registration: " + e.getMessage());
        }
    }
    
    
    //-----------------ChechDoc code------------------
    
    //get the informations to show it in the table
    private void handleFetchDoctorRequests() {
        try {
            String sql = "SELECT * FROM doctor_requests";
            try (PreparedStatement stmt = conn.prepareStatement(sql);
                 ResultSet rs = stmt.executeQuery()) {

                StringBuilder responseBuilder = new StringBuilder();
                while (rs.next()) {
                    String firstName = rs.getString("first_name");
                    String lastName = rs.getString("last_name");
                    String email = rs.getString("email");
                    String specialty = rs.getString("specialty");
                    String professionalId = rs.getString("professional_id");

                    // Format: FirstName;LastName;Email;Specialty;ID|...
                    responseBuilder.append(firstName).append(";")
                                   .append(lastName).append(";")
                                   .append(email).append(";")
                                   .append(specialty).append(";")
                                   .append(professionalId).append("|");
                }

                out.println("DOCTOR_LIST " + responseBuilder.toString());

            }
        } catch (SQLException e) {
            out.println("ERROR Fetching doctor list: " + e.getMessage());
            e.printStackTrace();
        }
    }
    
    
    //eccept or delet a row in the table
    private void handleAcceptDoctor(String request) {
    String[] parts = request.split(" ");
    if (parts.length < 2) {
        out.println("ERROR Invalid accept request");
        return;
    }

    String professionalId = parts[1];
    
    try {
        conn.setAutoCommit(false);
        
        // 1. Get doctor data
        String selectSql = "SELECT * FROM doctor_requests WHERE professional_id = ?";
        try (PreparedStatement selectStmt = conn.prepareStatement(selectSql)) {
            selectStmt.setString(1, professionalId);
            ResultSet rs = selectStmt.executeQuery();
            
            if (rs.next()) {
                // 2. Insert into doctors table
                String insertSql = "INSERT INTO doctor (first_name, last_name, email, specialty, professional_id, password) VALUES (?, ?, ?, ?, ?, ?)";
                try (PreparedStatement insertStmt = conn.prepareStatement(insertSql)) {
                    insertStmt.setString(1, rs.getString("first_name"));
                    insertStmt.setString(2, rs.getString("last_name"));
                    insertStmt.setString(3, rs.getString("email"));
                    insertStmt.setString(4, rs.getString("specialty"));
                    insertStmt.setString(5, rs.getString("professional_id"));
                    insertStmt.setString(6, rs.getString("password"));
                    insertStmt.executeUpdate();
                }
                
                // 3. Delete from requests
                String deleteSql = "DELETE FROM doctor_requests WHERE professional_id = ?";
                try (PreparedStatement deleteStmt = conn.prepareStatement(deleteSql)) {
                    deleteStmt.setString(1, professionalId);
                    deleteStmt.executeUpdate();
                }
                
                conn.commit();
                out.println("SUCCESS Doctor accepted");
            } else {
                conn.rollback();
                out.println("ERROR Doctor not found");
            }
        }
    } catch (SQLException e) {
        try { conn.rollback(); } catch (SQLException ex) {}
        out.println("ERROR Database error: " + e.getMessage());
    } finally {
        try { conn.setAutoCommit(true); } catch (SQLException e) {}
    }
}

    private void handleDeclineDoctor(String request) {
        String[] parts = request.split(" ");
        if (parts.length < 2) {
            out.println("ERROR Invalid decline request");
            return;
        }

        String professionalId = parts[1];

        try {
            String sql = "DELETE FROM doctor_requests WHERE professional_id = ?";
            try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setString(1, professionalId);
                int rows = stmt.executeUpdate();
                out.println(rows > 0 ? "SUCCESS Doctor declined" : "ERROR Doctor not found");
            }
        } catch (SQLException e) {
            out.println("ERROR Database error: " + e.getMessage());
        }
    }
    
    
    //--------------------CheckClient(patient)------------------------
    
    private void handleSearchPatient(String request) {
        String[] parts = request.split(" ", 3);
        if (parts.length < 3) {
            out.println("ERROR Invalid search request");
            return;
        }

        String firstName = parts[1];
        String lastName = parts[2];

        try {
            String sql = "SELECT patient_id, first_name, last_name, email, birth_date, social_security_number " +
                        "FROM patient WHERE first_name LIKE ? AND last_name LIKE ?";

            try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setString(1, "%" + firstName + "%");
                stmt.setString(2, "%" + lastName + "%");

                ResultSet rs = stmt.executeQuery();
                StringBuilder response = new StringBuilder();

                while (rs.next()) {
                    response.append(rs.getString("patient_id")).append(";")
                          .append(rs.getString("first_name")).append(";")
                          .append(rs.getString("last_name")).append(";")
                          .append(rs.getString("email")).append(";")
                          .append(rs.getDate("birth_date")).append(";")
                          .append(rs.getString("social_security_number")).append("|");
                }

                if (response.length() > 0) {
                    out.println("PATIENT_LIST " + response.toString());
                } else {
                    out.println("NO_PATIENT No patients found");
                }
            }
        } catch (SQLException e) {
            out.println("ERROR Database error: " + e.getMessage());
        }
    }

    //------------------------Chemanage---------------------
    
    //---bringing live info to the two tables
    
    private void handleFetchAllDoctors() {
        try {
            String sql = "SELECT doctor_id, first_name, last_name, email, specialty, professional_id FROM doctor";
            try (PreparedStatement stmt = conn.prepareStatement(sql);
                 ResultSet rs = stmt.executeQuery()) {

                StringBuilder response = new StringBuilder();
                while (rs.next()) {
                    response.append(rs.getString("doctor_id")).append(";")
                          .append(rs.getString("first_name")).append(";")
                          .append(rs.getString("last_name")).append(";")
                          .append(rs.getString("email")).append(";")
                          .append(rs.getString("specialty")).append(";")
                          .append(rs.getString("professional_id")).append("|");
                }

                out.println(response.length() > 0 ? "DOCTOR_LIST " + response : "NO_DOCTORS");
            }
        } catch (SQLException e) {
            out.println("ERROR Database error: " + e.getMessage());
        }
    }

    private void handleFetchAllPatients() {
        try {
            String sql = "SELECT patient_id, first_name, last_name, email, birth_date, social_security_number FROM patient";
            try (PreparedStatement stmt = conn.prepareStatement(sql);
                 ResultSet rs = stmt.executeQuery()) {

                StringBuilder response = new StringBuilder();
                while (rs.next()) {
                    response.append(rs.getString("patient_id")).append(";")
                          .append(rs.getString("first_name")).append(";")
                          .append(rs.getString("last_name")).append(";")
                          .append(rs.getString("email")).append(";")
                          .append(rs.getDate("birth_date")).append(";")
                          .append(rs.getString("social_security_number")).append("|");
                }

                out.println(response.length() > 0 ? "PATIENT_LIST " + response : "NO_PATIENTS");
            }
        } catch (SQLException e) {
            out.println("ERROR Database error: " + e.getMessage());
        }
    }
    
    //------updating the two table(deleting and transfaring)
    
    private void handleArchiveDoctor(String request) {
        String[] parts = request.split(" ");
        if (parts.length < 2) {
            out.println("ERROR Invalid archive request");
            return;
        }

        String doctorId = parts[1];

        try {
            conn.setAutoCommit(false);

            // 1. Get doctor data
            String selectSql = "SELECT * FROM doctor WHERE doctor_id = ?";
            try (PreparedStatement selectStmt = conn.prepareStatement(selectSql)) {
                selectStmt.setString(1, doctorId);
                ResultSet rs = selectStmt.executeQuery();

                if (rs.next()) {
                    // 2. Insert into archive with password
                    String insertSql = "INSERT INTO doctor_archive (doctor_id, first_name, last_name, email, specialty, professional_id, password) " +
                                     "VALUES (?, ?, ?, ?, ?, ?, ?)";
                    try (PreparedStatement insertStmt = conn.prepareStatement(insertSql)) {
                        insertStmt.setString(1, rs.getString("doctor_id"));
                        insertStmt.setString(2, rs.getString("first_name"));
                        insertStmt.setString(3, rs.getString("last_name"));
                        insertStmt.setString(4, rs.getString("email"));
                        insertStmt.setString(5, rs.getString("specialty"));
                        insertStmt.setString(6, rs.getString("professional_id"));
                        insertStmt.setString(7, rs.getString("password"));
                        insertStmt.executeUpdate();
                    }

                    // 3. Delete from doctors
                    String deleteSql = "DELETE FROM doctor WHERE doctor_id = ?";
                    try (PreparedStatement deleteStmt = conn.prepareStatement(deleteSql)) {
                        deleteStmt.setString(1, doctorId);
                        deleteStmt.executeUpdate();
                    }

                    conn.commit();
                    out.println("SUCCESS Doctor archived");
                } else {
                    conn.rollback();
                    out.println("ERROR Doctor not found");
                }
            }
        } catch (SQLException e) {
            try { conn.rollback(); } catch (SQLException ex) {}
            out.println("ERROR Database error: " + e.getMessage());
        } finally {
            try { conn.setAutoCommit(true); } catch (SQLException e) {}
        }
    }

    private void handleArchivePatient(String request) {
        String[] parts = request.split(" ");
        if (parts.length < 2) {
            out.println("ERROR Invalid archive request");
            return;
        }

        String patientId = parts[1];

        try {
            conn.setAutoCommit(false);

            // 1. Get patient data
            String selectSql = "SELECT * FROM patient WHERE patient_id = ?";
            try (PreparedStatement selectStmt = conn.prepareStatement(selectSql)) {
                selectStmt.setString(1, patientId);
                ResultSet rs = selectStmt.executeQuery();

                if (rs.next()) {
                    // 2. Insert into archive with password
                    String insertSql = "INSERT INTO patient_archive (patient_id, first_name, last_name, email, birth_date, social_security_number, password) " +
                                     "VALUES (?, ?, ?, ?, ?, ?, ?)";
                    try (PreparedStatement insertStmt = conn.prepareStatement(insertSql)) {
                        insertStmt.setString(1, rs.getString("patient_id"));
                        insertStmt.setString(2, rs.getString("first_name"));
                        insertStmt.setString(3, rs.getString("last_name"));
                        insertStmt.setString(4, rs.getString("email"));
                        insertStmt.setDate(5, rs.getDate("birth_date"));
                        insertStmt.setString(6, rs.getString("social_security_number"));
                        insertStmt.setString(7, rs.getString("password"));
                        insertStmt.executeUpdate();
                    }

                    // 3. Delete from patients
                    String deleteSql = "DELETE FROM patient WHERE patient_id = ?";
                    try (PreparedStatement deleteStmt = conn.prepareStatement(deleteSql)) {
                        deleteStmt.setString(1, patientId);
                        deleteStmt.executeUpdate();
                    }

                    conn.commit();
                    out.println("SUCCESS Patient archived");
                } else {
                    conn.rollback();
                    out.println("ERROR Patient not found");
                }
            }
        } catch (SQLException e) {
            try { conn.rollback(); } catch (SQLException ex) {}
            out.println("ERROR Database error: " + e.getMessage());
        } finally {
            try { conn.setAutoCommit(true); } catch (SQLException e) {}
        }
    }
}
