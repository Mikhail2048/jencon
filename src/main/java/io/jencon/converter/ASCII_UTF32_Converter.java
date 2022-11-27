package io.jencon.converter;

import io.jencon.encodings.Encoding;

import java.nio.charset.StandardCharsets;

public class ASCII_UTF32_Converter implements Converter {

    @Override
    public String convert(String source) {
        byte[] bytes = source.getBytes(StandardCharsets.US_ASCII);

        for (int i = 0; i < bytes.length; i++) {

        }
    }

    @Override
    public Encoding sourceType() {
        return Encoding.US_ASCII;
    }

    @Override
    public Encoding targetType() {
        return Encoding.UTF_32;
    }
}