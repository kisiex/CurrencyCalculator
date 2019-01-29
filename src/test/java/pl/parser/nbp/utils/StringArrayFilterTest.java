package pl.parser.nbp.utils;

import com.google.common.collect.Lists;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.List;

public class StringArrayFilterTest {

    private final List<String> list = Lists.newArrayList("c001z180102", "h001z180102", "a001z180102", "c002z180103");

    @Test
    public void filter() {
        LocalDate date = LocalDate.of(2018, 1,2);
        Assert.assertEquals(1, StringArrayFilter.filter(list, date).size());
        Assert.assertEquals("c001z180102", StringArrayFilter.filter(list, date).get(0));

    }
}