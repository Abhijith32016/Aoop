package module1project;

import java.util.ArrayList;
import java.util.List;

class CustomerFeedbackSystem {
    private List<String> feedbackList = new ArrayList<>();

    public void submitFeedback(String feedback) {
        feedbackList.add(feedback);
        System.out.println("Feedback submitted: " + feedback);
    }

    public List<String> getFeedbackList() {
        return feedbackList;
    }

    public void reviewFeedback() {
        System.out.println("Reviewing feedback...");
        for (String feedback : feedbackList) {
            System.out.println("Reviewing: " + feedback);
        }
    }

    public void generateFeedbackReport(ReportFormatter reportFormatter) {
        StringBuilder reportContent = new StringBuilder();
        for (String feedback : feedbackList) {
            reportContent.append(feedback).append("\n");
        }
        reportFormatter.generateReport(reportContent.toString());
    }
}
