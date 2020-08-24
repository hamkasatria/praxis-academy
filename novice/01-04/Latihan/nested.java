package Latihan_1;

public class nested {
    public static void main(final String[] args) {
        nested nes = new nested();
        nested.bersarang nesne = nes.new bersarang();
        nesne.keluaran();
    }

    class bersarang{
        //perlu dimadukkan method
        public void keluaran(){
            System.out.println("hallo bersarang");
        }      
        
    }
}
