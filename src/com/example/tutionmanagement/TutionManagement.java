package com.example.tutionmanagement;

import javax.imageio.plugins.tiff.BaselineTIFFTagSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class TutionManagement {
    static Scanner input= new Scanner(System.in);
    public static void getAllStudentsofthetuition(){
        ArrayList<Student>myListOfStudents= new ArrayList<>();
        myListOfStudents=Batch.getListofStudents();
        System.out.println("All the students in the tution are : " );
        for(Student student: myListOfStudents){
            System.out.print(student.Name+", ");
        }
        System.out.println();
    }    // DONE

    public static void getAllTeachersofthetuition(){
        ArrayList<Teacher>myListOfTeachers= new ArrayList<>();
        myListOfTeachers= Batch.getTeacher();
        System.out.println("All the Teachers in the tution are: ");
        for(Teacher teacher: myListOfTeachers){
            System.out.print(teacher.Name+", ");
        }
        System.out.println();
    }   //DONE

    public static void getAllStudentsOfABatch(){
           System.out.println("Enter the BatchId");
           int findbatchId= input.nextInt();
           String batch=Batch.batchIdMap.get(findbatchId);// physics
           System.out.println("Batch is -> "+batch);
           Batch myBatch= new Batch();
           ArrayList<Student> myStudents= myBatch.getListofStudents();
           for(int i=0;i<myStudents.size();i++){
               Student currentStudent= myStudents.get(i);
               ArrayList<String> batchIwant= currentStudent.EnrolledSubjects;
               if(batchIwant.contains(batch)){
                   System.out.print(currentStudent.Name+", ");
               }
           }
    }       //DONE

    public static void calculateEarnedFeeFromStudentsFromOneBatch(){
        System.out.println("Enter Your BatchId");
        int batchId= input.nextInt();
        String batch=Batch.batchIdMap.get(batchId);// physics
        System.out.println("Your Batch is : "+batch);
        int numberOfStudentInbatch= Batch.countOfStudentsInBatches.get(batch);
        System.out.println("Total number of Student who enrolled in this batch: "+ numberOfStudentInbatch);
        Fees fees= new Fees();
        int totalfees= fees.getFeesEarnedFromTheBatchOfStudent(batch);
        System.out.println("Total fees earned from this batch is :"+ totalfees);
    }   //DONE

    public static void calculateTotalEarnedFee (){
        HashMap<String, Integer> myBatches= Batch.countOfStudentsInBatches;
        int totalEarnedfees=0;
        for(String batches : myBatches.keySet()){
            String myCurbatch=batches;  // physics
            int totalNumberOfStudentInBatch= myBatches.get(myCurbatch);
            Fees fees= new Fees();
            int totalFeesFromThisBatch= fees.getFeesEarnedFromTheBatchOfStudent(myCurbatch);
            totalEarnedfees+= totalFeesFromThisBatch * totalNumberOfStudentInBatch;
        }
        System.out.println("Total Earned fees is : "+ totalEarnedfees);
    }               //DONE
    public static void paidFeeToTeacherForOneBatch(){
        ArrayList<Teacher> myTeachers= Batch.listOfTeacher;
        for(Teacher teacher:myTeachers){
            Teacher currentTeacher= teacher;
            System.out.println("Name of the Teacher: "+currentTeacher.Name);
            ArrayList<String> batchesOfThisTeacher= teacher.getEnrolledSubjects();
            System.out.println("Batches Of Teacher: "+ batchesOfThisTeacher +" ClassGrade of this teacher are: "+teacher.classGrade);
            for(String batch:batchesOfThisTeacher){
                String currentbatch= batch;
                Fees fees = new Fees();
                int totalfeeEarned = fees.getFeesEarnedFromTheBatchOfTeacher(currentbatch, teacher.classGrade);
                System.out.println("Fees earned by " +batch +" is : "+ totalfeeEarned);
            }
        }

    }
    public static void calculateTotalPaidFee(){
        ArrayList<Teacher> listOfteachers= Batch.listOfTeacher;
        for(Teacher teacher : listOfteachers){
            int totalfees=0;
            System.out.println("Name of the Teacher: "+ teacher.Name);
            ArrayList<String> batchesOfThisTeacher= teacher.getEnrolledSubjects();
            System.out.println("Subjects he teaches are : "+ batchesOfThisTeacher + " and the classGrade this Teacher is: "+ teacher.classGrade);
            int totalEarnerFeesFromThisBatch=0;
            ArrayList<FeesOfBatches> teacherFees= Batch.TeacherFees;
            for(String batches:batchesOfThisTeacher) {
                String BatchOfthisTeacher = batches;
                String ClassGradeOfThisTeacher = teacher.classGrade;
                Fees fees = new Fees();
                int totalfeeEarned = fees.getFeesEarnedFromTheBatchOfTeacher(BatchOfthisTeacher, ClassGradeOfThisTeacher);
                totalfees += totalfeeEarned;
            }
            System.out.println("Total Fees paid to this teacher is : "+ totalfees);
            System.out.println();
        }
    }

    public static void getMaxStudentBatch(){
        ArrayList<Student> myStudents= Batch.getListofStudents();
        int maxbatchsize=Integer.MIN_VALUE;
        String maxStudentBatch="";
        HashMap<String,Integer> myCountOfBatches= Batch.countOfStudentsInBatches;
        for(String batch:myCountOfBatches.keySet()){
            int currentBatchCount= myCountOfBatches.get(batch);
            if(maxbatchsize<currentBatchCount){
                maxStudentBatch=batch;
                maxbatchsize=currentBatchCount;
            }
        }
        System.out.println("Batch with maximum Students: "+maxStudentBatch);
    }       //DONE
    public static void main(String[] args){
        ArrayList<String>batches= new ArrayList<>();
        batches.add("Physics");
        batches.add("Math");
        batches.add("English");
        batches.add("Biology");
        Batch.setBatchId();
        Batch.setListOfStudent();
        Batch.setTeacher();
        Batch.setFees();
//        getAllStudentsofthetuition();
//        getAllTeachersofthetuition();
//        getMaxStudentBatch();
//        calculateEarnedFeeFromStudentsFromOneBatch();
//        calculateTotalEarnedFee();
        paidFeeToTeacherForOneBatch();
//        calculateTotalPaidFee();
    }

}
