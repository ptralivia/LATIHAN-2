
import java.util.ArrayList;
import java.util.Scanner;
public class JavaApplication_Alivia {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        Integer pilihan = 0;
        int harga_item[] = {18000, 25000, 20000, 21000};
        String menu = null;
        int pembayaran;

        for (String a = "Y"; a.equals("Y")||a.equals("y"); )
        {
        System.out.println("");
        System.out.println("-------------------------------------------------");
        System.out.println("-------------- BINTANG BUCK COFFEE --------------");
        System.out.println("-------------------------------------------------");   
        System.out.println("| 1. Americano                |   Rp 18000      |");
        System.out.println("| 2. Arabika                  |   Rp 25000      |");
        System.out.println("| 3. Latte                    |   Rp 20000      |");
        System.out.println("| 4. Matcha                   |   Rp 21000      |");
        System.out.println("|__________|______|");
        System.out.println("");

        System.out.println("_________________");
        String tipe, gula;
        System.out.print ("Masukkan Nomor Menu Pesanan : ");
        int input_item = input.nextInt();

        System.out.print("Tipe: ");
        tipe = sc.nextLine();

        System.out.print("Gula: ");
        gula = sc.nextLine();

        System.out.print("Masukkan Banyaknya Pesanan  : ");
        int jumlah = input.nextInt();
        System.out.println("_________________");

        if (input_item == 1)
        {
            menu = " Americano ";
            pilihan = pilihan + harga_item[0] * jumlah;
            pembayaran= harga_item[0] * jumlah;
            System.out.println("Menu Pesanan Anda : " + menu +"    x"+ jumlah+"   |  Rp. "+ pembayaran);

        }
        else if (input_item == 2)
        {
            menu = "Arabika ";
            pilihan = pilihan + harga_item[1] * jumlah;
            pembayaran= harga_item[1] * jumlah;
         System.out.println("Menu Pesanan Anda : " + menu +"    x"+ jumlah+"   |  Rp. "+ pembayaran);
        }
        else if (input_item == 3)
        {
            menu = " Latte ";
            pilihan = pilihan + harga_item[2] * jumlah;
            pembayaran= harga_item[2] * jumlah;
         System.out.println("Menu Pesanan Anda : " + menu +"    x"+ jumlah+"   |  Rp. "+ pembayaran);
        }
        else if (input_item == 4)
        {
            menu = " Matcha ";
            pilihan = pilihan + harga_item[3] * jumlah;
            pembayaran= harga_item[3] * jumlah;
            System.out.println("Menu Pesanan Anda : " + menu +"    x"+ jumlah+"   |  Rp. "+ pembayaran);
        }
        else
        {
            System.out.println("Maaf Menu Yang Anda Pilih Tidak Tersedia.");
        }        
            System.out.println("Apakah anda mau memesan lagi? Y/T");
            a = input.next();
        }

        System.out.println("_________________");
        System.out.println("Pembayaran sebesar           :  Rp." +pilihan);
        System.out.println("Total yang harus anda bayar  :  Rp." +pilihan);
        System.out.println("_________________");
        System.out.print  ("Jumlah uang yang diberikan   :  RP.");

        pembayaran = input.nextInt();
        double kembalian = pembayaran-pilihan;

        System.out.println("Kembalian Anda Sebesar       :  Rp." +kembalian);
        System.out.println("_________________");
        System.out.println("             Terimakasih atas kunjungannya.        ");
        System.out.println("_________________");
    }
}