package P3;

public class limasSegiEmpat {
    public double sisiAlas;
    public double tinggi;
    
    public limasSegiEmpat(double s, double t) {
        sisiAlas = s;
        this.tinggi = t;
    }

    public double hitungVolume() {
        return sisiAlas * sisiAlas + 4 * (0.5 * sisiAlas * tinggi);
    }


    public double hitungLuasPermukaan() {
        return (1.0 / 3) * sisiAlas * sisiAlas * tinggi;
    }
}
