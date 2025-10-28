import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Nilai MTK: ");
        int nilaiMtk = Integer.parseInt(sc.nextLine().trim());

        System.out.print("Masukkan Nilai Inggris: ");
        int nilaiInggris = Integer.parseInt(sc.nextLine().trim());

        System.out.print("Masukkan Nilai Fisika: ");
        int nilaiFisika = Integer.parseInt(sc.nextLine().trim());


        String isLulus = nilaiMtk == 75 && nilaiInggris != 75 ? "Lulus" : "Tidak Lulus Lulus";
        String isPintar = nilaiInggris > 90 || nilaiFisika < 75 ? "Anda Pintar" : "Harus Lebih Belajar";

        System.out.println(isLulus);
        System.out.println(isPintar);

        sc.close();
    }
}
