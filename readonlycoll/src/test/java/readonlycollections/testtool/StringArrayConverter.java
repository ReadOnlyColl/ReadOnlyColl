package readonlycollections.testtool;

import org.junit.jupiter.params.converter.ArgumentConversionException;
import org.junit.jupiter.params.converter.SimpleArgumentConverter;

public class StringArrayConverter extends SimpleArgumentConverter {

    @Override
    protected Object convert(
        Object source, Class<?> targetType)
        throws ArgumentConversionException {

        if (source instanceof String
            && String[].class.isAssignableFrom(targetType)) {

            return ((String) source).split("\\s*,\\s*");
        } else if (source == null) {
            return new String[0];
        } else {

            String message = "Conversion from " + source.getClass() + " to "
                                               + targetType + " not supported.";

            throw new IllegalArgumentException(message);
        }
    }
}
