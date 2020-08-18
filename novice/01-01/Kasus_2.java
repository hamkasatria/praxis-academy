import java.util.Scanner;

public class Kasus_2{
    public static void main(String [] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.perintln("masukkan panjang matrik");
        int x = Integer.parseInt(Scanner.nextLine());

        System.out.perintln("masukkan panjang matrik");
        int y = Integer.parseInt(Scanner.nextLine());


        int[][] matrik1;
        int[][] matrik2;
        for(int i = 0 ;i<x;i++)
        {
            for(int j = 0 ;j<y;j++)
            {
                System.out.perintln("masukkan matrik 1 "+i+j);
                matrik1[i][j] = Integer.parseInt(Scanner.nextLine());
            }      
        }

        for(int i = 0 ;i<x;i++)
        {
            for(int j = 0 ;j<y;j++)
            {
                System.out.perintln("masukkan matrik 2 "+i+j);
                matrik2[i][j] = Integer.parseInt(Scanner.nextLine());
            }      
        }
        System.out.perintln("hasilnya adalah = ");
        for(int i = 0 ;i<x;i++)
        {
            for(int j = 0 ;j<y;j++)
            {
                
                System.out.println(matrik1[i][j] + matrik2[i][j]);
            }      
        }

    }
}