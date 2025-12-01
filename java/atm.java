import java.util.Scanner;

public class atm {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String nama;
        char konfirmasi;
        int nim, saldo, menu, jumlah;

        // Validasi Nama
        do {
            System.out.print("Masukkan Nama : ");
            nama = input.next();

            System.out.print("Apakah nama anda sudah benar? (Y/N) ");
            konfirmasi = input.next().charAt(0);

        } while (konfirmasi == 'N' || konfirmasi == 'n');


        // Input NIM -> jadi saldo
        System.out.print("Masukkan NIM : ");
        nim = input.nextInt();
        saldo = nim;

        System.out.println("Saldo awal anda : Rp " + saldo);


        // Menu ATM
        do {
            System.out.println("\n========== MENU ATM ==========");
            System.out.println("1. Cek Saldo");
            System.out.println("2. Tarik Tunai");
            System.out.println("3. Setor Tunai");
            System.out.println("4. Transfer");
            System.out.println("5. Keluar");

            System.out.print("menu ");
            menu = input.nextInt();

            switch(menu) {

                case 1:
                    System.out.println("Saldo anda : Rp " + saldo);
                    break;

                case 2:
                    System.out.print("Jumlah saldo yang ingin ditarik : ");
                    jumlah = input.nextInt();

                    if (jumlah > saldo) {
                        System.out.println("Saldo tidak cukup, tidak dapat ditarik");
                    } else {
                        saldo -= jumlah;
                        System.out.println("berhasil. Saldo sekarang : Rp " + saldo);
                    }
                    break;

                case 3:
                    System.out.print("Jumlah setor tunai : ");
                    jumlah = input.nextInt();
                    saldo += jumlah;
                    System.out.println("Setoran berhasil. Saldo sekarang : Rp " + saldo);
                    break;

                case 4:
                    System.out.print("Bank tujuan : ");
                    String bank = input.next();
                    System.out.print("No Rekening : ");
                    String norek = input.next();
                    System.out.print("Jumlah yang akan ditransfer : ");
                    jumlah = input.nextInt();

                    if (jumlah > saldo) {
                        System.out.println("Saldo tidak cukup");
                    } else {
                        saldo -= jumlah;
                        System.out.println("berhasil. Saldo sekarang : Rp " + saldo);
                    }
                    break;

                case 5:
                    System.out.println("Terima kasih");
                    break;

                default:
                    System.out.println("Menu tidak valid");
            }

        } while (menu != 5);

        input.close();
    }
}
