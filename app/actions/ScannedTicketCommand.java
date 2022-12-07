package app.actions;

public class ScannedTicketCommand implements Command{

    Ticket ticket;

    public ScannedTicketCommand(Ticket ticket){
        this.ticket = ticket;
    }

    @Override
    public void execute() {
        ticket.scannedTicket(ticket.ticketId);
    }
}
