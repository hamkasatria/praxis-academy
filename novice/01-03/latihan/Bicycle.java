//package latihan;

public class Bicycle{
    int cadence = 0;
    int speed = 0;
    int gear = 1;

    void changeCandance(int newValue){
        cadence = newValue;
    }

    void changeGear(int newValue){
        gear = newValue;
    }

    void speedUp(int increment){
        speed = speed+increment;
    }

    void applyBrakes(int decrement){
        speed = speed - decrement;
    }

    void printState(){
        System.out.printl("cadence : "+ cadence + "speed : "+ speed + "gear"+gear);
    }
}