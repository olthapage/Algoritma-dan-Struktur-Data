package P3;

import java.util.Scanner;

public class ArrayMahasiswa {
    public static void main(String[] args, String jenisKelamin) {
        InformasiMahasiswa[] mhArray = new InformasiMahasiswa[3];
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i < mhArray.length; i++) {
            mhArray[i] = new InformasiMahasiswa();
            System.out.println("Masukkan data mahasiswa ke-" + i);
            System.out.print("Masukkan nama mahasiswa: ");
            mhArray[i].nama = sc.nextLine();
            System.out.print("Masukkan nim : ");
            mhArray[i].nim = sc.nextDouble();
            System.out.print("Masukkan jenis kelamin (L/P) : ");
            mhArray[i].jenisKelamin = sc.nextInt();
            if (jenisKelamin.equalsIgnoreCase("L")) {
                mhArray[i].jenisKelamin = (int) 0; 
            } else if (jenisKelamin.equalsIgnoreCase("P")) {
                mhArray[i].jenisKelamin = 1; 
            } else {
                System.out.println("Input jenis kelamin tidak valid. Harap masukkan 'L' atau 'P'.");
                i--;
                continue;
            }
            System.out.print("Masukkan IPK : ");
            mhArray[i].ipk = sc.nextDouble();
        }

        for (int i = 1; i < mhArray.length; i++) {
            System.out.println("Data Mahasiswa ke-" + i);
            System.out.println("nama : " + mhArray[i].nama + "nim : " + mhArray[i].nim + "jenis kelamin : "
                    + mhArray[i].jenisKelamin + "nilai IPK : " + mhArray[i].ipk);
        }

    }

}
