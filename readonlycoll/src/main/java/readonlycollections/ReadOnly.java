package readonlycollections;

import java.util.Collection;
import java.util.List;
import java.util.Map;

public class ReadOnly {

    public static <K, V> ReadOnlyMap<K, V> of(Map<K, V> source) {

        return new GeneralReadOnlyMap<>(source);
    }

    public static <T> ReadOnlyCollection<T> of(Collection<T> source) {

        return new GeneralReadOnlyCollection<>(source);
    }

    public static <T> ReadOnlyList<T> of(List<T> source) {

        return new GeneralReadOnlyList<>(source);
    }
}