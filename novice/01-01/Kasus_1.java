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
        for(int i = 0 ;i<2;i++)
        {
            for(int j = 0 ;j<2;j++)
            {
                System.out.println(matrik1[i][j] + matrik2[i][j]);
            }

               
        }

    }
}