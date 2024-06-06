package jobsheet12;

public class GraphMain25 {
    public static void main(String[] args) throws Exception {
        Graph25 gedung = new Graph25(6);
        gedung.addEdge(0, 1, 50);
        gedung.addEdge(0, 2, 100);
        gedung.addEdge(1, 3, 70);
        gedung.addEdge(2, 3, 40);
        gedung.addEdge(3, 4, 60);
        gedung.addEdge(4, 5, 80);

        System.out.println("Hasil running pada langkah 14:");
        gedung.degree(0);
        gedung.printGraph();

        gedung.removeEdge(1, 3);

        System.out.println("\nHasil running pada langkah 17:");
        gedung.printGraph();
    }
}