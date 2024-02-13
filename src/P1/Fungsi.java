package P1;


public class Fungsi {
    static final int aglonema = 75000;
    static final int keladi = 50000;
    static final int alocasia = 60000;
    static final int mawar = 10000;

    public static void main(String[] args) {
        // stock bunga setiap cabang
        int[][] stockBunga = {
                { 10, 5, 15, 7 }, //  RoyalGarden 1
                { 6, 11, 9, 12 }, //  RoyalGarden 2
                { 2, 10, 10, 5 }, // RoyalGarden 3
                { 5, 7, 12, 9 } // RoyalGarden 4
        };


        System.out.println("Pendapatan setiap cabang jika semua bunga habis terjual:");
        for (int i = 0; i < stockBunga.length; i++) {
            int pendapatan = hitungPendapatan(stockBunga[i]);
            System.out.println("RoyalGarden " + (i + 1) + ": " + pendapatan);
        }


        System.out.println("\nJumlah stock setiap jenis bunga pada cabang RoyalGarden:");
        int cabang = 4; 
        System.out.println("Aglonema: " + stockBunga[cabang - 1][0]);
        System.out.println("Keladi: " + stockBunga[cabang - 1][1]);
        System.out.println("Alocasia: " + stockBunga[cabang - 1][2]);
        System.out.println("Mawar: " + stockBunga[cabang - 1][3]);


        penguranganStock(stockBunga[cabang - 1], 1, 2, 0, 5);


        System.out.println("\nJumlah stock setiap jenis bunga pada cabang RoyalGarden setelah pengurangan:");
        System.out.println("Aglonema: " + stockBunga[cabang - 1][0]);
        System.out.println("Keladi: " + stockBunga[cabang - 1][1]);
        System.out.println("Alocasia: " + stockBunga[cabang - 1][2]);
        System.out.println("Mawar: " + stockBunga[cabang - 1][3]);
    }

    static int hitungPendapatan(int[] stockBunga) {
        int totalPendapatan = 0;
        totalPendapatan += stockBunga[0] * aglonema;
        totalPendapatan += stockBunga[1] * keladi;
        totalPendapatan += stockBunga[2] * alocasia;
        totalPendapatan += stockBunga[3] * mawar;
        return totalPendapatan;
    }

    static void penguranganStock(int[] stock, int aglonema, int keladi, int alocasia, int mawar) {
        stock[0] -= aglonema;
        stock[1] -= keladi;
        stock[2] -= alocasia;
        stock[3] -= mawar;
    } 
}
