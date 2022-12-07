package app.actions;

public class CheckedInTicketCommand implements Command{

    Ticket ticket;

    public CheckedInTicketCommand(Ticket ticket){
        this.ticket = ticket;
    }

    @Override
    public void execute() {
        ticket.checkedInTicket(ticket.ticketId);
    }
}
