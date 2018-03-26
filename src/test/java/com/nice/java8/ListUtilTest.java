package com.nice.java8;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @author Evgeny Borisov
 */
public class ListUtilTest {
    @Test
    public void countDuplicate() throws Exception {
        List<String> strings = Arrays.asList("java", "JAva", "JAVA", "scala", "groovy");
        ListUtil.countDuplicate("java", strings, String::equalsIgnoreCase);
    }

}