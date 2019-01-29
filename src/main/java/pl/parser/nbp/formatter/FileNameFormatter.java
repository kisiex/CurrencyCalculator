package pl.parser.nbp.formatter;

import java.time.LocalDate;

public class FileNameFormatter {

    private final static String PREFIX = "dir";
    private final static String SUFFIX = ".txt";

    public static String format(LocalDate date) {
        if (date.getYear() == LocalDate.now().getYear()){
            return PREFIX + SUFFIX;
        }
        else {
            return PREFIX + date.getYear() + SUFFIX;
        }
    }
}
