import java.net.*;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.io.IOException;
import java.time.Duration;
public class GitHubAPI{
    public static void main(String[] args){
        String url="https://github.com";
        HttpClient client=HttpClient.newBuilder()
        .connectTimeout(Duration.ofSeconds(10))
        .followRedirects(HttpClient.Redirect.NORMAL)
        .build();
        HttpRequest request=HttpRequest.newBuilder()
        .uri(URI.create(url))
        .timeout(Duration.ofSeconds(10))
        .header("Accept","application/json")
        .header("User-Agent","Java-11-HttpClient-App")
        .GET().build();
        System.out.println("Sending GET request to: "+url+"...");
        try{
            HttpResponse<String> res=client.send(request,HttpResponse.BodyHandlers.ofString());
            System.out.println("\n--- HTTP Response Data ---");
            System.out.println("Status Code: "+res.statusCode());
            if(res.statusCode()==20){
                System.out.println("Success! Content Body snippet:");
                String body=res.body();
                System.out.println(body.length()>200?body.substring(0,500)+"...":body);
            }else{
                System.err.println("Failed Connection! Server responded with message:\n" + res.body());
            }
        }catch(IOException e){
            System.out.println("Network I/O error occurred during transmission.");
            e.printStackTrace();
        }catch(InterruptedException e){
            System.err.println("The operational execution thread was interrupted.");
            Thread.currentThread().interrupt();
        }
    }
}