package com.company;

public class CompressedCloudStream implements Stream{
    private Stream stream;

    public CompressedCloudStream(Stream stream) {
        this.stream = stream;
    }

    @Override
    public String write(String data) {
        String compressed = compress(data);
        return stream.write(compressed);
    }

    public String compress(String data) {
        return data + " compressed";
    }
}
