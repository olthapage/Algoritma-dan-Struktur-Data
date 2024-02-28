package P3;

public class ArraySegitiga {
    public static void main(String[] args) {
        Segitiga[] b2Array = new Segitiga[3];
        b2Array[0] = new Segitiga(10, 3);
        b2Array[1] = new Segitiga(15, 4);
        b2Array[2] = new Segitiga(21, 25);

        
        for (int i = 0; i < 3; i++) {
            System.out.println("Volume Segitiga ke " + i + ": " + b2Array[i].hitungLuas());
            
        }

    }
    
}
