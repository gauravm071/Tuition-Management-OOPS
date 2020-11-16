package com.example.tutionmanagement;

import java.util.ArrayList;

public class Batch {
    ArrayList<Student> listOfStudents= new ArrayList<>();
    int batchId;

    @Override
    public String toString() {
        return "Batch{" +
                "listOfStudents=" + listOfStudents +
                ", batchId=" + batchId +
                '}';
    }

    public ArrayList<Student> getListOfStudents() {
        return listOfStudents;
    }

    public void setListOfStudents(ArrayList<Student> listOfStudents) {
        this.listOfStudents = listOfStudents;
    }

    public int getBatchId() {
        return batchId;
    }

    public void setBatchId(int batchId) {
        this.batchId = batchId;
    }
}
