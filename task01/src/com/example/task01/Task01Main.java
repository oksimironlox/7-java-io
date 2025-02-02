package com.example.task01;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class Task01Main {
    public static void main(String[] args) throws IOException {

        System.out.println(checkSumOfStream(new ByteArrayInputStream(new byte[]{0x33, 0x45, 0x01})));

    }


    //C[n+1]=rotateLeft(C[n]) xor b[n+1]
    public static int checkSumOfStream(InputStream inputStream) throws IOException {
        if(inputStream == null) throw new IllegalArgumentException();
        int sum = 0;
        int length = inputStream.read();
        while (length != -1){
            sum = Integer.rotateLeft(sum, 1) ^ length;
            length = inputStream.read();
        }
        return sum;
    }
}
