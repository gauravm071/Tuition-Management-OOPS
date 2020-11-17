package com.example.tutionmanagement;

import java.util.ArrayList;

public class TutionCenter {

    ArrayList<Batch> listOfBatches = new ArrayList<>();
    public ArrayList<Batch> getListOfBatches() {
        return listOfBatches;
    }

    public void setListOfBatches(ArrayList<Batch> listOfBatches) {

        this.listOfBatches = listOfBatches;
    }

    public void getAllStudentsofthetuition(ArrayList<Student> listOfStudents) {

        ArrayList<Student> myStudents = listOfStudents;
        String student = myStudents.toString();
        System.out.println(student);
    }

    public void getAllTeachersofthetuition(ArrayList<Teacher> teacher) {
       String myTeacher= teacher.toString();
        System.out.println(myTeacher);
    }

    public void getAllStudentsOfABatch(Batch batch) {
        System.out.println(batch.toString());
    }

    public void calculateEarnedFeefromstudentsforonebatch(Fees fees) {
        System.out.println("Fees per student: "+fees.getPerStudent());
    }

    public void calculateTotalEarnedFee(Fees fees) {
        int numberOfbatches= listOfBatches.size();
        int numberOfStudents= 0;
        for(Batch batch: listOfBatches){
            Batch currentBatch= batch;
            numberOfStudents+=currentBatch.getListOfStudents().size();
        }
        int totalEarnedFee= numberOfStudents* fees.getPerStudent();
        System.out.println("total Earned fees is : "+ totalEarnedFee);

    }

    public void paidFeeToTeacherforonebatch(Fees fees) {
        System.out.println("fees paid to the teacher: "+ fees.getPerTeacher());
    }

    public void calculateTotalPaidFee(int totalNumberOfTeachers, Fees fees) {
        int totalPaidFee= totalNumberOfTeachers * fees.getPerTeacher();
        System.out.println("Total paid fees :" + totalPaidFee);
    }

    public void getMaxStudentBatch() {
        int maxStudentBatch=Integer.MIN_VALUE;
        Batch batchWithMaximumStudents=null;
        for(Batch batch : listOfBatches){
            int currentBatchSize= batch.getListOfStudents().size();
            if(maxStudentBatch<currentBatchSize){
                maxStudentBatch=currentBatchSize;
                batchWithMaximumStudents=batch;
            }
        }
        System.out.println("Batch with maximum students :"+ batchWithMaximumStudents);
    }
}
