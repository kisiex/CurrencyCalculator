package pl.parser.nbp.model;

import org.junit.Assert;
import org.junit.Test;
import pl.parser.nbp.formatter.DateFormatter;

public class TableTest {

    @Test
    public void builderTest(){
        Table.Builder builder = Table.Builder.getInstance();
        builder.withPublicationDate(DateFormatter.formatDateFromString("2019-01-28"))
                .withTableId("1")
                .withRateDate(DateFormatter.formatDateFromString("2019-01-29"));
        Table table = builder.build();
        Assert.assertEquals(0, table.getRates().size());
        Assert.assertEquals("1", table.getTableId());
        Assert.assertEquals("190128", DateFormatter.formatDateToSpecialString(table.getPublicationDate()));
        Assert.assertEquals("190129", DateFormatter.formatDateToSpecialString(table.getRateDate()));
    }

}