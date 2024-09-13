package module1project;

class PDFFormatter implements Formatter {
    @Override
    public String format(String content) {
        return "PDF: " + content;
    }
}
