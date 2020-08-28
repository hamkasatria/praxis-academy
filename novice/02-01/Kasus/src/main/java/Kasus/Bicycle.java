package Kasus;

 






class Bicycle{
    int cadence = 0;
    int speed = 0;
    int gear = 1;

    void changeCandance(int newValue){
        cadence = newValue;
    }

    void changeGear(int newValue){
        gear = newValue;
    }

    public int speedUp(int increment){
    
        speed = speed+increment;
        return speed;
    }

    void applyBrakes(int decrement){
        speed = speed - decrement;
    }

    void printState(){
        System.out.println("cadence : "+ cadence + "speed : "+ speed + "gear"+gear);
    }
}