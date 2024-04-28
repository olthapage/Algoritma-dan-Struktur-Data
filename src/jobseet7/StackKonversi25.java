package jobseet7;

public class StackKonversi25 {
    int size;
    int[] tumpukkanBinner;
    int top;
    Gudang25 gudang;

    public StackKonversi25() {
        this.size = 32;
        tumpukkanBinner = new int[size];
        top = -1;
        this.gudang = gudang;
    }
    public boolean isEmpty(){
        return top == -1;
    }
    public boolean isFull() {
        return top == size - 1;
    }
    public void push(int data) {
        if (isFull()) {
            System.out.println("Stack penuh");
        } else {
            top++;
            tumpukkanBinner[top] = data;
        }
    }
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack kosong");
            return -1;
        } else {
            int data = tumpukkanBinner[top];
            top--;
            return data;
        }
    }
    public Barang25 ambilBarang() {
        if (!gudang.cekKosong()) { 
            Barang25 delete = gudang.tumpukan[top]; 
            top--;
            System.out.println("Barang " + delete.nama + " diambil dari Gudang.");
            System.out.println("Kode unik dalam binner: " + gudang.konversiDesimalKeBinner(delete.kode)); 
            return delete;
        } else {
            System.out.println("Tumpukkan barang kosong.");
            return null;
        }
    }
    
}
 