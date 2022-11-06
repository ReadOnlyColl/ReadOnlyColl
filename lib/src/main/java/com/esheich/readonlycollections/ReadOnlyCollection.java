package com.esheich.readonlycollections;

public interface ReadOnlyCollection<T> extends Iterable<T>, Streamable<T> {

    int size();

    boolean isEmpty();

    boolean contains(T value);
}
