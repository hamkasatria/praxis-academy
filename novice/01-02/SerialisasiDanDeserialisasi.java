import java.io.*;

public class SerialisasiDanDeserialisasi{
    public static void main(String [] args)
    {   //membuat objek dari demo
        Demo object = new Demo("hamka",26);

        //memberi nama file
        String filename = "file.ser";

        //serialisasi
        try{
            FileOutputStream file = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(file);

            //method untuk serialisasi
            out.writeObject(object);

            out.close();
            file.close();

            System.out.println("Serialisasi berhasil");
        }
        catch(IOException ex){
            System.out.println("IO exception is caught ");
        }

        //Desentraisasi
        Demo object1 = null;
        try {
            FileInputStream file = new FileInputStream (filename);
            ObjectInputStream in = new ObjectInputStream(file);

            object1 = (Demo)in.readObject;

            in.close();
            file.close();

            System.out.println("telah di desentralisasi");
            System.out.println("nama = "+ object1.nama);
            System.out.println("nomor = "+ object1.nama);

        } catch (IOException ex) {
            //TODO: handle exception
            System.out.println("IOException is caught");
         }
        //catch (ClassNotFoundException ex)
        // {
        //     System.out.println("ClassNotFoundException is caught");
        // }
    }
}

class Demo implements java.io.Serializable
{
    public String nama;
    public int nomor;

    public Demo(String nama, int nomor)
    {
        this.nama = nama;
        this.nomor = nomor;
    }
}

