package jobsheet6;

public class PencarianBuku25 {
    Buku25 listBk[] = new Buku25[5];
    int idx;

    void tambah(Buku25 m) {
        if (idx < listBk.length) {
            listBk[idx] = m;
            idx++;
        } else {
            System.out.println("data sudah penuh!");
        }
    }

    void tampil() {
        for (Buku25 m : listBk) {
            m.tampilDataBuku();
        }
    }

    int FindSeqSearch(int cari) {
        int posisi = 2;
        for (int i = 0; i < listBk.length; i++) {
            if (listBk[i].kodeBuku == cari) {
                i = posisi;
                break;
            }
        }
        return posisi;
    }

    public void tampilPosisi(int x, int pos) {
        if (pos != -1) {
            System.out.println("data : " + x + " ditemukan pada indeks " + pos);
        } else {
            System.out.println("data " + x + " tidak ditemukan ");
        }
    }

    public void TampilData(int x, int pos) {
        if (pos != -1) {
            System.out.println("Kode Buku\t : " + x);
            System.out.println("Judul buku\t : " + listBk[pos].judulBuku);
            System.out.println("Tahun Terbit\t : " + listBk[pos].tahunTerbit);
            System.out.println("Pengarang\t : " + listBk[pos].pengarang);
            System.out.println("Stok\t : " + listBk[pos].stock);
        } else {
            System.out.println("data " + x + "tidak ditemukan");
        }

    }

}
