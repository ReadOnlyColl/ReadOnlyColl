package readonlycollections;

import java.util.stream.Stream;

public interface Streamable<T> {

    Stream<T> stream();

    Stream<T> parallelStream();
}
