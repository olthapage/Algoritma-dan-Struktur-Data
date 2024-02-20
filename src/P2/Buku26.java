package P2;



public class Buku26 {

      String judul, pengarang;
      int halaman, stok, harga, hargaDiskon, hargaTotal, hargaBayar;
    
    
    void tampilInformasi() {
        System.out.println("Judul : " + judul);
        System.out.println("Pengarang : " + pengarang);
        System.out.println("Jumlah halaman : " + halaman);
        System.out.println("Sisa stok : " + stok);
        System.out.println("Harga : Rp" + harga);


    }

    void terjual(int jml) {
        if (stok > 0) {
            stok -= jml;
            System.out.println(jml + " buku terjual.");
        } else {
            System.out.println("Stok telah habis.");
        }
        
    }

    void restock(int jml) {
        stok += jml;
    }

    void gantiHarga(int hrg) {
        harga = hrg;
    }

    int hitungHarga(int jml) {
        return hargaTotal = harga * jml;
    }

    int hitungDiskon() {
        if (hargaTotal > 150000) {
            hargaDiskon = (int) (hargaTotal*0.12);
        } else if (hargaTotal >= 75000 && hargaTotal <= 150000)  {
            hargaDiskon = (int) (hargaTotal*0.05);
        }  else {
            hargaDiskon = hargaTotal;
        }
        return halaman; 
    }

    int hitungHargaBayar() {
        return hargaBayar = hargaTotal - hargaDiskon;
    }

    public Buku26(String jud, String pg, int hal, int stok, int har) {
        judul = jud;
        pengarang = pg;
        halaman = hal;
        this.stok = stok;
        harga = har;
    }

    public Buku26() {
        //TODO Auto-generated constructor stub
    }

    public void bukuOltha(String jud, String pg, int hal, int stok, int har) {
        this.judul = jud;
        this.pengarang = pg;
        this.halaman = hal;
        this.stok = stok;
        this.harga = har;

    }


    
    
}
