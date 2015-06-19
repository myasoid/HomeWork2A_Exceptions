package com.gmail.miv;


public class Student extends Human {

    private String specialization;

    public Student(String name, String secondName, String specialization) {
        super(name, secondName);

        this.specialization = specialization;
    }

    @Override
    public String getInfo() {
        return "Student{" +
                "name='" + super.getName() + '\'' +
                "secondName='" + super.getSecondName() + '\'' +
                "specialization='" + specialization + '\'' +
                '}';
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
}
