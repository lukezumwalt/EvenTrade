// SOURCE FOR API REQUESTS: https://docs.get-protocol.io/reference/ticket-engine-api-stream

package app;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.Formatter;

import app.reference.auxiliary;

public class eventProcessor {

    Formatter formatter = new Formatter();
    protected RequestFactory requester = new RequestFactory();

    // event actions are unbilled and will not charge an account for gas

    //  eventId
    //      unique client-side generated ID
    //      max of 255 characters
    //      used for model-intrinsic categorization of the event a smart contract applies to
    private String eventId;

    //  newEvent
    //      queues transaction to create a new smart contract on the blockchain
    //      gives each event own namespaces collection and separate address
    //      ALL NFT tickets for this event will belong to THIS smart contract generated via newEvent
    public void newEvent( String _eventId, String _eventName, String _currency ) throws Exception{

        // Up front argument checking.
        if( eventId.length() > 255 ){
            throw new Exception("ERROR: Event ID can't be longer than 255 characters.");
        }

        try{
            auxiliary.acceptedCurrencies.contains(_currency);
        }catch(Exception e){
            throw new Exception("ERROR: Provided currency must be in accordance with ISO 4217.");
        }

        // Prepare POST Request for API
        ArrayList<String> items = new ArrayList<>();
        items.add(_eventId);
        items.add(_eventName);
        items.add(_currency);
        String requestString = requester.getActionRequestString("newEvent", items);

        // Call GET Ticket Engine API: newEvent
        HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create("https://api.playground.engine.get-blockchain.io/stream"))
            .header("accept", "application/json")
            .header("content-type", "application/json")
            .method("POST", HttpRequest.BodyPublishers.ofString(requestString))
            .build();
        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
    }

    //  updateEvent
    //      updates event's mtadata on-chain
    //      i.e., event start/end times, names, headlining acts, locations, etc
    public void updateEvent( String _eventId, String _eventName ) throws Exception{
        // Up front argument checking.
        if( eventId.length() > 255 ){
            throw new Exception("ERROR: Event ID can't be longer than 255 characters.");
        }

        // Prepare POST Request for API
        ArrayList<String> items = new ArrayList<>();
        items.add(_eventId);
        items.add(_eventName);
        String requestString = requester.getActionRequestString("updateEvent", items);

        // Call GET Ticket Engine API: updateEvent
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
