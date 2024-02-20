package P2;


public class BukuMain26 {
    public static void main(String[] args) {
        String judul, pengarang;
        int halaman, stok, harga;

        Buku26 bk1 =  new Buku26();
        bk1.judul = "Today Ends Tomorrw Comes";
        bk1.pengarang = "Denanda Pratiwi";
        bk1.halaman = 198;
        bk1.stok = 13;
        bk1.harga = 71000;

        bk1.tampilInformasi();
        bk1.terjual(5);
        bk1.gantiHarga(60000);
        bk1.tampilInformasi();  
        
        Buku26 bk2 = new Buku26("Self Reward", "Maheera Ayesha", 160, 29, 59000);
        bk2.terjual(11);
        bk2. tampilInformasi();

        Buku26 bukuOltha = new Buku26("Hemat Pangkal Kaya", "Oltha Rosyeda", 200, 15, 99000);
        bukuOltha.tampilInformasi();
        bukuOltha.terjual(7);
    }

    
    
}
