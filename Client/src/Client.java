

import java.util.Scanner;
import java.net.Socket;
import java.io.IOException;

/**
 * A command line client for the date server. Requires the IP address of
 * the server as the sole argument. Exits after printing the response.
 */
public class Client {
    public static void main(String[] args) throws IOException {
        if (args.length != 1) {
            System.err.println("Pass the server IP as the sole command line argument");
            return;
        }
        Socket server= new Socket(args[0], 59090);
        Scanner in= new Scanner(server.getInputStream());
        System.out.println("Server response: " + in.nextLine());
    }
}