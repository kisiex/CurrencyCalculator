package pl.parser.nbp;

import pl.parser.nbp.formatter.FileNameFormatter;
import pl.parser.nbp.model.Currency;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CurrencyCalculator {

    private final Currency currency;
    private final LocalDate dateFrom;
    private final LocalDate dateTo;

    public CurrencyCalculator(Currency currency, LocalDate dateFrom, LocalDate dateTo) {
        this.currency = currency;
        this.dateFrom = dateFrom;
        this.dateTo = dateTo;
    }

    public void calc() {

    }

    public List<String> prepareListOfFiles() {
        List<String> names = new ArrayList<>();
        for (int i = dateFrom.getYear(); i <= dateTo.getYear(); i++) {
            names.add(FileNameFormatter.format(dateFrom.plusYears(dateFrom.getYear() - i)));
        }
        return names;
    }

}
