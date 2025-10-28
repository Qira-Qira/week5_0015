import java.util.Scanner;


public class Hitung{
    public static void main (String args []){
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Alas: ");
        int alas = Integer.parseInt(sc.nextLine().trim());

        System.out.print("Masukkan Tinggi: ");
        int tinggi = Integer.parseInt(sc.nextLine().trim());



        double luas = 0.5 * alas * tinggi;

        double keliling = alas + tinggi + luas;

        System.out.println("Luas: " + luas + "\n" + "Keliling: " + keliling);

        sc.close();
    }
}