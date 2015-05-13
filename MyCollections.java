package EPAM2015_lab10;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class MyCollections {
    public static <T> void fromArrayToCollection(T[] src, Collection<T> dest) {
        for (T el : src) {
            dest.add(el);
        }
    }

    public static <T> void copyAll(Collection<? extends T> src, Collection<T> dest) {
        dest.addAll(src);
    }

    public static <T extends Comparable<? super T>> Collection<T> copyGreaterThan(Collection<T> src, T threshold) {
        List<T> list = new ArrayList<>();
        for (T el : src) {
            if (el.compareTo(threshold) > 0) {
                list.add(el);
            }
        }
        return list;
    }
}
