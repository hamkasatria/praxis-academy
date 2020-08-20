import java.util.Vector;
import java.util.Enumeration;

public class EnumerationTest{
    public static void main(String[] args) {
        Enumeration days;
        Vector<String> dayNames = new Vector();

        dayNames.add("Sunday");
        dayNames.add("Monday");
        dayNames.add("Tuseday");

        days=dayNames.elements();

        while(days.hasMoreElements()){
            System.out.println(days.nextElement());
        }
    }
}