package problem4;

public class Vehicle {

    int gear;
    int speed;

    public Vehicle(int gear, int speed){
        this.gear = gear;
        this.speed = speed;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void accelerate(int increase){
        this.setSpeed(getSpeed()+increase);
    }

    public void brake(int decrease){
        this.setSpeed(getSpeed()-decrease);
    }

    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append("Gear: "+getGear()+"\nSpeed: "+getSpeed()+"\n");
        System.out.println(builder);
        return builder.toString();
    }
}
