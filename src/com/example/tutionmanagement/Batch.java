package com.example.tutionmanagement;
import java.util.ArrayList;
import java.util.HashMap;
// Ye additional class create ki hai Fees ko store krne ke liye
class FeesOfBatches{
    String batch;
    String classGrade;
    int fees;
    public FeesOfBatches(String batch, String classGrade, int fees) {
        this.batch = batch;
        this.classGrade = classGrade;
        this.fees = fees;
    }
}
public class Batch {
    public static ArrayList<Student> listofStudents= new ArrayList<>();
    public static ArrayList<Teacher> listOfTeacher= new ArrayList<>();
    public static ArrayList<String> Fees= new ArrayList<>();
    public static ArrayList<String> Grade= new ArrayList<>();

    public static HashMap<String,Integer>countOfStudentsInBatches= new HashMap<>();
    public static ArrayList<FeesOfBatches> StudentFees= new ArrayList<>();
    public static ArrayList<FeesOfBatches> TeacherFees= new ArrayList<>();
    public static void setTeacher() {
        // first teacher data
        Teacher firstTeacher= new Teacher();
        firstTeacher.setName("Sujit");
        firstTeacher.setClassGrade("IX");
        firstTeacher.setSchoolName("ABC");
        firstTeacher.EnrolledSubjects.add("Physics");
        firstTeacher.EnrolledSubjects.add("Math");
        listOfTeacher.add(firstTeacher);

        // second teacher data;
        Teacher secondTeacher= new Teacher();
        secondTeacher.setName("Sachin");
        secondTeacher.setClassGrade("X");
        secondTeacher.setSchoolName("DEF");
        secondTeacher.EnrolledSubjects.add("English");
        secondTeacher.EnrolledSubjects.add("Biology");
        listOfTeacher.add(secondTeacher);

        // third teacher data
        Teacher thirdTeacher= new Teacher();
        thirdTeacher.setName("Sahil");
        thirdTeacher.setClassGrade("XI");
        thirdTeacher.setSchoolName("GHI");
        thirdTeacher.EnrolledSubjects.add("English");
        thirdTeacher.EnrolledSubjects.add("Math");
        listOfTeacher.add(thirdTeacher);

        // fourth Teacher data

        Teacher fourthTeacher= new Teacher();
        fourthTeacher.setName("Prashant");
        fourthTeacher.setClassGrade("XII");
        fourthTeacher.setSchoolName("JKL");
        fourthTeacher.EnrolledSubjects.add("Physics");
        listOfTeacher.add(fourthTeacher);


    }
    public static void setFees() {
        ArrayList<Student> myStudents= Batch.getListofStudents();

        // setting fees for Students according to the batch
        // Adding Fees structure of every class

        for(Student student: myStudents){
            // Adding Fees Structure class IX
            if(student.classGrade.equals("IX")){
                ArrayList<String> subjects= student.EnrolledSubjects;
                for(String enrollsubjects:subjects){
                    if(enrollsubjects.equals("Physics") || enrollsubjects.equals("Math")){
                        FeesOfBatches studentFees = new FeesOfBatches(enrollsubjects,student.classGrade,500);
                        StudentFees.add(studentFees);
                    }
                    else {
                        FeesOfBatches studentFees = new FeesOfBatches(enrollsubjects,student.classGrade,300);
                        StudentFees.add(studentFees);
                    }
                }
            }
            // Adding Fees Structure of Class X
            else if(student.classGrade.equals("X")){
                ArrayList<String> subjects= student.EnrolledSubjects;
                for(String enrollsubjects:subjects){
                    if(enrollsubjects.equals("Physics") || enrollsubjects.equals("Math")){
                        FeesOfBatches studentFees = new FeesOfBatches(enrollsubjects,student.classGrade,600);
                        StudentFees.add(studentFees);
                    }
                    else {
                        FeesOfBatches studentFees = new FeesOfBatches(enrollsubjects,student.classGrade,400);
                        StudentFees.add(studentFees);
                    }
                }
            }
            // Adding Fees Structure Of class XI
            else if(student.classGrade.equals("XI")){
                ArrayList<String> subjects= student.EnrolledSubjects;
                for(String enrollsubjects:subjects){
                    if(enrollsubjects.equals("Physics") || enrollsubjects.equals("Math")){
                        FeesOfBatches studentFees = new FeesOfBatches(enrollsubjects,student.classGrade,700);
                        StudentFees.add(studentFees);
                    }
                    else {
                        FeesOfBatches studentFees = new FeesOfBatches(enrollsubjects,student.classGrade,500);
                        StudentFees.add(studentFees);
                    }
                }
            }
            // Adding Fees Structure Of class XII
            else{
                ArrayList<String> subjects= student.EnrolledSubjects;
                for(String enrollsubjects:subjects){
                    if(enrollsubjects.equals("Physics") || enrollsubjects.equals("Math")){
                        FeesOfBatches studentFees = new FeesOfBatches(enrollsubjects,student.classGrade,800);
                        StudentFees.add(studentFees);
                    }
                    else {
                        FeesOfBatches studentFees = new FeesOfBatches(enrollsubjects,student.classGrade,600);
                        StudentFees.add(studentFees);
                    }
                }
            }
        }
        Fees fees= new Fees();
        fees.setListOfFeesOfStudent(StudentFees);


        //setting fees for the teachers according to the batch


        ArrayList<Teacher> myTeachers= listOfTeacher;
        for(Teacher teacher: myTeachers){
            if(teacher.classGrade.equals("IX")){
                ArrayList<String> subjects= teacher.EnrolledSubjects;
                for(String enrollsubjects:subjects){
                    if(enrollsubjects.equals("Physics") || enrollsubjects.equals("Math")){
                        FeesOfBatches studentFees = new FeesOfBatches(enrollsubjects,teacher.classGrade,300);
                        TeacherFees.add(studentFees);
                    }
                    if(enrollsubjects.equals("Biology") || enrollsubjects.equals("English"))  {
                        FeesOfBatches studentFees = new FeesOfBatches(enrollsubjects,teacher.classGrade,200);
                        TeacherFees.add(studentFees);
                    }
                }
            }
            // Adding Fees Structure of Class X
            else if(teacher.classGrade.equals("X")){
                ArrayList<String> subjects= teacher.EnrolledSubjects;
                for(String enrollsubjects:subjects){
                    if(enrollsubjects.equals("Physics") || enrollsubjects.equals("Math")){
                        FeesOfBatches studentFees = new FeesOfBatches(enrollsubjects,teacher.classGrade,400);
                        TeacherFees.add(studentFees);
                    }
                    if(enrollsubjects.equals("Biology") || enrollsubjects.equals("English"))  {
                        FeesOfBatches studentFees = new FeesOfBatches(enrollsubjects,teacher.classGrade,300);
                        TeacherFees.add(studentFees);
                    }
                }
            }
            // Adding Fees Structure Of class XI
            else if(teacher.classGrade.equals("XI")){
                ArrayList<String> subjects= teacher.EnrolledSubjects;
                for(String enrollsubjects:subjects){
                    if(enrollsubjects.equals("Physics") || enrollsubjects.equals("Math")){
                        FeesOfBatches studentFees = new FeesOfBatches(enrollsubjects,teacher.classGrade,500);
                        TeacherFees.add(studentFees);
                    }
                    if(enrollsubjects.equals("Biology") || enrollsubjects.equals("English")) {
                        FeesOfBatches studentFees = new FeesOfBatches(enrollsubjects,teacher.classGrade,400);
                        TeacherFees.add(studentFees);
                    }
                }
            }
            // Adding Fees Structure Of class XII
            else{
                ArrayList<String> subjects= teacher.EnrolledSubjects;
                for(String enrollsubjects:subjects){
                    if(enrollsubjects.equals("Physics") || enrollsubjects.equals("Math")){
                        FeesOfBatches studentFees = new FeesOfBatches(enrollsubjects,teacher.classGrade,600);
                        TeacherFees.add(studentFees);
                    }
                    if(enrollsubjects.equals("Biology") || enrollsubjects.equals("English"))  {
                        FeesOfBatches studentFees = new FeesOfBatches(enrollsubjects,teacher.classGrade,700);
                        TeacherFees.add(studentFees);
                    }
                }
            }

        }
        fees.setListOfFeesOfTeacher(TeacherFees);

    }

    public static void setGrade() {
        ArrayList<String> myGrades= new ArrayList<>();
        myGrades.add("IX");
        myGrades.add("X");
        myGrades.add("XI");
        myGrades.add("XII");
        Grade = myGrades;
    }

    public static String batch;
    static HashMap<Integer,String>batchIdMap= new HashMap<>();
    public static void setBatchId() {
        batchIdMap.put(1,"Physics");
        batchIdMap.put(2,"Math");
        batchIdMap.put(3,"English");
        batchIdMap.put(4,"Biology");
    }

    public static ArrayList<Student> getListofStudents() {
        return listofStudents;
    }

    public static ArrayList<Teacher> getTeacher() {
        return listOfTeacher;
    }

    public static ArrayList<String> getFees() {
        return Fees;
    }

    public static ArrayList<String> getGrade() {
        return Grade;
    }

    public static void setListOfStudent() {
        // first student Data
        Student firstStudent=new Student();
        firstStudent.setName("Akshay");
        firstStudent.setSchoolName("Skv");
        firstStudent.setClassGrade("IX");
        firstStudent.EnrolledSubjects.add("Physics");
        firstStudent.EnrolledSubjects.add("Math");
        firstStudent.EnrolledSubjects.add("English");
        firstStudent.EnrolledSubjects.add("Biology");
        listofStudents.add(firstStudent);

        // second student data
        Student secondStudent= new Student();
        secondStudent.setName("Abhishek");
        secondStudent.setSchoolName("DPS");
        secondStudent.setClassGrade("X");
        secondStudent.EnrolledSubjects.add("English");
        secondStudent.EnrolledSubjects.add("Math");
        secondStudent.EnrolledSubjects.add("Physics");
        listofStudents.add(secondStudent);

        // third Student Data
        Student thirdStudent= new Student();
        thirdStudent.setName("Nikhil");
        thirdStudent.setSchoolName("Govt");
        thirdStudent.setClassGrade("XII");
        thirdStudent.EnrolledSubjects.add("Biology");
        thirdStudent.EnrolledSubjects.add("Math");
        listofStudents.add(thirdStudent);
        UpdateBatchCount(listofStudents);
    }
    // Additional is used to Update the the count Of Batch
    public static void UpdateBatchCount(ArrayList<Student> listofStudents){
        for(int i=0;i<listofStudents.size();i++){
            Student currentStudent= listofStudents.get(i);
            ArrayList<String>batchOfCurrentStudent=currentStudent.EnrolledSubjects;
            for(String subject:batchOfCurrentStudent){
                if(countOfStudentsInBatches.containsKey(subject)){
                    int currentCount= countOfStudentsInBatches.get(subject);
                    countOfStudentsInBatches.put(subject,currentCount+1);
                }
                else{
                    countOfStudentsInBatches.put(subject,1);
                }
            }
        }
    }



}
