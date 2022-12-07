package app.actions;

public class InvalidatedTicketCommand implements Command{

    Ticket ticket;

    public InvalidatedTicketCommand(Ticket ticket){
        this.ticket = ticket;
    }

    @Override
    public void execute() {
        ticket.invalidatedTicket(ticket.ticketId);
    }
}
