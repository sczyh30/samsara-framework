package org.samsara.framework.functional;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.*;

/**
 * Samsara Framework Core
 * Functional Library
 * Either Type Test
 */
public class EitherTest {

    @Test
    public void testMkLeft() throws Exception {
        Either<String, List<Integer>> e1 = Either.mkLeft("17");
        assertEquals("17", e1.left());
    }

    @Test
    public void mkRight() throws Exception {
        Either<Integer, Double> e2 = Either.mkRight(1.96);
        assertEquals(1.96d, e2.right(), 0.1);
    }

    @Test
    public void fold() throws Exception {
        List<Integer> list = new ArrayList<>();
        list.add(16);
        list.add(33);
        Either<List<Integer>, Integer> e3 = Either.mkLeft(list);
        int res = e3.fold(r -> r.stream().
                reduce(0, (x, y) -> x + y), null);
        assertEquals(res, 49);
    }

    @Test
    public void toOption() throws Exception {
        Either<Integer, Double> e4 = Either.mkRight(1.99);
        Optional<Double> opt = e4.toOption();
        Optional<String> o2 = opt.flatMap(d -> Optional.of(d + 3))
                .map(Object::toString);
        assertEquals(o2.orElse("FUCK"), "4.99");
    }

}