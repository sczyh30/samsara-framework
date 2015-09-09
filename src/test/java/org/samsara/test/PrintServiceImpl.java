package org.samsara.test;

import org.samsara.beans.annotation.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * PrintServiceImpl
 */
@Service("print")
public class PrintServiceImpl implements PrintService {

    @Override
    public void processData() {
        List<Integer> list = new ArrayList<>();
        list.add(137);
        list.add(-66);
        list.add(245);
        list.add(98);
        list.add(336);
        list.add(137);
        list.stream()
                .distinct()
                .filter(x -> x > 100)
                .sorted(Integer::compareTo)
                .map(x -> x * 1.5)
                .forEach(System.out::println);
    }
}
