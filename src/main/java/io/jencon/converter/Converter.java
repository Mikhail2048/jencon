package io.jencon.converter;

import io.jencon.encodings.Encoding;

public interface Converter {

    String convert(String source);

    Encoding sourceType();

    Encoding targetType();
}