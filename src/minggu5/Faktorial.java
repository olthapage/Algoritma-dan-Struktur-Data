package minggu5;

public class Faktorial {
    double nilai;

    public Faktorial(double nilai) {
        this.nilai = nilai;
    }

    public Faktorial() {
        //TODO Auto-generated constructor stub
    }

    int faktorialBF(int n) {
        int fakto = 1;
        for (int i = 1; i <=n; i++) {
            fakto *= i;;
        }
        return fakto;
    }

    int faktorialDC() {
        return faktorialDCRekursif((int)nilai);
    }

    int faktorialDCRekursif(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * faktorialDCRekursif(n - 1);
        }
    }
}
