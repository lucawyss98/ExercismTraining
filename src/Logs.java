public class Logs {

    public static String message(String logLine) {
       int end = logLine.indexOf(" ");
       String raw = logLine.substring(end +1);
       return raw.trim();
    }

    public static String logLevel(String logLine) {
        int end = logLine.indexOf("]");
        String level = logLine.substring(1,end);
        return level.toLowerCase();
    }

    public static String reformat(String logLine) {
        throw new UnsupportedOperationException("Please implement the (static) LogLine.reformat() method");
    }
}