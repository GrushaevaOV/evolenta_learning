package com.company;

import java.util.stream.LongStream;

public class Main {
    public static void main(String[] args) {
        System.out.println(sum(10000000,1000000000));
    }

    public static Long sum (int a, int b){
        return LongStream.range(a,b).sum();
    }
}