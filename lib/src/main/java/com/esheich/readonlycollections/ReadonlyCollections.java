package com.esheich.readonlycollections;

import java.util.Map;

public class ReadOnlyCollections {

    public static <K, V> ReadOnlyMap<K, V> to(Map<K, V> source) {

        return new GenericReadOnlyMap<>(source);
    }
}
