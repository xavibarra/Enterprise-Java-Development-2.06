package com.ironhack.lab.clases;

public class Student {
    private String name;
    private int grade;

    public Student(String name, int grade) {
        this.name = name;
        setGrade(grade);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        if(0>grade && 100<grade) throw new IllegalArgumentException("Grade must be between 0 and 100");
        this.grade = grade;
    }



    @Override
    public String toString() {
        return "Student{" + "name= "+name + ", grade= " + grade + "}";
    }
}
