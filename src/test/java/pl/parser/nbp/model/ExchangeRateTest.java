package pl.parser.nbp.model;

import org.junit.Assert;
import org.junit.Test;

public class ExchangeRateTest {

    @Test
    public void testBuilder(){
        ExchangeRate.Builder builder = ExchangeRate.Builder.getInstance();
        builder.withBuyingRate(1.0f)
                .withCurrency(Currency.EUR)
                .withCurrencyNameString("EURO")
                .withRate(1f)
                .withSellingRate(1.1f);
        ExchangeRate rate = builder.build();
        Assert.assertEquals(1.0f, rate.getBuyingRate(), 0.0);
        Assert.assertEquals(1.1f, rate.getSellingRate(), 0.0);
        Assert.assertEquals(1f, rate.getRate(), 0.0);
        Assert.assertEquals(Currency.EUR, rate.getCurrency());
        Assert.assertEquals("EURO", rate.getCurrencyName());

    }

}