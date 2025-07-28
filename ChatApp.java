import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose mode (1 = Server, 2 = Client): ");
        int choice = sc.nextInt();
        sc.nextLine(); 
        if (choice == 1) {
            runServer(sc);
        } else if (choice == 2) {
            runClient(sc);
        } else {
            System.out.println("Invalid choice");
        }
    }

    // Simulated server
    public static void runServer(Scanner sc) {
        System.out.println("Server started. Type 'exit' to stop.");
        while (true) {
            System.out.print("Server: ");
            String serverMsg = sc.nextLine();
            if (serverMsg.equalsIgnoreCase("exit")) break;
            System.out.println("Client received: " + serverMsg);

            System.out.print("Client: ");
            String clientMsg = sc.nextLine();
            if (clientMsg.equalsIgnoreCase("exit")) break;
            System.out.println("Server received: " + clientMsg);
        }
    }

    // Simulated client
    public static void runClient(Scanner sc) {
        System.out.println("Client started. Type 'exit' to stop.");
        while (true) {
            System.out.print("Client: ");
            String clientMsg = sc.nextLine();
            if (clientMsg.equalsIgnoreCase("exit")) break;
            System.out.println("Server received: " + clientMsg);

            System.out.print("Server: ");
            String serverMsg = sc.nextLine();
            if (serverMsg.equalsIgnoreCase("exit")) break;
            System.out.println("Client received: " + serverMsg);
        }
    }
}
