package Logic;

public class Ticket {
    private String eventName;
    private String adress;
    private String type;
    private double primaryPrice;
    private double finallyPrice;
    private double discount;
    private int id;
    private static int ticketNumber;

    public final static String TICKET_ONLINE = "bilet internetowy";
    public final static String TICKET_STANDARD = "bilet standardowy";
    public final static String TICKET_GIFT = "bilet prezentowy";

    public Ticket(String eventName, String adress, double primaryPrice, double discount) {
        this.eventName = eventName;
        this.adress = adress;
        this.primaryPrice = primaryPrice;
        this.discount = discount;
        ticketNumber++;
        this.id = ticketNumber;
    }

    public String getInfo() {
        return "Wydarzenie: " + eventName + ", adres: " + adress + ", typ biletu:" + type
                + ", cena podstawowa bez zniżek: " + primaryPrice + ", cena finalna: " + finallyPrice
                + ", zniżka: " + (discount*100) + "%, ID: " + id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getFinallyPrice() {
        return finallyPrice;
    }

    public void setFinallyPrice(double finallyPrice) {
        this.finallyPrice = finallyPrice;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public double getPrimaryPrice() {
        return primaryPrice;
    }

    public void setPrimaryPrice(double primaryPrice) {
        this.primaryPrice = primaryPrice;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getTicketNumber() {
        return ticketNumber;
    }
}
