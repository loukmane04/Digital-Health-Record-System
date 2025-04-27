package client;



public class Client {

    public static void main(String[] args) {
        openLoginFrame();
    }

    private static void openLoginFrame() {
       System.out.println("Launching Doctor dashboard...");
        new Login().setVisible(true);
    }
    
}
