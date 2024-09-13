package module1project;

class FeedbackReport implements ReportFormatter {
    private Formatter formatter;

    public FeedbackReport(Formatter formatter) {
        this.formatter = formatter;
    }

    @Override
    public void generateReport(String content) {
        String formattedContent = formatter.format(content);
        System.out.println("Feedback Report: " + formattedContent);
    }
}
