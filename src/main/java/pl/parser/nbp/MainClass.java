package pl.parser.nbp;

import pl.parser.nbp.formatter.DateFormatter;
import pl.parser.nbp.model.Currency;
import pl.parser.nbp.rest.RestClient;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Arrays;


public class MainClass {

    private final static String CURRENCY_ERROR_MSG = "Given currency (%s) is invalid, correct currencies are: %s";
    private final static String DATE_ERROR_MSG = "Cannot parse date in give format, valid pattern: \"yyyy-MM-d\"";

    public static void main(String[] args) throws Exception {
        Currency currency = null;
        LocalDate startDate = null;
        LocalDate end = null;

        try {
            currency = getCurrency(args[0]);
        } catch (IllegalArgumentException e) {
            System.err.println(String.format(CURRENCY_ERROR_MSG, args[0], Arrays.toString(Currency.values())));
            System.exit(-1);
        }

        try {
            startDate = getDate(args[1]);
            end = getDate(args[2]);
        } catch (DateTimeParseException ex) {
            System.err.println(DATE_ERROR_MSG);
            System.exit(-1);
        }
        CurrencyCalculator calculator = new CurrencyCalculator(currency, startDate, end);
//        calculator.prepareData();
//        calculator.calcAverage();


//        RestClient restClient = new RestClient();

//        Document doc = restClient.loadTestDocument();
    }

    private static LocalDate getDate(String date) {
        return DateFormatter.formatDateFromString(date);
    }

    private static Currency getCurrency(String currency) {
        return Currency.valueOf(currency);
    }


}
