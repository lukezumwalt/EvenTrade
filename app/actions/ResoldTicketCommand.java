package app.actions;

public class ResoldTicketCommand implements Command{

    Ticket ticket;

    public ResoldTicketCommand(Ticket ticket){
        this.ticket = ticket;
    }

    @Override
    public void execute() {
        ticket.resoldTicket(ticket.ticketId, ticket.price);
    }
}
