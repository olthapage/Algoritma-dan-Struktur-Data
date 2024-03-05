package Kuis1_Oltha.rar;

public class Obat25 {
    public String nama;
    public String kategori;
    public int stok;
    public int jumlah;

    public Obat25(String nama, String kategori, int stok, int jumlah) {
        this.nama = nama;
        this.kategori = kategori;
        this.stok = stok;
        this.jumlah = jumlah;
    }

    public Obat25() {
        //TODO Auto-generated constructor stub
    }

    void tampil() {
        System.out.println("Nama : " + nama);
        System.out.println("Kategori : " + kategori);
        System.out.println("Stok : " + stok);
        System.out.println("Jumlah : " + jumlah);
    }

    int hitungSisa() {
        return stok - jumlah;
    }

    void cariObatPalingLaku(Obat25[] obatList) {
        Obat25 obatPalingLaku = obatList[0];
        int maxJumlah = obatList[0].jumlah;
    
        for (int i = 1; i < obatList.length; i++) {
            if (obatList[i].jumlah > maxJumlah) {
                obatPalingLaku = obatList[i];
                maxJumlah = obatList[i].jumlah;
            }
        }
    
        obatPalingLaku.stok += maxJumlah;
    
        System.out.println("Obat paling laku adalah: ");
        obatPalingLaku.tampil();
    }
    
    void daftarObat(Obat25[] obatList) {
        for (int i = 0; i < obatList.length - 1; i++) {
            for (int j = 0; j < obatList.length - i - 1; j++) {
                if (obatList[j].stok > obatList[j + 1].stok) {
                    Obat25 temp = obatList[j];
                    obatList[j] = obatList[j + 1];
                    obatList[j + 1] = temp;
                }
            }
        }
    }
}

