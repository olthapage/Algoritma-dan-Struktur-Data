package P1;

import java .util.Scanner;

public class Perulangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan NIM: ");
        String nim = input.nextLine();
        int n = Integer.parseInt(nim.substring(nim.length() - 2));
        System.out.println("============================");

        System.out.print("n : ");
        int tambahan = input.nextInt();
        if (n < 10) {
            n += 10;
        }
        
        System.out.print("OUTPUT: ");
        printDeret(n);
    }

    public static void printDeret(int n) {
        for (int i = 1; i <= n; i++) {
            if (i == 6 || i == 10) {
                continue;
            } else if (i % 2 == 0) {
                System.out.print(i + " ");
            } else {
                System.out.print("* ");
            }
        }
        
    }
    
}
