import java.io.*;
import java.net.*;
public class ChatServer{
    public static void main(String[] args){
        int port=5000;
        System.out.println("Starting chat server on port "+port);
        try(ServerSocket serverSocket=new ServerSocket(port);
            Socket clientSocket=serverSocket.accept();
            BufferedReader in=new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            PrintWriter out=new PrintWriter(clientSocket.getOutputStream(), true);
            BufferedReader consoleInput=new BufferedReader(new InputStreamReader(System.in))){
            System.out.println("Client connected! Start chatting. Type 'bye' to exit.");
            String clientMessage;
            String serverResponse;
            while(true){
                clientMessage = in.readLine();
                if(clientMessage == null){
                    System.out.println("Client closed the connection.");
                    break;
                }
                if(clientMessage.equalsIgnoreCase("bye")){
                    System.out.println("Client requested to end chat.");
                    break;
                }
                System.out.println("Client: "+clientMessage);
                System.out.print("Server (You): ");
                serverResponse = consoleInput.readLine();
                if(serverResponse == null){
                    System.out.println("Console input closed. Shutting down server.");
                    break;
                }
                out.println(serverResponse);
                if(serverResponse.equalsIgnoreCase("bye")){
                    System.out.println("Closing Server connection...");
                    break;
                }
            }
        }catch(IOException e){
            System.err.println("Server exception encountered.");
            e.printStackTrace();
        }
    }
}