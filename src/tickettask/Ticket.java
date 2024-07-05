package tickettask;

public class Ticket {
    static int nextId = 1;
    private int ticketId;
    private String customerName;
    private String eventName;

    public static int getNextId() {
        return nextId;
    }

    public static void setNextId(int nextId) {
        Ticket.nextId = nextId;
    }

    public int getTicketId() {
        return ticketId;
    }

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public Ticket(String customerName, String eventName) {
        this.customerName = customerName;
        this.eventName = eventName;

        this.ticketId = nextId++;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "ticketId=" + ticketId +
                ", customerName='" + customerName + '\'' +
                ", eventName='" + eventName + '\'' +
                '}';
    }
}
