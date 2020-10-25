package Logic.TicketsType;

import Logic.Ticket;

public class TicketOnline extends Ticket {

    public TicketOnline(String eventName, String adress, double primaryPrice, double discount) {
        super(eventName, adress, primaryPrice, discount);
        super.setType("bilet internetowy");
    }
}
