package org.samsara.framework.functional;

import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Samsara Framework
 * Functional Library
 * Fold Manipulate Utils Test
 *
 * @author sczyh30
 */
public class FoldsTest {

    @Test
    public void testFoldl() throws Exception {
        List<Integer> l1 = new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        int res1 = Folds.foldl((x, y) -> x + y, 0, l1);
        int res11 = Folds.sum(l1);
        assertEquals(10, res1);
        assertEquals(10, res11);

        List<String> l2 = new LinkedList<>();
        l2.add("Java's ");
        l2.add("type system ");
        l2.add("is ");
        l2.add("fucking bad!");
        String res2 = Folds.foldl((s1, s2) -> s1 + s2, "", l2);
        assertEquals("Java's type system is fucking bad!", res2);
    }

}