package app.actions;

import java.net.http.HttpRequest;

import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.Formatter;
import app.RequestFactory;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;

public class Ticket {
    public String ticketId;
    public String price;
    public String eventId;
    public String eventName;
    public String currency;
    public String receiptAddress;

    Formatter formatter = new Formatter();
    protected RequestFactory requester = new RequestFactory();

    public void soldTicket( String eventId, String ticketId, String price ) throws IOException, InterruptedException{
        // Prepare POST Request for API
        ArrayList<String> items = new ArrayList<>();
        items.add(eventId);
        items.add(eventName);
        items.add(currency);
        items.add(ticketId);
        items.add(price);
        String requestString = requester.getActionRequestString("soldTicket", items);

        HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create("https://api.playground.engine.get-blockchain.io/stream"))
            .header("accept", "application/json")
            .header("content-type", "application/json")
            .method("POST", HttpRequest.BodyPublishers.ofString(requestString))
            .build();
        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
        
    }

    public void updateTicket( String ticketId ) throws IOException, InterruptedException{
        // Prepare POST Request for API
        ArrayList<String> items = new ArrayList<>();
        items.add(eventId);
        items.add(eventName);
        items.add(currency);
        items.add(ticketId);
        String requestString = requester.getActionRequestString("updateTicket", items);

        HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create("https://api.playground.engine.get-blockchain.io/stream"))
            .header("accept", "application/json")
            .header("content-type", "application/json")
            .method("POST", HttpRequest.BodyPublishers.ofString(requestString))
            .build();
        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());

    }

    public void resoldTicket( String ticketId, String price ) throws IOException, InterruptedException{
        // Prepare POST Request for API
        ArrayList<String> items = new ArrayList<>();
        items.add(eventId);
        items.add(eventName);
        items.add(currency);
        items.add(ticketId);
        items.add(price);
        String requestString = requester.getActionRequestString("resoldTicket", items);

        HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create("https://api.playground.engine.get-blockchain.io/stream"))
            .header("accept", "application/json")
            .header("content-type", "application/json")
            .method("POST", HttpRequest.BodyPublishers.ofString(requestString))
            .build();
        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());

    }

    public void scannedTicket( String ticketId ) throws IOException, InterruptedException{
        // Prepare POST Request for API
        ArrayList<String> items = new ArrayList<>();
        items.add(eventId);
        items.add(eventName);
        items.add(currency);
        items.add(ticketId);
        String requestString = requester.getActionRequestString("scannedTicket", items);

        HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create("https://api.playground.engine.get-blockchain.io/stream"))
            .header("accept", "application/json")
            .header("content-type", "application/json")
            .method("POST", HttpRequest.BodyPublishers.ofString(requestString))
            .build();
        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());

    }

    public void checkedInTicket( String ticketId ) throws IOException, InterruptedException{
        // Prepare POST Request for API
        ArrayList<String> items = new ArrayList<>();
        items.add(eventId);
        items.add(eventName);
        items.add(currency);
        items.add(ticketId);
        String requestString = requester.getActionRequestString("checkedInTicket", items);

        HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create("https://api.playground.engine.get-blockchain.io/stream"))
            .header("accept", "application/json")
            .header("content-type", "application/json")
            .method("POST", HttpRequest.BodyPublishers.ofString(requestString))
            .build();
        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());

    }

    public void claimedTicket( String ticketId, String to ) throws IOException, InterruptedException{
        // Prepare POST Request for API
        ArrayList<String> items = new ArrayList<>();
        items.add(eventId);
        items.add(eventName);
        items.add(currency);
        items.add(ticketId);
        items.add(to);
        String requestString = requester.getActionRequestString("claimedTicket", items);

        HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create("https://api.playground.engine.get-blockchain.io/stream"))
            .header("accept", "application/json")
            .header("content-type", "application/json")
            .method("POST", HttpRequest.BodyPublishers.ofString(requestString))
            .build();
        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());

    }

    public void invalidatedTicket( String ticketId ) throws IOException, InterruptedException{
        // Prepare POST Request for API
        ArrayList<String> items = new ArrayList<>();
        items.add(eventId);
        items.add(eventName);
        items.add(currency);
        items.add(ticketId);
        String requestString = requester.getActionRequestString("invalidatedTicket", items);

        HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create("https://api.playground.engine.get-blockchain.io/stream"))
            .header("accept", "application/json")
            .header("content-type", "application/json")
            .method("POST", HttpRequest.BodyPublishers.ofString(requestString))
            .build();
        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
        
    }
}
