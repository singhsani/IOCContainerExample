package org.example;

public class Ram implements Action {
    public Ram(){
        System.out.println("object is created");
    }
    @Override
    public void eat() {
        System.out.println("ram eating");
    }

    @Override
    public void sleep() {
        System.out.println("ram sleeping");
    }
}
