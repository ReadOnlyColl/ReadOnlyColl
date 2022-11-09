package readonlycollections;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import readonlycollections.testtool.StringArrayConverter;

public class GeneralReadOnlyCollectionTests {

    @ParameterizedTest
    @CsvSource(value = {"'a,b,c', 3", "'a,b', 2", "'a', 1", ", 0"})
    void calculate_size(
        @ConvertWith(StringArrayConverter.class) String[] source,
        int expectedSize) {

        List<String> sourceAsList = Arrays.asList(source);
        var sut = new GeneralReadOnlyCollection<String>(sourceAsList);

        int actualSize = sut.size();

        assertThat(actualSize).isEqualTo(expectedSize);
    }

    @ParameterizedTest
    @CsvSource(value = {"'a,b,c', false", ", true"})
    void is_empty(
        @ConvertWith(StringArrayConverter.class) String[] source,
        boolean expectedIsEmpty) {

        List<String> sourceAsList = Arrays.asList(source);
        var sut = new GeneralReadOnlyCollection<String>(sourceAsList);

        boolean actualIsEmpty = sut.isEmpty();

        assertThat(actualIsEmpty).isEqualTo(expectedIsEmpty);
    }

    @ParameterizedTest
    @CsvSource(value = {
        "'a,b,c', a, true", "'a,b,c', d, false", ", a, false"})
    void contain_a_given_value_if_source_has_it(
        @ConvertWith(StringArrayConverter.class) String[] source,
        String givenValue,
        boolean expectedContains) {

        List<String> sourceAsList = Arrays.asList(source);
        var sut = new GeneralReadOnlyCollection<String>(sourceAsList);

        boolean doesContain = sut.contains(givenValue);

        assertThat(doesContain).isEqualTo(expectedContains);
    }

    @Test
    void convert_to_runtime_readonly_collection() {

        var source = new ArrayList<String>();
        var sut = new GeneralReadOnlyCollection<String>(source);

        Collection<String> actualRuntimeReadOnly = sut.toRuntimeReadOnly();

        assertThatThrownBy(() -> actualRuntimeReadOnly.add("dummy"))
            .isExactlyInstanceOf(UnsupportedOperationException.class);
    }
}
