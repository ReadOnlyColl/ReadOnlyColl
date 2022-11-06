package com.esheich.readonlycollections;

import java.util.Collection;

public interface ReadOnlyCollection<T> extends Iterable<T>, Streamable<T> {

    int size();

    boolean isEmpty();

    boolean contains(T value);

    Collection<T> toRuntimeReadOnly();
}
