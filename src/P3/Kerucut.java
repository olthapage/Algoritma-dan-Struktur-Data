package P3;

public class Kerucut {
    public double jari;
    public double tinggi;
    public double sisiMiring;

    public Kerucut(double r, double s, double t) {
        this.jari = r;
        this.tinggi = t;
        this.sisiMiring = s;
    }

    public Kerucut() {
        //TODO Auto-generated constructor stub
    }


    public double hitungVolume() {
        return (1.0/ 3) * Math.PI * jari * jari * tinggi;
    }

    public double hitungLuasPermukaan() {
        return Math.PI * jari * (sisiMiring + jari);
    }

    
}
