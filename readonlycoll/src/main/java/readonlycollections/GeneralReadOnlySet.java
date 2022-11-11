package readonlycollections;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.stream.Stream;

public class GeneralReadOnlySet<T> implements ReadOnlySet<T> {

    private final Set<T> source;

    public GeneralReadOnlySet(Set<T> source) {

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
    public Set<T> asRuntimeReadOnly() {

        return Collections.unmodifiableSet(source);
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
}
