package Logic.TicketsType;

import Logic.Ticket;

public class TicketStandard extends Ticket {

    public TicketStandard(String eventName, String adress, double primaryPrice, double discount) {
        super(eventName, adress, primaryPrice, discount);
        super.setType("bilet standardowy");
    }
}
