package com.esheich.readonlycollections;

import java.util.Iterator;
import java.util.List;

class GenericReadonlyList<T> implements ReadonlyList<T> {

    private final List<T> source;

    public GenericReadonlyList(List<T> source) {

        this.source = source;
    }

    @Override
    public Iterator<T> iterator() {

        return this.source.iterator();
    }

    @Override
    public T get(int index) {

        return this.source.get(index);
    }

    @Override
    public int size() {

        return this.source.size();
    }

    @Override
    public boolean isEmpty() {

        return this.source.isEmpty();
    }

}
