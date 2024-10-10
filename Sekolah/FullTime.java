package Sekolah;

public class FullTime extends Teacher {
    String unit;
    int salary;

    public String getUnit() {
        return this.unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public int getSalary() {
        return this.salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public FullTime() {
        super();
        unit = "";
        salary = 0;
    }

    public FullTime(String name, String subject, String unit, int age, int salary) {
        super(subject, name, age);
        this.unit = unit;
        this.salary = salary;
    }

    public void print() {
        super.print();
        System.out.println("------------------");
        System.out.println("Unit anda: " + unit);
        System.out.println("Gaji Anda: " + salary);
        System.out.println("------------------");
    }

}