/*
Buat program untuk penjumlahan matriks. 
Matriks sudah didefinisikan dalam program 
menggunakan array multidimensi.
*/

// PROGRAM PENJUMLAHAN MATRIKS

// belum bisa di atur outputnya
public class Kasus_1{
    public static void main(String [] args)
    {
        int[][] matrik1 = {{4,2},{5,7}};
        int[][] matrik2 = {{8,4},{2,6}};
        System.out.println("Matrik 1 adalah");
        for(int i = 0 ;i<2;i++)
        {
            for(int j = 0 ;j<2;j++)
            {   
                
                System.out.print(matrik1[i][j]+"\t");
                
            }
            System.out.println("");
               
        }
        System.out.println("Matrik 2 adalah");
        for(int i = 0 ;i<2;i++)
        {
            for(int j = 0 ;j<2;j++)
            {   
                
                System.out.print(matrik2[i][j]+"\t");
                
            }
            System.out.println("");
               
        }


        System.out.println("Matrik 3 adalah ");

        for(int i = 0 ;i<2;i++)
        {
            for(int j = 0 ;j<2;j++)
            {   
                
                System.out.print(matrik1[i][j] + matrik2[i][j]+"\t");
                
            }
            System.out.println("");
               
        }

    }
}
