import java.util.Scanner;

public class angka {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan angka pertama : ");
        int a = sc.nextInt();
        System.out.print("Masukkan angka kedua : ");
        int b = sc.nextInt();

        if (a > b)
        System.out.println(a + "lebih besar dari" + b);
        else if (a < b)
        System.out.println(a + "lebih kecil dar" + b);
        else
        System.out.println("Keduanya sama besar");

        System.out.println("Apakah keduanya sama? " + (a==b));
    }
}
