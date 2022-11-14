package readonlycollections;

import java.util.Set;

interface ReadOnlySet<T> extends ReadOnlyCollection<T> {

    Set<T> asRuntimeReadOnly();
}
