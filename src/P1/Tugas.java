package P1;

import java.util.Scanner;

public class Tugas {
     public static void main(String[] args) {
        char[] KODE = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};

        String[][] KOTA = {
            {"BANTEN"},
            {"JAKARTA"},
            {"BANDUNG"},
            {"CIREBON"},
            {"BOGOR"},
            {"PEKALONGAN"},
            {"SEMARANG"},
            {"SURABAYA"},
            {"MALANG"},
            {"TEGAL"}
        };

        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan kode plat mobil (A-J): ");
        char kodePlat = scanner.next().charAt(0);

        boolean found = false;
        for (int i = 0; i < KODE.length; i++) {
            if (KODE[i] == kodePlat) {
                System.out.println("Kota: " + KOTA[i][0]);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Kode plat mobil tidak valid.");
        }

        scanner.close();
    }
}
