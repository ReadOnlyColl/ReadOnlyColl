package readonlycollections;

import java.util.List;

public interface ReadOnlyList<T> extends ReadOnlyCollection<T> {

    /**
     * get a value.
     * @throws java.lang.IndexOutOfBoundsException
     */
    T get(int index);

    List<T> asRuntimeReadOnly();
}
