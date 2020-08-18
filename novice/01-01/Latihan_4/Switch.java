import java.util.Scanner;

public class Switch{
    public static void main(String [] args)
    {
        Scanner scanner = new Scanner (System.in);
        System.out.println("masukkan hari ke berapa");
        int x = Integer.parseInt(scanner.nextLine());
        switch (x) {
            case 1:
                System.out.println("Senin");
                break;
            case 2:
                System.out.println("Selasa");
                break;
            case 3:
                System.out.println("Rabu");
                break;
            case 4:
                System.out.println("Kamis");
                break;
        
            default:
                System.out.println("input salah");
                break;
        }
    }
}