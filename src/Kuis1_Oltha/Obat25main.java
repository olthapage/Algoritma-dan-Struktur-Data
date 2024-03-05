package Kuis1_Oltha;

import java.util.Scanner;

public class Obat25main {

    public static void main(String[] args) {
        Obat25[] obArray = new Obat25[5];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < obArray.length; i++) {
            System.out.print("Masukkan Nama Obat: ");
            String nama = sc.next();
            System.out.print("Masukkan Kategori Obat : ");
            String kategori = sc.next();
            System.out.print("Masukkan Stok Obat di Apotek : ");
            int stok = sc.nextInt();
            System.out.print("Masukkan jumlah yang terjual : ");
            int jumlah = sc.nextInt();

            obArray[i] = new Obat25(nama, kategori, stok, jumlah);
        }

        System.out.println("Data Obat:");
        for (int i = 0; i < obArray.length; i++) {
            System.out.println("Obat ke-" + (i + 1));
            obArray[i].tampil();
            System.out.println("---------------------");
        }

        for (int i = 0; i < obArray.length; i++) {
            System.out.println("Sisa stok obat " + obArray[i].nama + ": " + obArray[i].hitungSisa());
        }

        Obat25 obat = new Obat25();
        obat.cariObatPalingLaku(obArray);

        obat.daftarObat(obArray);
    }
}