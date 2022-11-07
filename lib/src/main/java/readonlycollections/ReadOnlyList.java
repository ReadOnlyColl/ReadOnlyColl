package readonlycollections;

import java.util.List;

public interface ReadOnlyList<T> extends ReadOnlyCollection<T> {

    T get(int indext);

    List<T> toRuntimeReadOnly();
}
