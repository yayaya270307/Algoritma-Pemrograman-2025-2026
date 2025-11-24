import java.util.Scanner;

public class pembelian {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nama Barang: ");
        String barang = input.nextLine();

        System.out.print("Masukkan Harga Barang: ");
        double harga = input.nextDouble();

        System.out.print("Masukkan Jumlah Barang : ");
        int jumlah = input.nextInt();

        double total = harga * jumlah;
        double diskon;

        if (total > 19200) {
            diskon = total * 0.02;
        } else {
            diskon = 0;
        }

        double totalPembayaran = total - diskon;

        System.out.println("\n===== STRUK PEMBELIAN =====");
        System.out.println("Nama Barang   : " + barang);
        System.out.println("Harga Satuan  : " + harga);
        System.out.println("Jumlah Beli   : " + jumlah);
        System.out.println("Total Harga   : " + total);
        System.out.println("Diskon        : " + diskon);
        System.out.println("Total Pembayaran   : " + totalPembayaran);
        System.out.println("============================");
    }
}