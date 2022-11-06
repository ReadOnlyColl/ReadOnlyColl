package com.esheich.readonlycollections;

import java.util.Collection;
import java.util.Map;

public class ReadOnly {

    public static <K, V> ReadOnlyMap<K, V> to(Map<K, V> source) {

        return new GenericReadOnlyMap<>(source);
    }

    public static <T> ReadOnlyCollection<T> to(Collection<T> source) {

        return new GenericReadOnlyCollection<>(source);
    }
}
