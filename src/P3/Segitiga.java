package P3;

public class Segitiga {
    public int alas;
    public int tinggi;

    public Segitiga(int a, int t) {
        this.alas = a;
        this.tinggi = t;
    }

    public double hitungLuas() {
        return 0.5 * alas * tinggi;
    }
    
}
