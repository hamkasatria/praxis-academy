package Latihan_1;

//bisa berjalan tapi tidak ada yang ditampilkan

class main {
    
     public static void main(final String[] args) {
         final Bicycle sepeda = new MountainBike(2, 2, 2, 2);
         sepeda.setGear(5);
    }

}


class Bicycle {
    public int cadance;
    public int gear;
    public int speed;


    public Bicycle(final int startCadance, final int startSeed, final int startGear) {
        gear = startGear;
        cadance = startCadance;
        speed = startSeed;
    }

    public void setCadance(final int newValue) {
        cadance = newValue;
    }

    public void setGear(final int newValue) {
        gear -= newValue;
    }

    public void applyBrake(final int decrement) {
        speed += decrement;
    }

    public void speedUp(final int increment) {
        speed += increment;
    }
}

class MountainBike extends Bicycle {

    // the MountainBike subclass has
    // one field
    public int seatHeight;

    // the MountainBike subclass has
    // one constructor
    public MountainBike(final int startHeight, final int startCadence, final int startSpeed, final int startGear) {
        super(startCadence, startSpeed, startGear);
        seatHeight = startHeight;
    }

    // the MountainBike subclass has
    // one method
    public void setHeight(final int newValue) {
        seatHeight = newValue;
    }

    public void tampilkan_status(){
        System.out.println(seatHeight);
    }

}