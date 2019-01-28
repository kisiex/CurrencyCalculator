package pl.parser.nbp.formatter;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class DateFormatter {

    private final static String INPUT_PATTERN = "yyyy-MM-d";
    private final static String OUTPUT_PATTERN = "YYMMDD";

    public static LocalDate formatDateFromString(String date) {
        return formatDateFromString(INPUT_PATTERN, date);
    }

    public static LocalDate formatDateFromString(String pattern, String date) {
        return LocalDate.parse(date, DateTimeFormatter.ofPattern(pattern));
    }

    public static String formatDateToSpecialString(LocalDate date){
        return formatDateToSpecialString(OUTPUT_PATTERN, date);
    }

    public static String formatDateToSpecialString(String pattern, LocalDate date){
        return date.format(DateTimeFormatter.ofPattern(pattern));
    }
}
