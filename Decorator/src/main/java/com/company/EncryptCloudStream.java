package com.company;

public class EncryptCloudStream implements Stream{
    private Stream stream;

    public EncryptCloudStream(Stream stream) {
        this.stream = stream;
    }

    @Override
    public String write(String data) {
        String encrypted = encrypt(data);
        return stream.write(encrypted);
    }

    public String encrypt(String data) {
        return data + "@#$%!_^&#_%^";
    }
}
