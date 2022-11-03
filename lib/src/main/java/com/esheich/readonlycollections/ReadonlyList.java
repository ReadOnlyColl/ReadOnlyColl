package com.esheich.readonlycollections;

public interface ReadonlyList<T> extends Iterable<T> {

    T get(int index);

    int size();

    boolean isEmpty();
}
