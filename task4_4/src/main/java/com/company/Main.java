package com.company;

public class Main {

    public static void main(String[] args) {
        new StudentWithTimer(new Student()).learn();
        new StudentStartLearn(new Student()).learn();
    }
}
