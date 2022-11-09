package readonlycollections;

import java.util.Collections;
import java.util.List;

class GenericReadOnlyList<T>
    extends GenericReadOnlyCollection<T> implements ReadOnlyList<T> {

    public GenericReadOnlyList(List<T> source) {

        super(source);
    }

    @Override
    public T get(int index) {

        List<T> source = getSourceAsList();
        return source.get(index);
    }

    @Override
    public List<T> toRuntimeReadOnly() {

        List<T> source = getSourceAsList();
        return Collections.unmodifiableList(source);
    }

    protected List<T> getSourceAsList() {

        return (List<T>) this.source;
    }
}
