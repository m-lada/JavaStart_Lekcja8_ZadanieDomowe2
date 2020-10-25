package Logic;

public class PriceCalculator {

    public static void calculatePrice(Ticket ticket) {
        if (ticket.getType() == "bilet internetowy") {
            ticket.setFinallyPrice(ticket.getPrimaryPrice() * (1 - ticket.getDiscount()));
        } else if (ticket.getType() == "bilet standardowy") {
            ticket.setFinallyPrice(ticket.getPrimaryPrice() * (1 - ticket.getDiscount()) + 5);
        } else if (ticket.getType() == "bilet prezentowy") {
            ticket.setFinallyPrice((ticket.getPrimaryPrice() * (1 - ticket.getDiscount())) * 1.05 + 5);
        }
    }
}
