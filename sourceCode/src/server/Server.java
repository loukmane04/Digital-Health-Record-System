package server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author belma
 */
public class Server {
    static final int Port = 9080;
    
    public static void main(String[] args) throws IOException {
        System.out.println("Starting the server");
        ServerSocket listener = new ServerSocket(Port);
        final String DB_URL = "jdbc:mysql://localhost:3306/medicalsystem?useSSL=false";// the data base URL
        final String USER = "root";
        final String PASS = ""; // No password is typically set in XAMPP by default

        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS)) {
            
            System.out.println("Connected to database");
            while(true){
                System.out.println("[Server ] is waitnig for the client....");
                Socket client =  listener.accept();
                System.out.println("[Server] connects to the client ");
                ClientHandler clientHandler = new ClientHandler(client , conn);
                new Thread(clientHandler).start();
        }
        } catch (SQLException e) {
        }
    }
   
}