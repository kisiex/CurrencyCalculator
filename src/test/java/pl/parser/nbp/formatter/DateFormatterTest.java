package pl.parser.nbp.formatter;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;

public class DateFormatterTest {

    @Test
    public void testFormattingDateFromGivenStringWithDefaultPattern() {
        String date = "2019-01-29";
        LocalDate formattedDate = DateFormatter.formatDateFromString(date);

        Assert.assertEquals(2019, formattedDate.getYear());
        Assert.assertEquals(29, formattedDate.getDayOfMonth());
        Assert.assertEquals(1, formattedDate.getMonthValue());
    }

    @Test
    public void testFormattingDateFromGivenStringWithPattern() {
        String date = "2019-01-29";
        String pattern = "yyyy-MM-d";
        LocalDate formattedDate = DateFormatter.formatDateFromString(pattern, date);

        Assert.assertEquals(2019, formattedDate.getYear());
        Assert.assertEquals(29, formattedDate.getDayOfMonth());
        Assert.assertEquals(1, formattedDate.getMonthValue());
    }

    @Test(expected = DateTimeParseException.class)
    public void testFormattingDateInWrongFormatWithDefaultPattern() {
        String date = "2019/01/29";
        DateFormatter.formatDateFromString(date);
    }

    @Test(expected = DateTimeParseException.class)
    public void testFormattingDateInWrongFormatWithPattern() {
        String date = "2019/01/29";
        String pattern = "yyyy-MM-d";
        DateFormatter.formatDateFromString(pattern, date);
    }

    @Test
    public void testFormattingFromDateToStringWithDefaultPattern() {
        LocalDate date = LocalDate.parse("2019-01-29");
        Assert.assertEquals("190129", DateFormatter.formatDateToSpecialString(date));
    }

    @Test
    public void testFormattingFromDateToStringWithPattern() {
        LocalDate date = LocalDate.parse("2019-01-29");
        String pattern = "yyyy/MM/d";
        Assert.assertEquals("2019/01/29", DateFormatter.formatDateToSpecialString(pattern, date));
    }

    @Test(expected = DateTimeParseException.class)
    public void testFormattingFromInvalidDateToStringWithDefaultPattern() {
        LocalDate date = LocalDate.parse("2019-01-2941245");
        Assert.assertEquals("190129", DateFormatter.formatDateToSpecialString(date));
    }

    @Test(expected = DateTimeParseException.class)
    public void testFormattingFromInvalidDateToStringWithPattern() {
        LocalDate date = LocalDate.parse("2019-01-2941255123");
        String pattern = "yyyy/MM/d";
        Assert.assertEquals("2019/01/29", DateFormatter.formatDateToSpecialString(pattern, date));
    }
}