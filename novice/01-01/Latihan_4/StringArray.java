//program ini dimaksudkan untuk menghitung jumlah panjang huruf
package Latihan_4;

import java.util.Scanner;

public class StringArray {
    
    
    public static void main(String[]args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("masukkan kalimat: ");
        String kalimat = keyboard.nextLine();
        System.out.println("kalimat anda adalah = "+kalimat);

        //mengubah array menjadi char
        char[] kalimatchar= kalimat.toCharArray();
        System.out.println("print array ="+ kalimatchar );

        //menghitung panjang kalimat
        System.out.println("panjang kalimat : "+kalimat.length());

        //memperkecil semua huruf
        System.out.println("diperkecil : "+ kalimat.toLowerCase());
    }
}