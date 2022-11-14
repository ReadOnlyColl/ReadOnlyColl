package readonlycollections;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class GeneralReadOnlySetTests {

    @Test
    void convert_to_runtime_readonly_set() {

        // Arrange
        var source = new HashSet<String>();
        source.add("a");
        source.add("b");

        var sut = new GeneralReadOnlySet<>(source);

        // Act
        Set<String> actualRuntimeReadOnly = sut.asRuntimeReadOnly();

        // Assert
        assertThatThrownBy(() -> actualRuntimeReadOnly.add("a"))
            .isExactlyInstanceOf(UnsupportedOperationException.class);
    }
}
