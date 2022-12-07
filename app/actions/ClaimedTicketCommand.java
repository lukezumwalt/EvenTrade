package app.actions;

public class ClaimedTicketCommand implements Command{

    Ticket ticket;

    public ClaimedTicketCommand(Ticket ticket){
        this.ticket = ticket;
    }

    @Override
    public void execute() {
        ticket.claimedTicket(ticket.ticketId, ticket.receiptAddress);
    }
}
