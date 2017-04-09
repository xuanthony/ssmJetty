package com.test.reflect;

import com.google.common.collect.Lists;
import com.google.common.collect.Ordering;
import org.junit.Test;

import java.util.List;

/**
 * @（#）:OrderingTest
 * @description:
 * @author: xuxb 16/8/2
 * @version: Version 1.0
 */
public class OrderingTest {

    @Test
    public void testOrdering() {
        List<String> list = Lists.newArrayList();
        list.add("peida");
        list.add("jerry");
        list.add("harry");
        list.add("eva");
        list.add("jhon");
        list.add("neron");

        System.out.println("list:" + list);

        Ordering<String> naturalOrdering = Ordering.natural();
        System.out.println("naturalOrdering:" + naturalOrdering.sortedCopy(list));
    }
}
