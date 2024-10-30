import java.util.Scanner;

public class daftarMenuKafe {

    public static void main (String[]argss){
        Scanner sc = new Scanner(System.in);

        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik","Cappucino","Chocolate ice"};

        System.out.print("Masukkan nama makanan yang ingin di cari: ");
        String makananDicari = sc.nextLine();

        boolean ditemukan = false;
        for(String makanan : menu){
            if (makanan.equalsIgnoreCase(makananDicari)){
                ditemukan = true;
                break;
            }
        }
        if (ditemukan){
            System.out.println("Makanan " + makananDicari + " tersedia di menu. ");
        }else{
            System.out.println("Makanan " + makananDicari + " tersedia di menu. ");
        }
    }
}