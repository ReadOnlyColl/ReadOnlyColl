package readonlycollections;

import java.util.Collections;
import java.util.List;

class GeneralReadOnlyList<T>
    extends GeneralReadOnlyCollection<T> implements ReadOnlyList<T> {

    public GeneralReadOnlyList(List<T> source) {

        super(source);
    }

    /**
     * get a value.
     *
     * @throws java.lang.IndexOutOfBoundsException
     */
    @Override
    public T get(int index) {

        List<T> source = getSourceAsList();
        return source.get(index);
    }

    @Override
    public List<T> asRuntimeReadOnly() {

        List<T> source = getSourceAsList();
        return Collections.unmodifiableList(source);
    }

    protected final List<T> getSourceAsList() {

        return (List<T>) this.source;
    }
}
