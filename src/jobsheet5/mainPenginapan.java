package jobsheet5;

public class mainPenginapan {
    public static void main(String[] args) {
        PelayananHotel[] hotelPenginapans = {
            new PelayananHotel("Hotel Amaris", 200000, (byte) 5),
            new PelayananHotel("Hotel Victory", 500000, (byte) 5),
            new PelayananHotel("Hotel Indah", 150000, (byte) 3),
            new PelayananHotel("Hotel Amaris", 400000, (byte) 3),
            new PelayananHotel("Hotel Harris", 800000, (byte) 4)
        };

        System.out.println();
        System.out.println("-------------------------------------------------------");
        System.out.println("Data Hotel berdasarkan harga terendah ke tertinggi : ");
        PelayananHotel pelayananHotel = new PelayananHotel();
        pelayananHotel.bubbleSort(hotelPenginapans);
        pelayananHotel.tampilAll(hotelPenginapans);

        System.out.println();
        System.out.println("-------------------------------------------------------");
        System.out.println("Data Hotel berdasarkan rating bintang tertinggi ke terendah");
        pelayananHotel.selectionSort(hotelPenginapans);
        pelayananHotel.tampilAll(hotelPenginapans);
    }
}