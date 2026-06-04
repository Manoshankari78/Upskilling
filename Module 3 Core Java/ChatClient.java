import java.io.*;
import java.net.*;
public class ChatClient{
    public static void main(String[] args){
        String host="localhost";
        int port=5000;
        System.out.println("Connecting to Server at " + host + ":" + port);
        try(Socket socket=new Socket(host,port);
            BufferedReader in=new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out=new PrintWriter(socket.getOutputStream(), true);
            BufferedReader consoleInput=new BufferedReader(new InputStreamReader(System.in))){
            System.out.println("Connected successfully! Type your first message. Type 'bye' to exit.");
            String clientMessage;
            String serverResponse;
            while(true){
                System.out.print("Client (You): ");
                // read message from console and send to server
                clientMessage = consoleInput.readLine();
                if(clientMessage == null){
                    System.out.println("Console closed. Exiting.");
                    break;
                }
                out.println(clientMessage);
                if(clientMessage.equalsIgnoreCase("bye")){
                    System.out.println("Closing client connection.");
                    break;
                }
                // read server response
                serverResponse = in.readLine();
                if(serverResponse == null){
                    System.out.println("Server closed the connection.");
                    break;
                }
                System.out.println("Server: " + serverResponse);
            }
        }catch(IOException e){
            System.err.println("Client exception encountered.");
            e.printStackTrace();
        }
    }
}