import java.util.Scanner;

public class tugasNilaiMhs {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan banyak nilai mahasiswa: ");
        int jmlMhs = sc.nextInt();

        int[] nilaiMhs = new int[jmlMhs];

        for (int i = 0; i < jmlMhs; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMhs[i] = sc.nextInt();
        }

        double rata2 = 0;
        int total = 0;
        int nilaiTertinggi = nilaiMhs[0];
        int nilaiTerendah = nilaiMhs[0];

        for (int nilai : nilaiMhs) {
            total += nilai;
            if (nilai > nilaiTertinggi) {
                nilaiTertinggi = nilai;
            }
            if (nilai < nilaiTerendah) {
                nilaiTerendah = nilai;
            }
        }

        if (jmlMhs > 0) {
            rata2 = (double) total / jmlMhs;
        }

        System.out.printf("\n--- Hasil ---\n");
        System.out.printf("Nilai rata-rata: %.2f\n", rata2);
        System.out.println("Nilai Tertinggi: " + nilaiTertinggi);
        System.out.println("Nilai Terendah: " + nilaiTerendah);
        System.out.print("Semua nilai yang telah dimasukkan: ");
        for (int nilai : nilaiMhs) {
            System.out.print(nilai + " ");
        }
        System.out.println();
    }
}
