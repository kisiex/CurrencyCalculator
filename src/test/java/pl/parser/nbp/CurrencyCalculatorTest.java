package pl.parser.nbp;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.Assert.*;

public class CurrencyCalculatorTest {

    @Test
    public void prepareListOfFilesForTwoDifferentYears() {
        CurrencyCalculator calculator = new CurrencyCalculator(null, LocalDate.of(2018, 1, 1), LocalDate.of(2019, 12, 12));
        List<String> names = calculator.prepareListOfFiles();

        Assert.assertEquals(2, names.size());
        Assert.assertEquals("dir2018.txt", names.get(0));
    }

    @Test
    public void prepareListOfFilesForTheSameYear() {
        CurrencyCalculator calculator = new CurrencyCalculator(null, LocalDate.now(), LocalDate.now());
        List<String> names = calculator.prepareListOfFiles();

        Assert.assertEquals(1, names.size());
        Assert.assertEquals("dir.txt", names.get(0));
    }
}