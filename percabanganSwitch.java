import java.util.Scanner;
 
public class percabanganSwitch{
   public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int pilih;
        System.out.print("Menu:\n 1. Nasi Goreng\n 2. Mie Ayam\n 3. Bakso\n");
        System.out.print("Masukkan Pilihan Menu : ");
        pilih = scan.nextInt();
        System.out.println("=====================");
        switch(pilih){
            case 1:
                System.out.println("Pesanan : Nasi Goreng");
                System.out.println("Harga : 12.000");
                break;
            case 2:
                System.out.println("Pesanan : Mie Ayam");
                System.out.println("Harga : 12.000");
                break;
            case 3:
                System.out.println("Pesanan : Bakso");
                System.out.println("Harga : 13.000");
                break;
            default:
            System.out.println("Menu tidak ada ! :(");
        }
    }
}