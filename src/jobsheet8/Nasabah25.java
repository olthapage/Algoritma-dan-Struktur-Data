package jobsheet8;

public class Nasabah25 {
    String norek;
    String nama;
    String alamat;
    int umur;
    double saldo;

    Nasabah25[] data;
    int front;
    int rear;
    int size;
    int max;

    public Nasabah25(int n) {
        max = n;
        data = new Nasabah25[max];
        size = 0;
        front = rear = -1;
    }

    public Nasabah25(String norek, String nama, String alamat, int umur, double saldo) {
        this.norek = norek;
        this.nama = nama;
        this.alamat = alamat;
        this.umur = umur;
        this.saldo = saldo;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void Enqueue(Nasabah25 dt) {
        if (!isFull()) {
            if (isEmpty()) {
                front = rear = 0;
            } else {
                rear = (rear + 1) % max;
            }
            data[rear] = new Nasabah25(dt.norek, dt.nama, dt.alamat, dt.umur, dt.saldo);
            size++;
        } else {
            System.out.println("Queue sudah penuh. Penambahan data dibatalkan.");
        }
    }

    public Nasabah25 Dequeue() {
        if (!isEmpty()) {
            Nasabah25 dt = data[front];
            size--;
            if (size == 0) {
                front = rear = -1;
            } else {
                front = (front + 1) % max;
            }
            return dt;
        } else {
            System.out.println("Queue masih kosong. Pengambilan data dibatalkan.");
            return null;
        }
    }

    public void peek() {
        if (!isEmpty()) {
            System.out.println("Elemen terdepan: " + data[front].norek + " " + data[front].nama + " " + data[front].alamat + " " + data[front].umur + " " + data[front].saldo);
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void print() {
        if (!isEmpty()) {
            int i = front;
            do {
                System.out.println(data[i].norek + " " + data[i].nama + " " + data[i].alamat + " " + data[i].umur + " " + data[i].saldo);
                i = (i + 1) % max;
            } while (i != (rear + 1) % max);
            System.out.println("Jumlah elemen = " + size);
        } else {
            System.out.println("Queue masih kosong");
        }
    }

}