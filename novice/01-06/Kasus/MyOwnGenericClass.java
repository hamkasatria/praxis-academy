package Kausus;

public class MyOwnGenericClass {
   //create instance of Pair<F,S> class. Lets call it p1
   Number n1 = new Integer(5);
   String n2 = new String("Sun");
   
   Pair<Number,String> p1= new Pair<Number,String>(n1,n2);
   
   System.out.println("first of p1 (right after creation) = " + p1.getFirst());
   System.out.println("second of p2  (right after creation) = " + p1.getSecond());
  
   // Set internal variables of p1.
   p1.setFirst(new Long(6L));
   p1.setSecond(new String("rises"));
   System.out.println("first of p1(after setting values) = " + p1.getFirst());
   System.out.println("second of p1 (after setting values) = " + p1.getSecond());
}