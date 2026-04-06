package assignment;

import java.util.*;

public class TicketReservationSys {
    static HashSet<String> reserved = new HashSet<>();
    static Queue<String> waiting = new LinkedList<>();
    static int available = 2;

    static void reserve(String id) {
        if (id == null || id.trim().isEmpty())
            throw new IllegalArgumentException("Ticket ID cannot be empty");

        if (reserved.contains(id) || waiting.contains(id))
            throw new IllegalArgumentException("Already booked or in waiting list");

        if (available > 0) {
            reserved.add(id);
            available--;
            System.out.println("Ticket booked for " + id);
        } else {
            if (waiting.size() >= 4)
                throw new IllegalStateException("Waiting list full");

            waiting.add(id);
            System.out.println(id + " added to waiting list");
        }
    }

    static void cancel(String id) {
        if (!reserved.remove(id))
            throw new IllegalArgumentException("Ticket not found");

        available++;
        System.out.println("Cancelled: " + id);

        if (!waiting.isEmpty()) {
            String next = waiting.poll();
            reserved.add(next);
            available--;
            System.out.println(next + " moved from waiting list");
        }
    }

    static void display() {
        System.out.println("Reserved Tickets: " + reserved);
        System.out.println("Waiting List: " + waiting);
        System.out.println("Available Seats: " + available);
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            while (true) {
                System.out.println("\n--- Ticket Reservation System ---");
                System.out.println("1. Reserve Ticket");
                System.out.println("2. Cancel Ticket");
                System.out.println("3. Display Status");
                System.out.println("4. Exit");
                System.out.print("Enter choice: ");

                int choice = sc.nextInt();
                sc.nextLine();

                try {
                    switch (choice) {
                        case 1:
                            System.out.print("Enter Ticket ID: ");
                            String reserveId = sc.nextLine();
                            reserve(reserveId);
                            break;

                        case 2:
                            System.out.print("Enter Ticket ID to cancel: ");
                            String cancelId = sc.nextLine();
                            cancel(cancelId);
                            break;

                        case 3:
                            display();
                            break;

                        case 4:
                            System.out.println("Exiting...");
                            return;

                        default:
                            throw new IllegalArgumentException("Invalid menu choice");
                    }
                } catch (Exception e) {
                    System.out.println("Error: " + e.getMessage());
                }
            }

        } catch (InputMismatchException e) {
            System.out.println("Error: Invalid input type");
        }
    }
}