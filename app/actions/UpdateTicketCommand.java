package app.actions;

public class UpdateTicketCommand implements Command{

    Ticket ticket;

    public UpdateTicketCommand(Ticket ticket){
        this.ticket = ticket;
    }

    @Override
    public void execute() {
        ticket.updateTicket(ticket.ticketId);
    }
}
