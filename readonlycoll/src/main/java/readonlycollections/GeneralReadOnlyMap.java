package readonlycollections;

import java.util.Collections;
import java.util.Map;
import java.util.Optional;

class GeneralReadOnlyMap<K, V> implements ReadOnlyMap<K, V> {

    private final Map<K, V> source;

    public GeneralReadOnlyMap(Map<K, V> source) {

        this.source = source;
    }

    @Override
    public ReadOnlySet<K> keySet() {

        return ReadOnly.of(this.source.keySet());
    }

    @Override
    public ReadOnlyCollection<V> values() {

        return ReadOnly.of(this.source.values());
    }

    @Override
    public boolean containsKey(K key) {

        return this.source.containsKey(key);
    }

    @Override
    public V getValue(K key) {

        return this.source.get(key);
    }

    @Override
    public Optional<V> tryGetValue(K key) {

        if (containsKey(key)) {

            V value = this.source.get(key);
            return Optional.of(value);
        } else {

            return Optional.empty();
        }
    }

    @Override
    public Map<K, V> asRuntimeReadOnly() {

        return Collections.unmodifiableMap(source);
    }
}
