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
            mhArray[i].nim = sc.nextDouble();
            System.out.print("Masukkan jenis kelamin (L/P): ");
            mhArray[i].jenisKelamin = sc.next().charAt(0);       
            System.out.print("Masukkan IPK : ");
            mhArray[i].ipk = sc.nextDouble();
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Data Mahasiswa ke-" + (i+1));
            System.out.println("nama : " + mhArray[i].nama + "nim : " + mhArray[i].nim + "jenis kelamin : "
                    + mhArray[i].jenisKelamin + "nilai IPK : " + mhArray[i].ipk);
        }

    }

}
