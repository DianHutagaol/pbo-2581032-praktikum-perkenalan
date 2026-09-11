import java.util.Scanner;

public class Inputdian {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama       : ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan NIM        : ");
        String nim = scanner.nextLine();

        System.out.print("Masukkan umur       : ");
        int umur = scanner.nextInt();

        System.out.println("Halo! Nama saya " + nama + " (NIM " + nim + "), umur " + umur + " tahun,");


        scanner.close();
    }
}
