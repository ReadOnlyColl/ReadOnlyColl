package com.esheich.readonlycollections;

import java.util.Collections;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

class GenericReadOnlyMap<K, V> implements ReadOnlyMap<K, V> {

    private final Map<K, V> source;

    public GenericReadOnlyMap(Map<K, V> source) {

        this.source = source;
    }

    @Override
    public Set<K> keySet() {

        return this.source.keySet();
    }

    @Override
    public ReadOnlyCollection<V> values() {

        return ReadOnly.to(this.source.values());
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
    public Map<K, V> toRuntimeReadOnly() {

        return Collections.unmodifiableMap(source);
    }
}
