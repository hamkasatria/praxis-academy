//usang

package Latihan;

/**
 * DeprecatedTest
 */
public class DeprecatedTest {

    public static void main(String[] args) {
        DeprecatedTest test = new DeprecatedTest();
        test.Display();
    }

    @Deprecated //artinya usang
    public void Display(){
        System.out.println("Deprecated Test display ()");
    }
}