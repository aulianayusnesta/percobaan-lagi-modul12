import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan harga barang: ");
        double hargaBarang = input.nextDouble();
        System.out.print("Masukkan jumlah barang: ");
        int jumlahBarang = input.nextInt();

        /**
         * Total harga 
         */
        double totalBelanja = hargaBarang * jumlahBarang;
        System.out.println("Total belanja Anda adalah: " + totalBelanja);
        input.close();
    }
}