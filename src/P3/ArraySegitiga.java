package P3;

public class ArraySegitiga {
    public static void main(String[] args) {
        Segitiga[] b2Array = new Segitiga[3];
        b2Array[0] = new Segitiga(10, 15);
        b2Array[1] = new Segitiga(15, 20);
        b2Array[2] = new Segitiga(25, 30);

        
        for (int i = 0; i < 3; i++) {
            System.out.println("Luas Segitiga ke " + i + ": " + b2Array[i].hitungLuas());
            System.out.println("Keliling Segitiga " + i + ": " + b2Array[i].hitungKeliling());
        }

        System.out.println("================================================================================");

        Segitiga[] sgArray = new Segitiga[4];
        sgArray[0] = new Segitiga(10, 4);
        sgArray[1] = new Segitiga(20, 10);
        sgArray[2] = new Segitiga(15, 6);
        sgArray[3] = new Segitiga(25, 10);

        for (int i = 0; i < 4; i++) {
            System.out.println("Luas Segitiga ke " + i + ": " + sgArray[i].hitungLuas());
            System.out.println("Keliling Segitiga " + i + ": " + sgArray[i].hitungKeliling());
            
        }

    }
    
}
