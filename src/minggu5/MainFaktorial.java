package minggu5;

import java.util.Scanner;

public class MainFaktorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--------------------");
        System.out.println("Masukkan jumlah elemen: ");
        int ijml = sc.nextInt();

        Faktorial[] fk = new Faktorial[ijml];
        for (int i = 0; i < ijml; i++) {  
            System.out.println("masukkan nilai data ke-" +(i+1)+":"); 
            int iNilai = sc.nextInt(); 
            fk[i] = new Faktorial(iNilai);      
        }

        System.out.println("Hasil - BRUTE FORCE");
        for (int i = 0; i < ijml; i++) {
            System.out.println("Hasil penghitungan faktorial menggunakan Brute Force adalah " + fk[i].faktorialBF((int)fk[i].nilai));
        }

        System.out.println("HASIL - DIVIDE AND CONQUER");
        for (int i = 0; i < ijml; i++) {
            System.out.println("Hasil penghitungan faktorial menggunakan Divide and Conquer adalah " + fk[i].faktorialDC((int)fk[i].nilai));
        }
    }
    
}
    
