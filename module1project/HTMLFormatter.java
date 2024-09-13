package module1project;


class HTMLFormatter implements Formatter {
    @Override
    public String format(String content) {
        return "<html><body>" + content + "</body></html>";
    }
}


