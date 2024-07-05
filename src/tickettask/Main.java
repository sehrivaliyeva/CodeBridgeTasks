package tickettask;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ReservationSystem reservationSystem = new ReservationSystem();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        while (running) {
            System.out.println("  Ticket System ");
            System.out.println("  1 Buy Ticket ");
            System.out.println("  2 View Tickets ");
            System.out.println("  3 Cancel Reservation ");
            System.out.println("  4 Exit ");
            System.out.println(" Select an option ");

            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.println("Enter your name");
                    String name = scanner.nextLine();
                    System.out.println("Enter event name");
                    String event = scanner.nextLine();
                    reservationSystem.buyTicket(name, event);
                    break;

                case 2:
                    reservationSystem.viewTickets();
                    break;

                case 3:
                    System.out.println("Enter ticket Id for to cancel");
                    int reservationId = scanner.nextInt();
                    reservationSystem.cancelReservation(reservationId);
                    break;


                case 4:
                    running = false;
                    System.out.println("Exit program ");
                    break;

                default:
                    System.out.println("Invalid operation !!! ");
            }

        }

        scanner.close();

    }
}
