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
        int i = 1;
        while (i <= n) {
            fakto *= i;
            i++;
        }
        return fakto;
    }


    int faktorialDC(int n) {
        if(n==0 || n==1) {
            return 1;
        } else {
            int fakto = n * faktorialDC(n-1);
            return fakto;
        }
    }
}
