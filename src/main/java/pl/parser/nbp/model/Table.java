package pl.parser.nbp.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Table {

    private String tableId;
    private LocalDate rateDate;
    private LocalDate publicationDate;
    private List<ExchangeRate> rates;

    public Table() {
        this.rates = new ArrayList<>();
    }

    public String getTableId() {
        return tableId;
    }

    public void setTableId(String tableId) {
        this.tableId = tableId;
    }

    public LocalDate getRateDate() {
        return rateDate;
    }

    public void setRateDate(LocalDate rateDate) {
        this.rateDate = rateDate;
    }

    public LocalDate getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(LocalDate publicationDate) {
        this.publicationDate = publicationDate;
    }

    public List<ExchangeRate> getRates() {
        return rates;
    }

    public void setRates(List<ExchangeRate> rates) {
        this.rates = rates;
    }


    public static class Builder {
        private Table table;

        public static Builder getInstance() {
            Builder builder = new Builder();
            builder.table = new Table();
            return builder;
        }

        public Builder withTableId(String tableId) {
            this.table.setTableId(tableId);
            return this;
        }

        public Builder withRateDate(LocalDate date) {
            this.table.setRateDate(date);
            return this;
        }

        public Builder withPublicationDate(LocalDate date) {
            this.table.setPublicationDate(date);
            return this;
        }

        public Builder appendRate(ExchangeRate rate) {
            this.table.getRates().add(rate);
            return this;
        }

        public Table build() {
            return this.table;
        }
    }
}
