package jobsheet5;

public class PelayananHotel {
    String nama;
    double harga;
    Byte ratingBintang;
    
    PelayananHotel(String nama, double harga, Byte ratingBintang) {
        this.nama = nama; 
        this.harga = harga;
        this.ratingBintang = ratingBintang; 
    }

    public PelayananHotel() {
        //TODO Auto-generated constructor stub
    }

    void tambah(PelayananHotel P, PelayananHotel[] hotelPenginapans) {
        for (int i = 0; i < hotelPenginapans.length; i++) {
            if (hotelPenginapans[i] == null) {
                hotelPenginapans[i] = P;
                System.out.println("Berhasil menambahkan hotel");
                return;
            }
        }
        System.out.println("Kamar penuh, tidak dapat menambahkan hotel");
    }

    void tampilAll(PelayananHotel[] hotelPenginapans) {
        System.out.println("-------------------------------------------------------");
        for (PelayananHotel hotel : hotelPenginapans) {
            if (hotel != null) {
                System.out.println("Nama: " + hotel.nama + ", Harga: Rp. " + hotel.harga + ", Rating Bintang: " + hotel.ratingBintang);
            }
        }
    }

    void bubbleSort(PelayananHotel[] hotelPenginapans) {
        for (int i = 0; i < hotelPenginapans.length - 1; i++) {
            for (int j = 0; j < hotelPenginapans.length - 1 - i; j++) {
                if (hotelPenginapans[j].harga > hotelPenginapans[j + 1].harga) {
                    PelayananHotel temp = hotelPenginapans[j];
                    hotelPenginapans[j] = hotelPenginapans[j + 1];
                    hotelPenginapans[j + 1] = temp;
                }
            }
        }
    }

    void selectionSort(PelayananHotel[] hotelPenginapans) {
        for (int i = 0; i < hotelPenginapans.length - 1; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < hotelPenginapans.length; j++) {
                if (hotelPenginapans[j] != null && hotelPenginapans[j].ratingBintang != null && hotelPenginapans[maxIdx] != null && hotelPenginapans[maxIdx].ratingBintang != null && hotelPenginapans[j].ratingBintang > hotelPenginapans[maxIdx].ratingBintang) {
                    maxIdx = j;
                }
            }
            if (hotelPenginapans[maxIdx] != null && hotelPenginapans[i] != null) {
                PelayananHotel temp = hotelPenginapans[maxIdx];
                hotelPenginapans[maxIdx] = hotelPenginapans[i];
                hotelPenginapans[i] = temp;
            }
        }
    }
}