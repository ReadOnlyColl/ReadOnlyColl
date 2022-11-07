package readonlycollections;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.Hashtable;

import org.junit.jupiter.api.Test;

import readonlycollections.GenericReadOnlyCollection;
import readonlycollections.GenericReadOnlyMap;
import readonlycollections.ReadOnly;
import readonlycollections.ReadOnlyCollection;
import readonlycollections.ReadOnlyMap;

public class ReadOnlyTests {

    @Test
    void to_readonly_map() {

        // Arrange
        var source = new Hashtable<String, String>();

        // Act
        ReadOnlyMap<String, String> actualMap = ReadOnly.to(source);

        // Assert
        assertThat(actualMap).isInstanceOf(GenericReadOnlyMap.class);
    }

    @Test
    void to_readonly_collection() {

        // Arrange
        var source = new ArrayList<String>();

        // Act
        ReadOnlyCollection<String> actualMap = ReadOnly.to(source);

        // Assert
        assertThat(actualMap).isInstanceOf(GenericReadOnlyCollection.class);
    }
}
