package P3;

import java.util.Scanner;

public class ArrayObjects {
    public static void main(String[] args) {

        PersegiPanjang[] ppArray = new PersegiPanjang[3];

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan panjang array: ");
        int lengthArray = sc.nextInt();

        for (int i = 0; i < lengthArray; i++) {
          ppArray[i] = new PersegiPanjang();
          System.out.println("Persegi panjang ke-" + i);
          System.out.print("Masukkan panjang: ");
          ppArray[i].panjang = sc.nextInt();
          System.out.print("Masukkan lebar: ");
          ppArray[i].lebar = sc.nextInt();                
        }

        for (int i = 0; i < lengthArray; i++) {
          System.out.println("Persegi Panjang ke-" + i);
          System.out.println("Panjang: " + ppArray[i].panjang + ", lebar: " + ppArray[i].lebar);
          
        }
    }
}




