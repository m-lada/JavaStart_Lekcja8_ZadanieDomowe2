package Logic.TicketsType;

import Logic.Ticket;

public class TicketGift extends Ticket {

    public TicketGift(String eventName, String adress, double primaryPrice, double discount) {
        super(eventName, adress, primaryPrice, discount);
        super.setType("bilet prezentowy");
    }
}
