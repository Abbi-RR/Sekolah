package Sekolah;

import Sekolah.Teacher;

public class Student extends Person {
    int studentNumber;
    int score;
    String major;

    public int getStudentNumber() {
        return this.studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public int getScore() {
        return this.score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getMajor() {
        return this.major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
    Student() {
        super();
        major = "";
        score = 0;
        studentNumber = 0;
    }

    Student( String name, String major,int age, int studentNumber, int score) {
        super(name, age);
        this.studentNumber = studentNumber;
        this.score = score;
        this.major = major;
    }
    
    public void print() {
        super.print();
        System.out.println("Nomor Siswa Anda: " + studentNumber);
        System.out.println("Nilai: " + score);
        System.out.println("Jurusan: " + major);
    }

}