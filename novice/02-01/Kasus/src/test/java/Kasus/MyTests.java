package Kasus;
//tidak bisa import package. sepertinay memerlukan sebuah dependency
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.test;

import jdk.jfr.Timestamp;

public class MyTests {

    @Test 
    public void multi(){
        MyClass tester = new Myclass();
        //assert statements
        assertEquals(0, tester.multiply(10, 0), "10 x 0 must be 0");
        assertEquals(0, tester.multiply(0, 10), "0 x 10 must be 0");
        assertEquals(0, tester.multiply(0, 0), "0 x 0 must be 0");
        // assert statements
        assertEquals(0, tester.multiply(10, 0), "10 x 0 must be 0");
        assertEquals(0, tester.multiply(0, 10), "0 x 10 must be 0");
        assertEquals(0, tester.multiply(0, 0), "0 x 0 must be 0");
    }
}