package java04;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;


public class httpex {
    // record todo (
    //     int userId,
    //     int id,
    //     String title,
    //     boolean completed
    // ) {}
    private static final String URL = "https://jsonplaceholder.typicode.com/todos/1";
    public static void main(String[] args) {
        // 1. create a client instance
        HttpClient client = HttpClient.newBuilder()
                                .connectTimeout(Duration.ofSeconds(10))
                                .build();
        // 2. build the http req
        HttpRequest req = HttpRequest.newBuilder()
                                .uri(URI.create(URL))
                                .GET() // optional bydefault is GET
                                .build();
        // 3. send the req sync map the body to the string
        try {
            HttpResponse<String> res = client.send(req, HttpResponse.BodyHandlers.ofString());

            System.out.println("Status Code: " + res.statusCode()); // 200 - OK
            System.out.println("Response Body: " + res.body());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
    }
}
