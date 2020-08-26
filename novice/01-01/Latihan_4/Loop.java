package Latihan_4;
public class Loop
{
    public static void main(String[] args){
        System.out.println("ini adalah contoh looping bersarang:");
        for (int j = 1; j <= 10; j++) {
            for (int i = 1; i <= 10; i++) {
                System.out.printf("%d ", i * j);
            }
            System.out.println();
        }
    }
}