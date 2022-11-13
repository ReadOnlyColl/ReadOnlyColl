package readonlycollections;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.PriorityQueue;

import org.junit.jupiter.api.Test;

public class GeneralReadOnlyQueueTests {

    @Test
    void dequeue() {

        var expectedValue = "a";
        var source = new PriorityQueue<String>();
        source.add(expectedValue);
        source.add("b");

        var sut = new GeneralReadOnlyQueue<String>(source);

        String actualElement = sut.dequeue();

        assertThat(actualElement).isEqualTo(expectedValue);
        assertThat(source).doesNotContain(expectedValue);
    }

    @Test
    void can_not_dequeue() {

        var source = new PriorityQueue<String>();
        var sut = new GeneralReadOnlyQueue<String>(source);

        Runnable dequeue = () -> sut.dequeue();

        assertThatThrownBy(dequeue::run)
            .isExactlyInstanceOf(NoSuchElementException.class);
    }

    @Test
    void try_to_get_value_if_source_has_next_value() {

        var expectedValue = "a";
        var source = new PriorityQueue<String>();
        source.add(expectedValue);
        source.add("b");

        var sut = new GeneralReadOnlyQueue<String>(source);

        Optional<String> actualValue = sut.tryDequeue();

        assertThat(actualValue.get()).isEqualTo(expectedValue);
        assertThat(source).doesNotContain(expectedValue);
    }

    @Test
    void try_to_get_empty_if_source_dosent_have_next_value() {

        var source = new PriorityQueue<String>();
        var sut = new GeneralReadOnlyQueue<String>(source);

        Optional<String> actualValue = sut.tryDequeue();

        assertThat(actualValue).isEmpty();
    }
}
