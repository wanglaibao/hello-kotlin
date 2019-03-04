package com.laibao.kotlin.chapter01;

public class PersonExampleForJavaUse {

    public static void main(String[] args) {
        PersonExample example = new PersonExample("Jack", "Miller", 21);

        System.out.println(String.format("%s, %s is %d age old", example.getFirstName(), example.getLastName(), example.getAge()));
    }

}
