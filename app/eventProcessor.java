package app;

import java.util.Arrays;

import app.reference.auxiliary;

public class eventProcessor {

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
    public void newEvent( String eventId, String currency ) throws Exception{

        // Up front argument checking.
        if( eventId.length() > 255 ){
            throw new Exception("ERROR: Event ID can't be longer than 255 characters.");
        }

        try{
            auxiliary.acceptedCurrencies.contains(currency);
        }catch(Exception e){
            throw new Exception("ERROR: Provided currency must be in accordance with ISO 4217.");
        }

        // Call GET Ticket Engine API: newEvent

    }

    //  updateEvent
    //      updates event's mtadata on-chain
    //      i.e., event start/end times, names, headlining acts, locations, etc
    public void updateEvent( String eventId ) throws Exception{
        // Up front argument checking.
        if( eventId.length() > 255 ){
            throw new Exception("ERROR: Event ID can't be longer than 255 characters.");
        }

        // Call GET Ticket Engine API: updateEvent
    }
    
}
