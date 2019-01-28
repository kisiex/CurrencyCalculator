package pl.parser.nbp;

import pl.parser.nbp.model.Currency;

import java.time.LocalDate;

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

}
