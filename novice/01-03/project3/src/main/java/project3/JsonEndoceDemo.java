package project3;
import org.json.simple.JSONObject;

public class JsonEndoceDemo {
 public static void main(String[] args) {
    JSONObject obj = new JSONObject();

    obj.put("name","raya");
    obj.put("num",new Integer(100));

    System.out.print(obj);
 }
}