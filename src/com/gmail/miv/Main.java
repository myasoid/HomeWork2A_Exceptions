package com.gmail.miv;

public class Main {

    public static void main(String[] args) {

        Group group = new Group("Some group");

        for (int i = 0; i < 15; i++) {

            try {

                Student currentStudent = new Student("Name" + i, "SecondName" + i, "Some specialization");
                group.addStudent(currentStudent);
                System.out.println(currentStudent.getInfo() + " was added.");

            }catch (GroupIndexOutOfBoundsException e){

                System.out.println("I catch some exception: " + e.getMessage());

            }

        }

    }

}
