package assignment;

import java.util.*;

public class TicketReservationSys {
    static HashSet<String> reserved = new HashSet<>();
    static Queue<String> waiting = new LinkedList<>();
    static int available = 2;

    static void reserve(String id) {
        if (reserved.contains(id))
            throw new IllegalArgumentException("Already booked");

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

    public static void main(String[] args) {
        try {
            reserve("A101");
            reserve("A102");
            reserve("A103");
            cancel("A101");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}