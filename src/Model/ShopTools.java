package Model;

import Logic.PriceCalculator;
import Logic.Ticket;

import java.util.Scanner;

public class ShopTools {

    private Scanner input = new Scanner(System.in);
    private Shop shop = new Shop();

    public void shopsServices() {

        final int exit = 0;
        final int addTicket = 1;
        final int showTicketList = 2;
        int option = -1;

        while (option != exit) {
            System.out.println("Dostępne opcje: ");
            System.out.println(exit + " - wyjście z programu");
            System.out.println(addTicket + " - dodanie biletu");
            System.out.println(showTicketList + " - przedstawienie listy biletów");

            System.out.println("Wybierz opcję: ");
            option = input.nextInt();
            input.nextLine();

            switch (option) {
                case addTicket:
                    addTicket();
                    System.out.println("Dodano bilet: ");
                    System.out.println(shop.getTicket(Ticket.getTicketNumber()-1).getInfo());

                    System.out.println();
                    break;
                case showTicketList:
                    showTicketList();
                    System.out.println();
                    break;
                case exit:
                    System.out.println("Koniec programu");
                    System.out.println();
                    break;
                default:
                    System.out.println("Nie ma takiej opcji");
            }
        }
    }

    private void addTicket() {
        final int ticketOnline = 1;
        final int ticketStandard = 2;
        final int ticketGift = 3;

        System.out.println("Podaj nazwę wydarzenia:");
        String name = input.nextLine();
        System.out.println("Podaj adres wydarzenia:");
        String adress = input.nextLine();
        System.out.println("Podaj podstawową cenę:");
        double price = input.nextDouble();
        input.nextLine();
        System.out.println("Podaj zniżkę:");
        double discount = input.nextDouble();
        input.nextLine();

        System.out.println("Wybierz bilet: ");
        System.out.println(ticketOnline + " - bilet internetowy");
        System.out.println(ticketStandard + " - bilet standardowy");
        System.out.println(ticketGift + " - bilet prezentowy");
        int scaner = input.nextInt();
        switch (scaner) {
            case ticketOnline:
                System.out.println("Wybrano bilet online");
                shop.addTicketOnline(Ticket.getTicketNumber(), name, adress, price, discount);

                break;
            case ticketStandard:
                System.out.println("Wybrano bilet standard");
                shop.addTicketStandard(Ticket.getTicketNumber(), name, adress, price, discount);
                break;
            case ticketGift:
                System.out.println("Wybrano bilet prezentowy");
                shop.addTicketGift(Ticket.getTicketNumber(), name, adress, price, discount);
                break;
        }
        PriceCalculator.calculatePrice(shop.getTicket(Ticket.getTicketNumber()-1));
    }

    private void showTicketList() {
        System.out.println("Lista biletów:");
        for (int i = 0; i < Ticket.getTicketNumber(); i++) {
            System.out.println(shop.getTicket(i).getInfo());
        }
        System.out.println();
    }
}
