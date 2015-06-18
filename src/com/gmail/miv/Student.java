package com.gmail.miv;


public class Student extends Human {

    String specialization;

    public Student(String name, String secondName, String specialization) {
        super(name, secondName);

        this.specialization = specialization;
    }

    @Override
    public String getInfo() {
        return "Student{" +
                "name='" + super.name + '\'' +
                "secondName='" + super.secondName + '\'' +
                "specialization='" + specialization + '\'' +
                '}';
    }

}
