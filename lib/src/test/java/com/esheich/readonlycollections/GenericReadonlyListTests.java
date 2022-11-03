package com.esheich.readonlycollections;

import static org.assertj.core.api.Assertions.assertThat;
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
}
