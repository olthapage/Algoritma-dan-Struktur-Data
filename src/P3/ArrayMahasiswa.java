package P3;

import java.util.Scanner;

public class ArrayMahasiswa {
    public static void main(String[] args) {
        InformasiMahasiswa[] mhArray = new InformasiMahasiswa[3];
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < 3; i++) {
            mhArray[i] = new InformasiMahasiswa();
            System.out.println("Masukkan data mahasiswa ke-" + (i+1));
            System.out.print("Masukkan nama mahasiswa: ");
            mhArray[i].nama = sc.next();
            System.out.print("Masukkan nim : ");
            mhArray[i].nim = sc.nextInt();
            System.out.print("Masukkan jenis kelamin (L/P): ");
            mhArray[i].jenisKelamin = sc.next().charAt(0);       
            System.out.print("Masukkan IPK : ");
            mhArray[i].ipk = sc.nextDouble();
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Data Mahasiswa ke-" + (i+1));
            System.out.println("nama : " + mhArray[i].nama);
            System.out.println("nim : " + mhArray[i].nim);
            System.out.println("jenis kelamin : " + mhArray[i].jenisKelamin);
            System.out.println("nilai IPK : " + mhArray[i].ipk);          
            
        }
        System.out.println();

        InformasiMahasiswa mahasiswa = new InformasiMahasiswa();
        double ipkTerbesar = mahasiswa.IPKTerbesar(mhArray);

        System.out.println("Nilai IPK Terbesar : " + ipkTerbesar);
        System.out.println("Data Mahasiswa dengan IPK Terbesar:");
        for (int i = 0; i < 3; i++) {
            if (mhArray[i].ipk == ipkTerbesar) {
                System.out.println("Nama : " + mhArray[i].nama);
                System.out.println("NIM : " + mhArray[i].nim);
                System.out.println("Jenis Kelamin : " + mhArray[i].jenisKelamin);
                System.out.println("Nilai IPK : " + mhArray[i].ipk);
            }
        }
        System.out.println();
        
        double rataRataIPK = mahasiswa.rataRataIPK(mhArray);
        System.out.println("Rata-rata IPK : " + rataRataIPK);
    }
}
