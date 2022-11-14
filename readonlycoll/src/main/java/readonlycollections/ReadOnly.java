package readonlycollections;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

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

    public static <T> ReadOnlyQueue<T> of(Queue<T> source) {

        return new GeneralReadOnlyQueue<>(source);
    }

    public static <T> ReadOnlySet<T> of(Set<T> source) {

        return new GeneralReadOnlySet<>(source);
    }
}
