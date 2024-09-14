package module1project;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CustomerFeedbackSystem feedbackSystem = new CustomerFeedbackSystem();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nCustomer Feedback System:");
            System.out.println("1. Submit Feedback");
            System.out.println("2. Review Feedback");
            System.out.println("3. Generate HTML Report");
            System.out.println("4. Generate PDF Report");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter your feedback: ");
                    String feedback = scanner.nextLine();
                    feedbackSystem.submitFeedback(feedback);
                    break;
                case 2:
                    feedbackSystem.reviewFeedback();
                    break;
                case 3:
                    Formatter htmlFormatter = new HTMLFormatter();
                    ReportFormatter htmlReport = new FeedbackReport(htmlFormatter);
                    feedbackSystem.generateFeedbackReport(htmlReport);
                    break;
                case 4:
                    Formatter pdfFormatter = new PDFFormatter();
                    ReportFormatter pdfReport = new FeedbackReport(pdfFormatter);
                    feedbackSystem.generateFeedbackReport(pdfReport);
                    break;
                case 5:
                    System.out.println("Exiting the system.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}

