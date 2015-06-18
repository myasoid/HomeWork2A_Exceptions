package com.gmail.miv;


public class Group {

    static int SIZE_OF_GROUP = 10;

    private String description;
    private int lenth = 0;
    Student[] students = new Student[SIZE_OF_GROUP];

    public Group(String description) {
        this.description = description;
    }

    public void addStudent(Student student) throws GroupIndexOutOfBoundsException {

        try {

            students[lenth] = student;
            lenth++;

        } catch (ArrayIndexOutOfBoundsException e) {

            throw new GroupIndexOutOfBoundsException("Exception <GroupIndexOutOfBoundsException> Group.addStudent: " +
                    student.getInfo() + " wasn't added.");

        } catch (Exception e) {

            throw new GroupIndexOutOfBoundsException("Exception <Some other exception> Group.addStudent: " +
                    student.getInfo() + " wasn't added.");

        }

    }

}
