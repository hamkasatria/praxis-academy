//usang

package Latihan;

/**
 * DeprecatedTest
 */


class SuppressWarningTest{
    //@SuppressWarnings({"deprecation","checked"})
    @SuppressWarnings({"checked","deprecation"})
    public static void main(final String[] args) {

        DeprecatedTest test = new DeprecatedTest();
        test.Display();
    }
}

class DeprecatedTest {
    
    @Deprecated
    public void Display(){
        System.out.println("Deprecated Test display ()");
    }

}
