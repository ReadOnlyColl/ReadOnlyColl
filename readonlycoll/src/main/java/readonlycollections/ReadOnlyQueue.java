package readonlycollections;

import java.util.Optional;

public interface ReadOnlyQueue<T> extends ReadOnlyCollection<T> {

    /**
     * Dequeue.
     *
     * @return value
     *
     * @throws java.util.NoSuchElementException
     *
     */
    T dequeue();

    Optional<T> tryDequeue();
}
