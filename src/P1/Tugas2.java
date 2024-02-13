package P1;

import java.util.Scanner;

public class Tugas2 {
    public static double hitungKecepatan(double jarak, double waktu) {
        return jarak / waktu;
    }

    public static double hitungJarak(double kecepatan, double waktu) {
        return kecepatan * waktu;
    }

    public static double hitungWaktu(double jarak, double kecepatan) {
        return jarak / kecepatan;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Menu:");
        System.out.println("1. Hitung Kecepatan");
        System.out.println("2. Hitung Jarak");
        System.out.println("3. Hitung Waktu");
        System.out.print("Pilih menu (1/2/3): ");
        int pilihan = scanner.nextInt();

        double kecepatan, jarak, waktu;

        switch (pilihan) {
            case 1:
                System.out.print("Masukkan jarak (km): ");
                jarak = scanner.nextDouble();
                System.out.print("Masukkan waktu (jam): ");
                waktu = scanner.nextDouble();
                kecepatan = hitungKecepatan(jarak, waktu);
                System.out.println("Kecepatan: " + kecepatan + " km/jam");
                break;
            case 2:
                System.out.print("Masukkan kecepatan (km/jam): ");
                kecepatan = scanner.nextDouble();
                System.out.print("Masukkan waktu (jam): ");
                waktu = scanner.nextDouble();
                jarak = hitungJarak(kecepatan, waktu);
                System.out.println("Jarak: " + jarak + " km");
                break;
            case 3:
                System.out.print("Masukkan jarak (km): ");
                jarak = scanner.nextDouble();
                System.out.print("Masukkan kecepatan (km/jam): ");
                kecepatan = scanner.nextDouble();
                waktu = hitungWaktu(jarak, kecepatan);
                System.out.println("Waktu: " + waktu + " jam");
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }

    }
    
}
