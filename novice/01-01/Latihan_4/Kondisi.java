import java.util.Scanner;

public class Kondisi{
    
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your value:");
        
        int val = Integer.parseInt(scanner.nextLine());   
        Kondisi nilai = new Kondisi();
        nilai.NilaiMax(val);
    }
    public void NilaiMax (int nilai)
    {
        int tengah = nilai/2;
        //System.out.println(nilai);
        System.out.println("nilai tengah dari perhitugnan anda adalah 10 \n\n");
        for (int j = 1; j <= nilai; j++) {
            if(j == tengah){
                System.out.println("ini adalah nilai tengah");
            }
            else{
                System.out.println(j);
            }
            
        }
    }    

}