package P1;

import java.util.Scanner;

public class Array {
    public static void KonversiNilai(String MK, double nilaiAngka) {
        String nilaiHuruf;
        double bobotNilai;

        if (80<nilaiAngka && nilaiAngka<=100 ) {
            nilaiHuruf = "A";
            bobotNilai = 4;
        } else if (73<nilaiAngka && nilaiAngka<=80) {
            nilaiHuruf = "B+";
            bobotNilai = 3.5;
        } else if (65<nilaiAngka && nilaiAngka<=73) {
            nilaiHuruf = "B";
            bobotNilai = 3;
        } else if (60<nilaiAngka && nilaiAngka<=65) {
            nilaiHuruf = "C+";
            bobotNilai = 2.5;
        } else if (50<nilaiAngka && nilaiAngka<=60) {
            nilaiHuruf = "C";
            bobotNilai = 2;
        } else if (39<nilaiAngka && nilaiAngka<=50) {
            nilaiHuruf = "D";
            bobotNilai = 1;
        } else {
            nilaiHuruf = "E";
            bobotNilai = 0;
        }

        System.out.printf("%-45s%-20s%-20s%-20s%n", MK, nilaiAngka, nilaiHuruf, bobotNilai);


        
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("=====================================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("=====================================");
        String[] MK = {"Pancasila", "Teknologi Informasi", "Critical Thinking dan Problem Solving",
                        "Matematika Dasar", "Bahasa Inggris", "Dasar Pemrograman",
                        "Praktikum Dasar Pemrograman", "Keselamatan dan Kesehatan Kerja"};
        double[] nilaiAngka = new double[MK.length];

        for (int i = 0; i < MK.length; i++) {
            System.out.print("masukkan nilai Angka untuk MK " + MK[i] + ": ");
            nilaiAngka[i] = input.nextDouble();
        }

        System.out.println("=====================================");
        System.out.println("hasil Konversi Nilai");
        System.out.println("=====================================");
        System.out.printf("%-45s%-20s%-20s%-20s%n", "MK", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");

        for (int i = 0; i < MK.length; i++) {
            KonversiNilai(MK[i], nilaiAngka[i]);
        }
        
        input.close();
    }
    
}
