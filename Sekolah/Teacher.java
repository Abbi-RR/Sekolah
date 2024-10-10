package Sekolah;

public class Teacher extends Person {
    String subject;

    public String getSubject() {
        return this.subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Teacher(){
        super();
        subject = "";
    }

    public Teacher(String subject, String name, int age) {
        super(name, age);
        this.subject = subject;
    }

    public void print() {
        super.print();
        System.out.println("Mapel Anda: " + subject);
    }

}