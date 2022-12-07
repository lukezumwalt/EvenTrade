package app.actions;

public class SoldTicketCommand implements Command{

    Ticket ticket;

    public SoldTicketCommand(Ticket ticket){
        this.ticket = ticket;
    }

    @Override
    public void execute() {
        ticket.soldTicket(ticket.eventId, ticket.ticketId, ticket.price);
    }
}
