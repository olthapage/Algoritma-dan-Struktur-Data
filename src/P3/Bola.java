package P3;

public class Bola {
    public double jari;

    public Bola(double r) {
        this.jari = r;
    }

    public double hitungLuasPermukaan() {
        return 4 * Math.PI * jari * jari;
    }
    
    public double hitungVolume() {
        return (4.0 / 3) * Math.PI * jari * jari * jari;
    }
}


