package com.example.tutionmanagement;

import java.util.ArrayList;

public class Main {
    static ArrayList<Student> listOfStudents= new ArrayList<>();
    static ArrayList<Teacher> listOfTeachers= new ArrayList<>();
    static Subject subject= new Subject();
    static Grade grade= new Grade();
    static Batch batch= new Batch();
    static Fees fees= new Fees();
    static TutionCenter tutionCenter= new TutionCenter();

    public static void setFees(){
        fees.setPerStudent(1000);
        fees.setPerTeacher(700);
        tutionCenter.calculateEarnedFeefromstudentsforonebatch(fees);
        tutionCenter.paidFeeToTeacherforonebatch(fees);
    }
    public static void setStudentData(){
        grade.setBoard("CBSE");
        grade.setHasBoardExamination(true);
        grade.setShift("Morning");

        // setting student data

        subject.setClassesRequiredForSubjectPerWeek(3);
        subject.setHoursRequiredForOneClass(3);
        Student student= new Student();
        student.setName("Gaurav");
        student.setEnrolledSubjects(subject);
        student.setSchoolName("GBSSS");
        student.setClassGrade(grade);
        batch.setBatchId(1);
        listOfStudents.add(student);
        batch.setListOfStudents(listOfStudents);

    }
    public static void setTeacherData(){
        ArrayList<Subject> teacherSubjects= new ArrayList<>();
        Teacher teacher= new Teacher();
        // setting Grade
        Grade teachergrade= new Grade();
        teachergrade.setBoard("CBSE");
        teacher.setClassGrade(grade);

        //setting Subject
        Subject teachersubject= new Subject();
        teachersubject.setHoursRequiredForOneClass(3);
        teachersubject.setClassesRequiredForSubjectPerWeek(3);
        teacherSubjects.add(subject);
        teacher.setEnrolledSubjects(teacherSubjects);
        ArrayList<Experience> listOfExperiences= new ArrayList<>();
        ArrayList<Education> listOfEducations= new ArrayList<>();

        // setting Experiences
        Experience experience= new Experience();
        experience.setDuration("2 Years");
        experience.setPlaceName("ABCD");
        experience.setProfile("XYZ");
        listOfExperiences.add(experience);

        //setting education
        Education education= new Education();
        education.setCourseName("DataStructure");
        education.setDuration("4 Months");
        education.setInstitute("Pepcoding");


        listOfEducations.add(education);
        teacher.setListOfEducation(listOfEducations);
        teacher.setListOfExperience(listOfExperiences);
        teacher.setName("Krish");
        teacher.setSchoolName("GBSSS");
        listOfTeachers.add(teacher);
    }

    public static void main(String[] args) {
        setStudentData();
        setTeacherData();
        setFees();

        // functions calling
        tutionCenter.getAllStudentsofthetuition(listOfStudents);
        tutionCenter.getAllTeachersofthetuition(listOfTeachers);
        tutionCenter.getAllStudentsOfABatch(batch);
        ArrayList<Batch> listOfBatches= new ArrayList<>();
        listOfBatches.add(batch);
        tutionCenter.setListOfBatches(listOfBatches);
        tutionCenter.calculateTotalEarnedFee(fees);
        tutionCenter.calculateTotalPaidFee(listOfTeachers.size(),fees);
        tutionCenter.getMaxStudentBatch();
    }
}