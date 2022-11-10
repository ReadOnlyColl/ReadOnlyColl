package readonlycollections;

import java.util.Map;
import java.util.Optional;
import java.util.Set;

public interface ReadOnlyMap<K, V> {

    // TODO: replace to ReadOnlySet
    Set<K> keySet();

    ReadOnlyCollection<V> values();

    boolean containsKey(K key);

    V getValue(K key);

    Optional<V> tryGetValue(K key);

    Map<K, V> asRuntimeReadOnly();
}
