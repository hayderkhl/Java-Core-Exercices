package com.example.javaexercices;

public class Student {

    public String name;
    public Integer note1, note2;

    public Student(String name, Integer note1, Integer note2) {
        this.name = name;
        this.note1 = note1;
        this.note2 = note2;
    }

    public float cal_moyenne() {
        return (float) (note1 + note2) / 2;
    }

    public void grade() {
         System.out.println("the grade of : " + name + " is " + cal_moyenne());
    }
}

