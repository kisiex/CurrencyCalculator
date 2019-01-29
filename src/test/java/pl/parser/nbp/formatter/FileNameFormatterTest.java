package pl.parser.nbp.formatter;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class FileNameFormatterTest {

    @Test
    public void TestFormattingForDateWithCurrentYear() {
        Assert.assertEquals("dir.txt", FileNameFormatter.format(LocalDate.now()));
    }

    @Test
    public void TestFormattingForDateInPast(){
        Assert.assertEquals("dir2015.txt", FileNameFormatter.format(LocalDate.of(2015, 5,5)));
    }

}