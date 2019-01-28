package pl.parser.nbp.formatter;

public class PathFormatter implements Formatter {

    private final static String PREFIX = "c";
    private final static String INFIX = "z";
    private final static String SUFFIX = ".xml";


    @Override
    public String format(String prefix, String text) {
        StringBuilder builder = new StringBuilder();
        builder.append(PREFIX);
        if (prefix != null) {
            builder.append(prefix);
        }
        builder.append(INFIX);
        if (text != null) {
            builder.append(text);
        }
        return builder.append(SUFFIX).toString();
    }
}
