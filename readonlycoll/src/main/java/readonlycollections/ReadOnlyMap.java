package readonlycollections;

import java.util.Map;
import java.util.Optional;

public interface ReadOnlyMap<K, V> {

    ReadOnlySet<K> keySet();

    ReadOnlyCollection<V> values();

    boolean containsKey(K key);

    V getValue(K key);

    Optional<V> tryGetValue(K key);

    Map<K, V> asRuntimeReadOnly();
}
