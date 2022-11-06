package com.esheich.readonlycollections;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Hashtable;

import org.junit.jupiter.api.Test;

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
}
