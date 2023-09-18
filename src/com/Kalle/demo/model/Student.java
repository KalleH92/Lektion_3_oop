package com.Kalle.demo.model;

public class Student {

    public String name;
    public int age;
    public boolean isTired; //NEW!!

    //
    //Value = instantiation param
    public Student(String name, int age, boolean isTired) {
        this.name = name;
        this.age = age;
        this.isTired = isTired;
    }
}
