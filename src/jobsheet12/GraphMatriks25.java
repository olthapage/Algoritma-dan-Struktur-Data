package jobsheet12;

public class GraphMatriks25 {
    int vertex;
    int[][] matriks;

    public GraphMatriks25(int v) {
        vertex = v;
        matriks = new int[v][v];
        for (int i = 0; i < v; i++) {
            for (int j = 0; j < v; j++) {
                matriks[i][j] = 0; 
            }
        }
    }

    public void makeEdge(int asal, int tujuan, int jarak) {
        matriks[asal][tujuan] = jarak;
    }

    public void removeEdge(int asal, int tujuan) {
        matriks[asal][tujuan] = 0; 
    }

    public void printGraph() {
        for (int i = 0; i < vertex; i++) {
            System.out.println("Gedung " + (char) ('A' + i) + ": ");
            for (int j = 0; j < vertex; j++) {
                System.out.println("Gedung " + (char) ('A' + j) + "(" + matriks[i][j] + "m)");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        GraphMatriks25 gdg = new GraphMatriks25(4);
        gdg.makeEdge(0, 1, 50);
        gdg.makeEdge(1, 0, 60);
        gdg.makeEdge(1, 2, 70);
        gdg.makeEdge(2, 1, 80);
        gdg.makeEdge(2, 3, 40);
        gdg.makeEdge(3, 0, 90);

        System.out.println("Hasil sebelum penghapusan edge:");
        gdg.printGraph();

        System.out.println("Hasil setelah penghapusan edge:");
        gdg.removeEdge(2, 1);
        gdg.printGraph();
    }
}