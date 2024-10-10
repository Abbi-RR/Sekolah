package Sekolah;

public class PartTime extends Teacher {
    protected int hoursworked;
    protected int salary;

    public int getHouseworked() {
        return this.hoursworked;
    }

    public void setHouseworked(int houseworked) {
        this.hoursworked = houseworked;
    }

    public int getSalary() {
        return this.salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public PartTime(){
        super();
        hoursworked = 0;
        salary = 0;
    }

    public PartTime(String name, int age, String subject, int hoursworked) {
        super(subject, name, age);
        this.hoursworked = hoursworked;
    }

    public int salary(int a){
        int salary = a * 100000;
        return salary;
    }
    
    public void print(){
        super.print();
        System.out.println("Kerja Selama?: "+ hoursworked);
        System.out.println("Gaji: "+ salary);

    }
}