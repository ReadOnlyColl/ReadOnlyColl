package com.esheich.readonlycollections;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class GenericReadOnlyListTests {

    @Test
    void get_a_value_by_given_index() {

        var expectedValue = "b";
        var givenIndex = 1;
        var source = new ArrayList<String>();
        source.add("a");
        source.add(givenIndex, expectedValue);

        var sut = new GenericReadOnlyList<String>(source);

        String actualValue = sut.get(givenIndex);

        assertThat(actualValue).isEqualTo(expectedValue);
    }

    @Test
    void convert_to_runtime_readonly_list() {

        var source = new ArrayList<String>();
        source.add("a");
        var sut = new GenericReadOnlyList<String>(source);

        List<String> actualRuntimeReadOnly = sut.toRuntimeReadOnly();

        assertThatThrownBy(() -> actualRuntimeReadOnly.add("dummy"))
            .isExactlyInstanceOf(UnsupportedOperationException.class);
    }
}
