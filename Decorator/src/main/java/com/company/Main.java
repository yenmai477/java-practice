package com.company;

public class Main {

    public static void main(String[] args) {

        // Init cloud stream
        Stream stream = new CloudStream();

        //Wrap it with encrypt
        stream = new EncryptCloudStream(stream);

        //After that wrap it with compressed

        stream = new CompressedCloudStream(stream);

        // Expected behavior compressed --> encrypt --> storing cloud

        String creaditCard = "1234-1234-1234-1234";

        System.out.println(stream.write(creaditCard));
    }

}
