package jobsheet6;

import java.util.Scanner;

public class BukuMain {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);

        PencarianBuku25 data = new PencarianBuku25();
        int jumBuku = 5;

        System.out.println("---------------------------------------");
        System.out.println("Masukkan data Buku secara urut dari kode buku terkecil");
        for (int i = 0; i < jumBuku; i++) {
            System.out.println("-------------------");
            System.out.print("Kode Buku\t : ");
            int kodeBuku = s.nextInt();
            System.out.print("Judul buku\t : ");
            String judulBuku = s1.nextLine();
            System.out.print("Tahun Terbit\t : ");
            int tahunTerbit = s.nextInt();
            System.out.print("Pengarang\t : ");
            String pengarang = s1.nextLine();
            System.out.print("Stok\t : ");
            int stock = s.nextInt();

            Buku25 m = new Buku25(kodeBuku, judulBuku, tahunTerbit, pengarang, stock);
            data.tambah(m);
        }
        System.out.println("--------------------------------------------------------------");
        System.out.println("Data keseluruhan mahasiswa : ");
        data.tampil();

        System.out.println("--------------------------------------------------------------");
        System.out.println("Pencarian Data : ");
        System.out.println("Masukkan kode buku yang ingin dicari: ");
        System.out.print("Kode Buku : ");
        int kodeCari = s.nextInt();
        System.out.println("Menggunakan Sequential Search ");
        int posisi = data.FindSeqSearch(kodeCari);
        data.tampilPosisi(kodeCari, posisi);
        data.TampilData(kodeCari, posisi);

    }

}
