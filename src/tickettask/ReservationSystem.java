package tickettask;

import java.util.ArrayList;
import java.util.List;

public class ReservationSystem {
    List<Ticket> ticketList = new ArrayList<>();

    public void buyTicket(String customerName, String eventName) {
        ticketList.add(new Ticket(customerName, eventName));
    }

    public void viewTickets() {
        if (ticketList.size() != 0) {
            for (Ticket e : ticketList) {
                System.out.println("All tickets : ");
                System.out.println(e);
            }
        } else {
            System.out.println(" Tickets not found ! ");
        }
    }

    public void cancelReservation(int ticketId) {
        if (ticketList.size() != 0) {
            for (Ticket e : ticketList) {
                if (e.getTicketId() == ticketId) {
                    ticketList.remove(e);
                    System.out.println("Tickets cancel");
                    break;
                } else {
                    System.out.println(" no ticket fount this id " + ticketId);
                }
            }

        } else {
            System.out.println("Tickets not found");
        }
    }
}
