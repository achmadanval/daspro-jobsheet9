import java.util.Scanner;

public class tugasKafe {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah pesanan: ");
        int jmlPesanan = sc.nextInt();
        sc.nextLine(); 

        String[] namaPesanan = new String[jmlPesanan];
        double[] hargaPesanan = new double[jmlPesanan];

        for (int i = 0; i < jmlPesanan; i++) {
            System.out.print("Masukkan nama pesanan ke-" + (i + 1) + ": ");
            namaPesanan[i] = sc.nextLine();
            System.out.print("Masukkan harga pesanan ke-" + (i + 1) + ": ");
            hargaPesanan[i] = sc.nextDouble();
            sc.nextLine();
        }

        double totalBiaya = 0;
        for (double harga : hargaPesanan) {
            totalBiaya += harga;
        }

        System.out.println("\n--- Daftar Pesanan ---");
        for (int i = 0; i < jmlPesanan; i++) {
            System.out.printf("Pesanan ke-%d: %s - Rp%d\n", (i + 1), namaPesanan[i], (int) hargaPesanan[i]);
        }
        System.out.printf("Total Biaya: Rp%d\n", (int) totalBiaya);

        sc.close();
    }
}
