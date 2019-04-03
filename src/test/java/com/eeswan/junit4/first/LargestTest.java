package com.eeswan.junit4.first;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
public class LargestTest {

    @Test
    public void largest() {
        assertSame(9, Largest.largest(new int[] {7, 9, 8}));
        assertSame(9, Largest.largest(new int[] {7, 8, 9}));
        assertSame(9, Largest.largest(new int[] {9, 7, 9, 8}));
        assertSame(1, Largest.largest(new int[] {1}));
        assertSame(-7, Largest.largest(new int[] {-9, -8, -7}));
    }

    @Test
    public void testEmpty() {
        try {
            Largest.largest(new int[] {});
            fail("예외처리를 해야 한다.");
        } catch (RuntimeException e) {
            assertTrue(true);
        }
    }
}