package readonlycollections;

import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.Queue;

class GeneralReadOnlyQueue<T>
    extends GeneralReadOnlyCollection<T> implements ReadOnlyQueue<T> {

    public GeneralReadOnlyQueue(Queue<T> source) {

        super(source);
    }

    @Override
    public T dequeue() throws NoSuchElementException {

        Queue<T> source = getSourceAsQueue();
        return source.remove();
    }

    @Override
    public Optional<T> tryDequeue() {

        Queue<T> source = getSourceAsQueue();

        T value = source.poll();
        if (value == null)
            return Optional.empty();
        else
            return Optional.of(value);
    }

    protected final Queue<T> getSourceAsQueue() {

        return (Queue<T>) this.source;
    }
}
