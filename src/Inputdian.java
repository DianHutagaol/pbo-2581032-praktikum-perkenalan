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

        System.out.print("Masukan tinggi      : ");
        double tinggi = scanner.nextDouble();

        scanner.nextLine();

        System.out.print("Masukkan asal kota  : ");
        String asalKota = scanner.nextLine();

        System.out.println("Halo! Nama saya " + nama + " (NIM " + nim + "), umur " + umur + " tahun,");
        System.out.println("tinggi " + tinggi + " cm, berasal dari " + asalKota + ".");

        scanner.close();
    }
}
