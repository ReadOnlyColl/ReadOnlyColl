package readonlycollections;

import java.util.NoSuchElementException;
import java.util.Optional;

public interface ReadOnlyQueue<T> extends ReadOnlyCollection<T> {

    T dequeue() throws NoSuchElementException;

    Optional<T> tryDequeue();
}
