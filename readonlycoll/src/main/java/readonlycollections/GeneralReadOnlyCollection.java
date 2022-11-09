package readonlycollections;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.stream.Stream;

class GeneralReadOnlyCollection<T> implements ReadOnlyCollection<T> {

    protected final Collection<T> source;

    public GeneralReadOnlyCollection(Collection<T> source) {

        this.source = source;
    }

    @Override
    public int size() {

        return this.source.size();
    }

    @Override
    public boolean isEmpty() {

        return this.source.isEmpty();
    }

    @Override
    public boolean contains(T value) {

        return this.source.contains(value);
    }

    @Override
    public Iterator<T> iterator() {

        return this.source.iterator();
    }

    @Override
    public Stream<T> stream() {

        return this.source.stream();
    }

    @Override
    public Stream<T> parallelStream() {

        return this.source.parallelStream();
    }

    @Override
    public Collection<T> toRuntimeReadOnly() {

        return Collections.unmodifiableCollection(this.source);
    }
}
