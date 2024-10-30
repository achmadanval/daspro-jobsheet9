import java.util.Scanner;

public class SearchNilai2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan nilai yang akan di input : ");
        int jumNilai = sc.nextInt();
        int[]arrNilai= new int [jumNilai];
        for (int i = 0; i < jumNilai;i++){
            System.out.print("Masukkan nilai ke- " +(i+1)+ ":");
            arrNilai[i] = sc.nextInt();
        }
        System.out.println("Masukkan nilai yang ingin di cari : ");
        int key = sc.nextInt();
        int hasil = -1 ;

        for ( int i = 0; i < arrNilai.length; i++){
            if (key == arrNilai[i]){
                hasil = i;
                break;
            }
        }
        if (hasil != -1) {
            System.out.println("Nilai "+key+ "ketemu di indeks ke- " + (hasil +1 )+ ".");
        } else {
            System.out.println("Nilai "+key+ "tidak di temukan dalam array.");
        }
        
    }
}