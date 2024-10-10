package Sekolah;

import java.util.Scanner;

public class Inputan {
    public static void main(String[] args) {
        Scanner kemil = new Scanner(System.in);

        // Dekorasi Pembuka
        System.out.println("╔══════════════════════════════════════════╗");
        System.out.println("║      Selamat Datang di Sistem Login      ║");
        System.out.println("║              Sekolah Kita                ║");
        System.out.println("╚══════════════════════════════════════════╝\n");
        
        System.out.println("╔══════════════════════════════════════════╗");
        System.out.println("║  Login Sekolah (Masukkan Angka Saja)     ║");
        System.out.println("╠══════════════════════════════════════════╣");
        System.out.println("║  1. Student                              ║");
        System.out.println("║  2. Teacher                              ║");
        System.out.println("╚══════════════════════════════════════════╝");
        System.out.print("Pilihan Anda: ");
        int pilihan = kemil.nextInt();
        
        if (pilihan == 1) {
            System.out.println("\n╔════════════════════════════════════════════╗");
            System.out.println("║     ! ANDA TELAH LOGIN SEBAGAI SISWA !     ║");
            System.out.println("║            Masukkan Data Diri Anda         ║");
            System.out.println("╚════════════════════════════════════════════╝");
            
            System.out.print("Nama Anda: ");
            String name = kemil.next();
            kemil.nextLine();  
            System.out.print("Jurusan Anda: ");
            String major = kemil.nextLine();
            System.out.print("Umur Anda: ");
            int age = kemil.nextInt();
            System.out.print("Nomor Siswa Anda: ");
            int studentNumber = kemil.nextInt();
            System.out.print("Nilai Anda: ");
            int score = kemil.nextInt();
            
            System.out.println("\n╔══════════════════════════════════════════╗");
            System.out.println("║     Data Siswa Berhasil Dimasukkan!      ║");
            System.out.println("╚══════════════════════════════════════════╝\n");
            Student student1 = new Student(name, major, age, studentNumber, score);
            student1.print();
        } else if (pilihan == 2) {
            System.out.println("\n╔══════════════════════════════════════════╗");
            System.out.println("║     Anda Login Sebagai Guru, Silakan     ║");
            System.out.println("║         Masukkan Data Diri Anda          ║");
            System.out.println("╚══════════════════════════════════════════╝");
            
            System.out.println("Apakah Anda Guru (Masukkan Angka)");
            System.out.println("╔═════════════════════╗");
            System.out.println("║  1. Full Time       ║");
            System.out.println("║  2. Part Time       ║");
            System.out.println("╚═════════════════════╝");
            int pilihanWaktu = kemil.nextInt();
            
            switch (pilihanWaktu) {
                case 1:
                    System.out.println("\n╔══════════════════════════════════════════╗");
                    System.out.println("║           Anda Adalah Guru Full Time     ║");
                    System.out.println("╚══════════════════════════════════════════╝");
                    
                    System.out.print("Nama Anda: ");
                    String name = kemil.next();
                    kemil.nextLine();  
                    System.out.print("Umur Anda: ");
                    int age = kemil.nextInt();
                    System.out.print("Mapel Yang Anda Ajar: ");
                    String subject = kemil.next();
                    kemil.nextLine();
                    System.out.print("Gaji Anda: ");
                    int salary = kemil.nextInt();
                    System.out.print("Unit (Departemen): ");
                    String unit = kemil.next();
                    kemil.nextLine();
                    
                    System.out.println("\n╔══════════════════════════════════════════════════╗");
                    System.out.println("║     Data Guru Full Time Berhasil Dimasukkan!     ║");
                    System.out.println("╚══════════════════════════════════════════════════╝\n");
                    FullTime fullTime1 = new FullTime(name, subject, unit, age, salary);
                    fullTime1.print();
                    break;

                case 2:
                    System.out.println("\n╔══════════════════════════════════════════╗");
                    System.out.println("║ Anda Adalah Guru Part Time               ║");
                    System.out.println("╚══════════════════════════════════════════╝");
                    
                    System.out.print("Nama Anda: ");
                    name = kemil.next();
                    kemil.nextLine();  
                    System.out.print("Umur Anda: ");
                    age = kemil.nextInt();
                    System.out.print("Mapel Yang Anda Ajar: ");
                    subject = kemil.next();
                    kemil.nextLine();
                    System.out.print("Berapa Jam Mengajar Anda: ");
                    int hoursworked = kemil.nextInt();
                    
                    System.out.println("\n╔══════════════════════════════════════════╗");
                    System.out.println("║     Data Guru Part Time Berhasil Dimasukkan!     ║");
                    System.out.println("╚══════════════════════════════════════════╝\n");
                    PartTime partTime1 = new PartTime(name, age, subject, hoursworked);
                    partTime1.print();
                    break;

                default:
                    System.out.println("Input salah. Silakan coba lagi.");
                    break;
            }
        } else {
            System.out.println("\n╔══════════════════════════════════════════╗");
            System.out.println("║     INPUTAN SALAH! MASUKKAN (1) / (2)    ║");
            System.out.println("╚══════════════════════════════════════════╝");
        }

        kemil.close();
    }
}
