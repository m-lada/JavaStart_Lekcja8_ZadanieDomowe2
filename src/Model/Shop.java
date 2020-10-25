package Model;

import Logic.Ticket;
import Logic.TicketsType.TicketGift;
import Logic.TicketsType.TicketOnline;
import Logic.TicketsType.TicketStandard;

public class Shop {

    Ticket[] tickets = new Ticket[100];

    public Ticket[] getTickets() {
        return tickets;
    }

    public Ticket getTicket(int index) {
        return tickets[index];
    }

    public void setTickets(Ticket[] tickets) {
        this.tickets = tickets;
    }

    public void addTicketOnline(int index, String name, String adress, double price, double discount) {
        tickets[index] = new TicketOnline(name, adress, price, discount);
    }

    public void addTicketStandard(int index, String name, String adress, double price, double discount) {
        tickets[index] = new TicketStandard(name, adress, price, discount);
    }

    public void addTicketGift(int index, String name, String adress, double price, double discount) {
        tickets[index] = new TicketGift(name, adress, price, discount);
    }

}


