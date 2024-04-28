package jobseet7;

import java.util.Scanner;

public class Utama25 {
    public static void main(String[] args) {
        Gudang25 gudang = new Gudang25(7);
        Scanner sc25 = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah barang");
            System.out.println("2. Ambil barang");
            System.out.println("3. Tampilkan tumpukan barang");
            System.out.println("4. Keluar");
            System.out.print("Pilih operasi: "); 
            int pilihan = sc25.nextInt();
            sc25.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan kode barang: ");
                    int kode = sc25.nextInt();
                    sc25.nextLine();
                    System.out.print("Masukkan nama barang: ");
                    String nama = sc25.nextLine(); 
                    System.out.print("Masukkan nama kategori: "); 
                    String kategori = sc25.nextLine(); 
                    Barang25 barangBaru = new Barang25(kode, nama, kategori); 
                    gudang.tambahBarang(barangBaru);
                    break;
                case 2:
                    gudang.ambilBarang();
                    break;
                case 3:
                    gudang.tampilkanBarang();
                    break;
                case 4:
                    System.exit(0); 
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silahkan coba lagi.");
            }
        }
    }
}
