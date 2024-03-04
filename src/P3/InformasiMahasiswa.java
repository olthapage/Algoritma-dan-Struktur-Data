package P3;

public class InformasiMahasiswa {
    public String nama;
    public int nim;
    public char jenisKelamin;
    public double ipk;

    public InformasiMahasiswa(String nama, int nim, char jenisKelamin, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.jenisKelamin = jenisKelamin;
        this.ipk = ipk;
    }

    public InformasiMahasiswa() {
        //TODO Auto-generated constructor stub
    }

    public static double IPKTerbesar(InformasiMahasiswa[] mhArray) {
        double ipkTerbesar = mhArray[0].ipk;
        for (int i = 1; i < mhArray.length; i++) {
            if (mhArray[i].ipk > ipkTerbesar) {
                ipkTerbesar = mhArray[i].ipk;
            }
        }
        return ipkTerbesar;
    }

    public static double rataRataIPK(InformasiMahasiswa[] mhArray) {
        double totalIPK = 0;
        for (int i = 0; i < mhArray.length; i++) {
            totalIPK += mhArray[i].ipk;
        }
        return totalIPK / mhArray.length;
    }
    

    
}




