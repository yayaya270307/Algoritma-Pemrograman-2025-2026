import java.util.Scanner; 
class Bilanganganjilgenap{ 
    public static void main(String args[]) 
    { 
        int angka; 
        System.out.println("Masukkan Angka:"); 
        Scanner masukan = new Scanner(System.in); 
        angka = masukan.nextInt(); 
         
        if ( angka % 2 == 0 ) { 
            System.out.println("Bilangan Genap"); 
        }else { 
            System.out.println("Bilangan Ganjil"); 
        } 
    } 
} 