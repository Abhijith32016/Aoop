package task6d;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TicketSystem {
    private Queue<String> ticketQueue;
    private Scanner scanner;
    public TicketSystem() {
        ticketQueue = new LinkedList<>();
        scanner = new Scanner(System.in);
    }
    public void addTicket() {
        System.out.print("Enter the ticket description: ");
        String ticketDescription = scanner.nextLine();
        ticketQueue.add(ticketDescription);
        System.out.println("Ticket added successfully.");
    }
    public void processTicket() {
        if (ticketQueue.isEmpty()) {
            System.out.println("No tickets to process.");
        } else {
            String ticket = ticketQueue.poll(); 
            System.out.println("Processing ticket: " + ticket);
        }
    }
    public void displayTickets() {
        if (ticketQueue.isEmpty()) {
            System.out.println("No pending tickets.");
            return;
        }
        System.out.println("Pending tickets:");
        int index = 1;
        for (String ticket : ticketQueue) {
            System.out.println(index + ": " + ticket);
            index++;
        }
    }
    public void run() {
        while (true) {
            System.out.println("\nCustomer Support Ticket System:");
            System.out.println("1. Add Ticket");
            System.out.println("2. Process Ticket");
            System.out.println("3. Display Tickets");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addTicket();
                    break;
                case 2:
                    processTicket();
                    break;
                case 3:
                    displayTickets();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
    public static void main(String[] args) {
        TicketSystem system = new TicketSystem();
        system.run();
    }
}
