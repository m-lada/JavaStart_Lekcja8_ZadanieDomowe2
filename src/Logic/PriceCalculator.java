package Logic;

public class PriceCalculator {

    public static double calculatePrice(Ticket ticket) {
        double bruttoPrice = 0;
        if (ticket.getType().equals(Ticket.TICKET_ONLINE)) {
            bruttoPrice = (ticket.getPrimaryPrice() * (1 - ticket.getDiscount()));
        } else if (ticket.getType().equals(Ticket.TICKET_STANDARD)) {
            bruttoPrice = (ticket.getPrimaryPrice() * (1 - ticket.getDiscount()) + 5);
        } else if (ticket.getType().equals(Ticket.TICKET_GIFT)) {
            bruttoPrice = ((ticket.getPrimaryPrice() * (1 - ticket.getDiscount())) * 1.05 + 5);
        }
        return bruttoPrice;
    }
}
