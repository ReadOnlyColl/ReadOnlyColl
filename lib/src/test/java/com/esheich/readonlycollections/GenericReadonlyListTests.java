package com.esheich.readonlycollections;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

public class GenericReadonlyListTests {

    @Test
    void get_a_value_at_given_index() {

        // Arrange
        String expectedValue = "c";
        int index = 2;

        var source = new ArrayList<String>();
        source.add("a");
        source.add("b");
        source.add(index, expectedValue);

        var sut = new GenericReadonlyList<String>(source);

        // Act
        String actualValue = sut.get(index);

        // Assert
        assertThat(actualValue).isEqualTo(expectedValue);
    }

    @Test
    void can_not_get_a_value_if_out_of_range() {

        // Arrange
        var source = new ArrayList<String>();
        source.add("a");
        source.add("b");

        int outOfRange = source.size() + 1;

        var sut = new GenericReadonlyList<String>(source);

        // Act
        Runnable getting = () -> sut.get(outOfRange);

        // Assert
        assertThatThrownBy(getting::run)
            .isExactlyInstanceOf(IndexOutOfBoundsException.class);
    }
}
