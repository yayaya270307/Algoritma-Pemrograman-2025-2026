import java.util.Scanner;

public class input {  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Assalamu'alaikum");
        System.out.println("Izim memperkenalkan diri");

        System.out.print("Nama lengkap: ");
        String nama = sc.nextLine();
        System.out.print("Tempat & tanggal lahir: ");
        String ttg = sc.nextLine();
        System.out.print("Jenis kelamin: ");
        String jk = sc.nextLine();
        System.out.print("Alamat lengkap: ");
        String alamat = sc.nextLine();

        sc.close();
    }
}
