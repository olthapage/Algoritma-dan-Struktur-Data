package P3;

import java. util.Scanner;

public class ArrayLatPraktikum {
    public static void main(String[] args) {
        Kerucut[] krArray = new Kerucut[1];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < krArray.length; i++) {
            System.out.print("Masukkan jari-jari Kerucut: ");
            double r = sc.nextDouble();

            System.out.print("Masukkan sisi miring Kerucut: ");
            double s = sc.nextDouble();

            System.out.print("Masukkan tinggi Kerucut: ");
            double t = sc.nextDouble();

            krArray[i] = new Kerucut(r, s, t);
        }

        for (int i = 0; i < krArray.length; i++) {
            System.out.println("Luas Permukaan Kerucut : " + krArray[i].hitungLuasPermukaan());
            System.out.println("Volume Kerucut : " + krArray[i].hitungVolume());

        }

        System.out.println("======================================================================");
        
        limasSegiEmpat[] lsArray = new limasSegiEmpat[1];
        
        for (int i = 0; i < lsArray.length; i++) {
            System.out.print("Masukkan panjang sisi alas : " );
            double s = sc.nextDouble();

            System.out.print("Masukkan tinggi limas : " );
            double t = sc.nextDouble(); 
            
            lsArray[i] = new limasSegiEmpat(s,t);
        }

        for (int i = 0; i < lsArray.length; i++) {
            System.out.println("Luas Permukaan limas segi empat sama sisi : " + lsArray[i].hitungLuasPermukaan());
            System.out.println("Volume limas segi empat sama sisi : " + lsArray[i].hitungVolume());
        }

        System.out.println("======================================================================");

        Bola[] blArray = new Bola[1];

        for (int i = 0; i < blArray.length; i++) {
            System.out.print("Masukkan jari-jari bola : " );
            double r = sc.nextDouble();

            blArray[i] = new Bola(r);
        }

        for (int i = 0; i < blArray.length; i++) {
            System.out.println("Luas Permukaan boal : " + blArray[i].hitungLuasPermukaan());
            System.out.println("Volume bola : " + blArray[i].hitungVolume());
        }

        sc.close();
    }
    
}
