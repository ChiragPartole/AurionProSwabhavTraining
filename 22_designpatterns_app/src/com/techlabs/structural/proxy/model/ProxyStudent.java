package com.techlabs.structural.proxy.model;

public class ProxyStudent implements IStudent {
    private Student student;
    private String name;
    private int rollNumber;

    public ProxyStudent(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
        System.out.println("This is constructor of proxy student");
    }

    @Override
    public void getDetails() {
        if (student == null) {
        	student = new Student(name, rollNumber);
        }
        student.getDetails();
    }
}