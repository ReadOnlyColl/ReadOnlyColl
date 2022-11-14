package readonlycollections;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Hashtable;

import org.junit.jupiter.api.Test;

public class ReadOnlyTests {

    @Test
    void convert_to_readonly_of_map() {

        // Arrange
        var source = new Hashtable<String, String>();

        // Act
        ReadOnlyMap<String, String> actualMap = ReadOnly.of(source);

        // Assert
        assertThat(actualMap).isInstanceOf(GeneralReadOnlyMap.class);
    }

    @Test
    void convert_to_readonly_of_collection() {

        // Arrange
        var source = new ArrayList<String>();

        // Act
        ReadOnlyCollection<String> actualCollection = ReadOnly.of(source);

        // Assert
        assertThat(actualCollection).isInstanceOf(GeneralReadOnlyCollection.class);
    }

    @Test
    void convert_to_readonly_of_list() {

        // Arrange
        var source = new ArrayList<String>();

        // Act
        ReadOnlyList<String> actualList = ReadOnly.of(source);

        // Assert
        assertThat(actualList).isInstanceOf(GeneralReadOnlyList.class);
    }

    @Test
    void convert_to_readonly_of_set() {

        // Arrange
        var source = new HashSet<String>();

        // Act
        ReadOnlySet<String> actualSet = ReadOnly.of(source);

        // Assert
        assertThat(actualSet).isInstanceOf(GeneralReadOnlySet.class);
    }
}
