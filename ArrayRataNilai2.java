import java.util.Scanner; 
public class ArrayRataNilai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jmlMhs = sc.nextInt();

        int[] nilaiMhs= new int [jmlMhs];
        double total = 0, rata2, rata2lulus = 0, rata2tidak = 0;
        int jmlLulus = 0, jmlTidak = 0, totalLulus = 0, totalTidak = 0;

        for (int i = 0; i < jmlMhs; i++) {
            System.out.print("Masukkan nilai mahasiswa ke- " + (i+1)+ " : ");
            nilaiMhs[i] = sc.nextInt();
        }
        for (int i = 0; i < jmlMhs; i++) {
            total += nilaiMhs [i]; 
            if (nilaiMhs[i] > 70) {
            System.out.println("Mahasiswa ke- " + (i+1) + " lulus!");
            jmlLulus++;
            totalLulus += nilaiMhs[i];
            } else {
            System.out.println("Mahasiswa ke- " + (i+1) + " tidak lulus :(");
            jmlTidak++;
            totalTidak += nilaiMhs[i];
            }
            }
        rata2 = total / jmlMhs;
        if (jmlLulus > 0) {
            rata2lulus = totalLulus / jmlLulus;
        }
        if (jmlTidak > 0) {
            rata2tidak = totalTidak / jmlTidak;
        }
        System.out.println("Rata-rata nilai = " + rata2);
        System.out.println("Rata-rata nilai mahasiswa yang lulus = " + rata2lulus);
        System.out.println("Rata-rata nilai mahasiswa yang tidak lulus = " + rata2tidak);
        System.out.println("Jumlah mahasiswa yang lulus = " + jmlLulus);
        System.out.println("Jumlah mahasiswa yang tidak lulus = " + jmlTidak);
    }
}