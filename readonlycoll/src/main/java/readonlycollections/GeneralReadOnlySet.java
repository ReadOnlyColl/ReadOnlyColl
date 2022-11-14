package readonlycollections;

import java.util.Collections;
import java.util.Set;

public class GeneralReadOnlySet<T>
    extends GeneralReadOnlyCollection<T> implements ReadOnlySet<T> {

    public GeneralReadOnlySet(Set<T> source) {

        super(source);
    }

    @Override
    public Set<T> asRuntimeReadOnly() {

        Set<T> source = getSourceAsSet();
        return Collections.unmodifiableSet(source);
    }

    protected Set<T> getSourceAsSet() {

        return (Set<T>) this.source;
    }
}
