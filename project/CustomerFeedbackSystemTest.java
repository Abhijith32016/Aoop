package module1project;
import java.util.List;

public class CustomerFeedbackSystemTest {

    @Test
    public void testFeedbackSubmission() {
        CustomerFeedbackSystem feedbackSystem = new CustomerFeedbackSystem();
        feedbackSystem.submitFeedback("Great service!");

        List<String> feedbackList = feedbackSystem.getFeedbackList();
        assertEquals(1, feedbackList.size());
        assertEquals("Great service!", feedbackList.get(0));
    }

    private void assertEquals(String string, String string2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'assertEquals'");
    }

    private void assertEquals(int i, int j) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'assertEquals'");
    }

    @Test
    public void testHTMLFeedbackReport() {
        CustomerFeedbackSystem feedbackSystem = new CustomerFeedbackSystem();
        feedbackSystem.submitFeedback("Great service!");
        feedbackSystem.submitFeedback("Needs improvement.");

        Formatter htmlFormatter = new HTMLFormatter();
        ReportFormatter reportFormatter = new FeedbackReport(htmlFormatter);

        java.io.ByteArrayOutputStream outContent = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(outContent));

        feedbackSystem.generateFeedbackReport(reportFormatter);

        String expected = "<html><body>Great service!\nNeeds improvement.\n</body></html>";
        assertEquals("Feedback Report: " + expected + System.lineSeparator(), outContent.toString());
    }

    @Test
    public void testPDFFeedbackReport() {
        CustomerFeedbackSystem feedbackSystem = new CustomerFeedbackSystem();
        feedbackSystem.submitFeedback("Excellent experience!");

        Formatter pdfFormatter = new PDFFormatter();
        ReportFormatter reportFormatter = new FeedbackReport(pdfFormatter);

        java.io.ByteArrayOutputStream outContent = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(outContent));

        feedbackSystem.generateFeedbackReport(reportFormatter);

        String expected = "PDF: Excellent experience!\n";
        assertEquals("Feedback Report: " + expected + System.lineSeparator(), outContent.toString());
    }
}

