package org.example;

import Model.*;

public class Main {
    public static void main(String[] args) {

        Director d1 = new Director(new EnggStudentBuilder());
        Student s1 = d1.createStudent();

        System.out.println(s1.toString());

        d1.builder = new MBAStudentBuilder();
        Student s2 = d1.createStudent();

        System.out.println(s2.toString());


    }
}