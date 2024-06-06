package jobsheet12;

import java.util.Scanner;

public class GraphMain25 {
    public static void main(String[] args) throws Exception {
        Graph25 gedung = new Graph25(6);
        gedung.addEdge(0, 1, 50);
        gedung.addEdge(0, 2, 100);
        gedung.addEdge(1, 3, 70);
        gedung.addEdge(2, 3, 40);
        gedung.addEdge(3, 4, 60);
        gedung.addEdge(4, 5, 80);

        GraphMatriks25 gdg = new GraphMatriks25(4);
        gdg.makeEdge(0, 1, 50);
        gdg.makeEdge(1, 0, 60);
        gdg.makeEdge(1, 2, 70);
        gdg.makeEdge(2, 1, 80);
        gdg.makeEdge(2, 3, 40);
        gdg.makeEdge(3, 0, 90);
        System.out.println("Hasil setelah penghapusan edge");

        System.out.println("Hasil running pada langkah 14:");
        gedung.degree(0);
        gedung.printGraph();

        gedung.removeEdge(1, 3);

        System.out.println("\nHasil running pada langkah 17:");
        gedung.printGraph();

        Scanner scanner = new Scanner(System.in);
        System.out.print("\nMasukkan gedung asal: ");
        int asal = scanner.nextInt();
        System.out.print("Masukkan gedung tujuan: ");
        int tujuan = scanner.nextInt();

        if (gedung.hasEdge(asal, tujuan)) {
            System.out.println("Gedung " + (char) ('A' + asal) + " dan Gedung " + (char) ('A' + tujuan) + " bertetangga");
        } else {
            System.out.println("Gedung " + (char) ('A' + asal) + " dan Gedung " + (char) ('A' + tujuan) + " tidak bertetangga");
        }
        scanner.close();
    }
}