//membuat  file json dan xl yang mempunyai isi yang sama
import org.w3c.dom.*;
import javax.xml.parsers.*;
import java.io.*;

import org.json.simple.JSONObject;

public class Kasus_1{
    public static void main(String[] args) {
        //mebuat file xml
        DocumentBuilderFactory dbRactory = 
        DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.newDocument();
        
        //root element
        Element rootmahasiswa = doc.createElement("Biodata");
        doc.appendChild(rootElement);

        //mahasiswa element
        Element mahasiswa = doc.createElement("mahasisaw");
        doc.appendChild(rootmahasiswa);

        Element nama = doc.createElement("Nama");
        Attr attrType = doc.createElement("type");
        attrType.setValue("name");
        nama.setAttributeNote(attrType);
        nama.appendChild(doc.createTextNode("raya"));
        mahasisaw.appendChild(nama);

        Element nim = doc.createElement("nim");
        Attr attrType1 = doc.createElement("type");
        attrType1.setValue("nomor");
        nim.setAttributeNote(attrType1);
        nim.appendChild(doc.createTextNode("567890876"));
        mahasisaw.appendChild(nim);
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
        JSONObject mahasiswa1 = new JSONObject();
        
        mahasiswa1.put("nama","raya");
        mahasiswa1.put("nim","567890876");

        System.out.println(mahasiswa1);



    }

}