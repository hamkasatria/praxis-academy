import.org.json.simple.*
public class JsonDecodeEncode {
    public static void main(String[] args) {
        JSONParser parser = new JSONParser();
        //bentuk string dalam java yang akan dijadikan array
        String s = "[0,{\"1\":{\"2\":{\"3\":{\"4\":[5,{\"6\":7}]}}}}]";
         try {
            Object obj - paraser.parse(s);
            JSONArray array = (JSONArray)obj;

            System,out,println("The 2nd element of array");
            System.out.println(array.get(1));

            JSONObject obj2 - (JSONObject)array.get(1);
            System.out.println("Field 1")
            System.out.println(obj2.get("1"));
            
         } catch (ParseException e) {
             //TODO: handle exception
             System.out.println("position : "+e.getPosition());
             System.out.println(e);
         }
    }
}