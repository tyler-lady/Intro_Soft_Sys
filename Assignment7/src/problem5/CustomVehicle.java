package problem5;

import problem1.Driver;
import problem1.Person;

import java.util.List;

public class CustomVehicle {

    int gear;
    int speed;

    List<Person> passengers;

    int capacity;

    public CustomVehicle(int gear, int speed){
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

    public void addPassengers(Person passenger){
        if(this.passengers.size()-1 < capacity)
            this.passengers.add(passenger);
    }

    public void removePassengers(Person passenger){
        this.passengers.remove(passenger);
    }

    public boolean startVehicle(){
        boolean tmp = false;
        Driver d;
        for(Person p: this.passengers){
            if( p instanceof Driver) {
                d = (Driver) p;
                if(d.isLicensed())
                    tmp = true;
            }
        }
        return tmp;
    }

    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append("Gear: "+getGear()+"\nSpeed: "+getSpeed()+"\n");
        System.out.println(builder);
        return builder.toString();
    }
}
