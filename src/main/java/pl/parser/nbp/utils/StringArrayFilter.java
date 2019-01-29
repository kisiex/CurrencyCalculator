package pl.parser.nbp.utils;

import pl.parser.nbp.formatter.DateFormatter;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class StringArrayFilter {

    public static List<String> filter(List<String> array, LocalDate date) {
        String parsedDate = DateFormatter.formatDateToSpecialString(date);
        return array.stream().filter(el -> el.contains("c") && el.endsWith(parsedDate)).collect(Collectors.toList());
    }

    public static List<String> filter(List<String> array, LocalDate dateFrom, LocalDate dateTo) {
        return array.stream().filter(el -> el.contains("c")
                && DateFormatter.formatDateFromSpecialString(el).isAfter(dateFrom.minusDays(1))
                && DateFormatter.formatDateFromSpecialString(el).isBefore(dateTo.plusDays(1)))
                .collect(Collectors.toList());
    }
}
