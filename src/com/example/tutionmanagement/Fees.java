package com.example.tutionmanagement;

public class Fees {
    int perStudent;
    int perTeacher;

    @Override
    public String toString() {
        return "Fees{" +
                "perStudent=" + perStudent +
                ", perTeacher=" + perTeacher +
                '}';
    }

    public int getPerStudent() {
        return perStudent;
    }

    public void setPerStudent(int perStudent) {
        this.perStudent = perStudent;
    }

    public int getPerTeacher() {
        return perTeacher;
    }

    public void setPerTeacher(int perTeacher) {
        this.perTeacher = perTeacher;
    }
}
