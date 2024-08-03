package org.example;

public class Student implements Action{
    public Student(){
        System.out.println("Student object are created");
    }
    @Override
    public void eat() {
        System.out.println("student start eating");
    }

    @Override
    public void sleep() {
        System.out.println("student are sleeping");
    }
}
