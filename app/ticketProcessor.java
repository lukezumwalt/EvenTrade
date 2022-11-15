package app;

public class ticketProcessor {

    //  newEvent MUST first be submitted to the API prior to registering a sold ticket
    //      i.e. a smart contract for the event must be deployed in order to associate tickets with it

    // necessary for eventId to be present in the ticket engine prior to ticket processing

    //  TICKET ACTIONS:
    //
    //      soldTicket:         creates an NFT ticet within the newEvent contract
    //      resoldTicket:       logs a secondary sale event on the ticket
    //      scannedTicket:      issues a non-finalising scan event on a ticket
    //                          may happen unlimited number of times, for multi-day/multi-gate events
    //      checkedInTicket:    scan event that finalizes state of ticket
    //                          for a single-gate event, check-in should be used INSTEAD of a scan
    //                          upon check-in, NFT is ready to be claimed into a user's wallet
    //      invalidatedTicket:  also finalizes ticket's lifecycle, but does not enable claiming
    //                          used for event invalidations and cancellations
    //      updateTicket:       changes NFT content URI (metadata), i.e. media file used on NFT marketplaces and wallets

    // CONSTRUCTOR
    ticketProcessor( String _network,
                     String _event,
                     String _nft )
    {
        networkName = _network;
        eventIndex = _event;
        nftIndex = _nft;
        generateNftId();
    }

    // ATTRIBUTES
    private String nftId;
    private String networkName;
    private String eventIndex;
    private String nftIndex;

    // CUSTOM METHODS
    void generateNftId(){
        nftId = networkName + '-' + eventIndex + '-' + nftIndex;
    }

    // GET TICKET ENGINE API INVOKERS
    public void soldTicket( String eventId, String ticketId, String price ){

    }

    public void updateTicket( String ticketId ){

    }

    public void resoldTicket( String ticketId, String price ){

    }

    public void scannedTicket( String ticketId ){

    }

    public void checkedInTicket( String ticketId ){

    }

    // to: blockchain wallet address of receiving entity
    public void claimedTicket( String ticketId, String to ){

    }

    public void invalidatedTicket( String ticketId ){
        
    }
}
