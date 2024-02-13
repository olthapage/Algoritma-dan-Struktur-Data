package P1;

import java.util.Scanner;

public class NilaiMahasiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("================================");
        System.out.print("Masukkan nilai tugas: ");
        double tugas = input.nextDouble();
        System.out.print("Masukkan nilai kuis: ");
        double kuis = input.nextDouble();
        System.out.print("Masukkan nilai UTS: ");
        double uts = input.nextDouble();
        System.out.print("Masukkan nilai UAS: ");
        double uas = input.nextDouble();
        System.out.println("================================");

   
        if (tugas < 0 || tugas > 100 || kuis < 0 || kuis > 100 || uts < 0 || uts > 100 || uas < 0 || uas > 100) {
            System.out.println("================================");
            System.out.println("Nilai tidak valid");
            System.out.println("================================");
            System.exit(0);
        }

        double N = 0.2 * tugas + 0.2 * kuis + 0.3 * uts + 0.3 * uas;
        String nilai_huruf;
        if (80<N && N <=100) {
            nilai_huruf = "A";
        } else if (73<N && N<=80) {
            nilai_huruf = "B+";
        } else if (65<N && N<=73) {
            nilai_huruf = "B";
        } else if (60<N && N<=65) {
            nilai_huruf = "C+";
        } else if (50<N && N<=60) {
            nilai_huruf = "C";
        } else if (39<N && N<=50) {
            nilai_huruf = "D";
        } else {
            nilai_huruf = "E";
        }
     
        System.out.println("================================");
        System.out.println("Nilai akhir: " + N);
        System.out.println("Nilai huruf: " + nilai_huruf);
        System.out.println("================================");

        System.out.println("================================");
        String keterangan = (nilai_huruf.equals("A") || nilai_huruf.equals("B+") || nilai_huruf.equals("B") || nilai_huruf.equals("C+") || nilai_huruf.equals("C") || nilai_huruf.equals("D")) ? "SELAMAT ANDA LULUS" : "MAAF ANDA TIDAK LULUS";
        System.out.println( keterangan);
        System.out.println("================================");


    }

    
    
}
