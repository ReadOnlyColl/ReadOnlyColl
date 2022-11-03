package com.esheich.readonlycollections;

import java.util.List;

public class ReadonlyCollections {

    public static <T> ReadonlyList<T> of(List<T> source) {

        return new GenericReadonlyList<>(source);
    }
}
