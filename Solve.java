import java.util.Scanner;

public class Solve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double harga, totalHarga;
        String status;

        System.out.print("Masukkan Harga: ");
        harga = sc.nextDouble();
        sc.nextLine();

        System.out.print("Status: ");
        status = sc.nextLine();

        totalHarga = harga;

        if (harga >= 500000 && status.equals("member")) {
            totalHarga = harga - (harga * 0.10);
            System.out.println("Diskon 10%");
        } else {
            if (harga >= 1000000) {
                totalHarga = harga - (harga * 0.05);
                System.out.println("Diskon 5%");
            }
        }

        System.out.println("total yang harus dibayar: " + totalHarga);

        sc.close();
    }
}