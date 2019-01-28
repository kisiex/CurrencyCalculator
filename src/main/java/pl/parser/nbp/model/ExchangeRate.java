package pl.parser.nbp.model;

public class ExchangeRate {

    private String currencyName;
    private float rate;
    private Currency currency;
    private float buyingRate;
    private float sellingRate;

    public ExchangeRate() {
    }

    public String getCurrencyName() {
        return currencyName;
    }

    public void setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
    }

    public float getRate() {
        return rate;
    }

    public void setRate(float rate) {
        this.rate = rate;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public float getBuyingRate() {
        return buyingRate;
    }

    public void setBuyingRate(float buyingRate) {
        this.buyingRate = buyingRate;
    }

    public float getSellingRate() {
        return sellingRate;
    }

    public void setSellingRate(float sellingRate) {
        this.sellingRate = sellingRate;
    }


    public static class Builder {
        private ExchangeRate rate;

        public static Builder getInstance() {
            Builder builder = new Builder();
            builder.rate = new ExchangeRate();
            return builder;
        }

        public Builder withCurrencyNameString(String name) {
            this.rate.setCurrencyName(name);
            return this;
        }

        public Builder withRate(float rate) {
            this.rate.setRate(rate);
            return this;
        }

        public Builder withBuyingRate(float rate) {
            this.rate.setBuyingRate(rate);
            return this;
        }

        public Builder withCurrency(Currency currency) {
            this.rate.setCurrency(currency);
            return this;
        }

        public Builder withSellingRate(float rate) {
            this.rate.setSellingRate(rate);
            return this;
        }

        public ExchangeRate build() {
            return this.rate;
        }
    }
}
