
//membuat  file json dan xl yang mempunyai isi yang sama
import org.w3c.dom.*;
import javax.xml.parsers.*;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import java.io.*;

import org.json.simple.JSONObject;

public class Kasus_1{
    public static void main(String[] args) {
        //mebuat file xml
        DocumentBuilderFactory dbFactory = 
        DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.newDocument();
        
        //root element
        Element rootmahasiswa = doc.createElement("Biodata");
        doc.appendChild(rootmahasiswa);

        //mahasiswa element
        Element mahasiswa = doc.createElement("mahasisaw");
        doc.appendChild(rootmahasiswa);

        Element nama = doc.createElement("Nama");
        Attr attrType = doc.createAttribute("type");
        attrType.setValue("name");
        nama.setAttributeNode(attrType);
        nama.appendChild(doc.createTextNode("raya"));
        mahasiswa.appendChild(nama);

        Element nim = doc.createElement("nim");
        Attr attrType1 = doc.createAttribute("type");
        attrType1.setValue("nomor");
        nim.setAttributeNode(attrType1);
        nim.appendChild(doc.createTextNode("567890876"));
        mahasiswa.appendChild(nim);
        //menuliskan ke document            
        TransformerFactory transformerFactory = TransformerFactory.newInstance(); //membuat file transformerfactory
        Transformer transformer = transformerFactory.newTransformer(); //
        DOMSource source = new DOMSource(doc);
        StreamResult result = new StreamResult(new File("cars.xml"));
        transformer.transform(source, result);
           
        // Output to console for testing
        StreamResult consoleResult = new StreamResult(System.out);
        transformer.transform(source, consoleResult);

        //mealkukan encoding ke json
        JSONObject mahasiswa1 = new JSONObject();//tidak bisa import jason object
        
        mahasiswa1.put("nama","raya");
        mahasiswa1.put("nim","567890876");

        System.out.println(mahasiswa1);
        System.out.println(mahasiswa1);


    }

}