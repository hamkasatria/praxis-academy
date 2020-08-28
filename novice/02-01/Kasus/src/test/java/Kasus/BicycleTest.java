package Kasus;
import org.junit.Test;
import static org.junit.Assert.*;

public class BicycleTest{
    // public static void main(String[] args) {
    //     BicycleTest test = new BicycleTest();
    //     test.testSpeedUP();
    // }

    @Test public void testSpeedUP(){
        Bicycle classUnderTest = new Bicycle();
        //karena classnya void makanya tidak bisa di test
        assertEquals (10, classUnderTest.speedUp(10),0);
    }
}