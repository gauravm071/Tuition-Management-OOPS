package com.example.tutionmanagement;
import java.util.ArrayList;

public class Fees {
    int feePerStudent;
    int feePerTeacher;
    public static ArrayList<FeesOfBatches> listOfFeesOfStudent = new ArrayList<>();
    public static ArrayList<FeesOfBatches> listOfFeesOfTeacher = new ArrayList<>();
    public ArrayList<FeesOfBatches> getListOfFees() {
        return listOfFeesOfStudent;
    }

    public void setListOfFeesOfStudent(ArrayList<FeesOfBatches> listOfFees) {
        this.listOfFeesOfStudent = listOfFees;
    }

    public void setListOfFeesOfTeacher(ArrayList<FeesOfBatches> listOfFees){
        this.listOfFeesOfTeacher=listOfFees;
    }
    public int getFeesEarnedFromTheBatchOfStudent(String batch){
        int totalFees=0;
        for(FeesOfBatches studentFees: listOfFeesOfStudent){
            String GradeOfCurrentStudent= studentFees.classGrade;
            String batchOfCurrentStudent= studentFees.batch;
            if(batch.equals(batchOfCurrentStudent)){
                totalFees+=studentFees.fees;
            }
        }
        return totalFees;
    }

    public int getFeesEarnedFromTheBatchOfTeacher(String batch,String Grade){
        int totalfees=0;
        for(FeesOfBatches teacher : listOfFeesOfTeacher){
            if(teacher.batch.equals(batch) && teacher.classGrade.equals(Grade)){
                totalfees+=teacher.fees;
            }
        }
        return totalfees;
    }

    public int getFeePerStudent(String classGrade, String batch) {
        for(FeesOfBatches studentFees: listOfFeesOfStudent){
            String GradeOfCurrentStudent= studentFees.classGrade;
            String batchOfCurrentStudent= studentFees.batch;
//            System.out.print(GradeOfCurrentStudent+" "+batchOfCurrentStudent+ "   /   "); System.out.println(classGrade+" "+batch);
            if((classGrade.equals(GradeOfCurrentStudent)) && (batch.equals(batchOfCurrentStudent))){
                return studentFees.fees;
            }
        }
        return -1;
    }

    public void setFeePerStudent(int feePerStudent) {

        this.feePerStudent = feePerStudent;
    }

    public int getFeePerTeacher() {
        return feePerTeacher;
    }

    public void setFeePerTeacher(int feePerTeacher) {
        this.feePerTeacher = feePerTeacher;
    }
}
