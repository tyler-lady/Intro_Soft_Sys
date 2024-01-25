package problem4;

public class Car extends Vehicle {

    int mileage;

    public Car(int gear, int speed, int mileage){
        super(gear, speed);
        this.mileage = mileage;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append("Gear: "+getGear()+"\nSpeed: "+getSpeed()+"\n" + "Mileage: " + getMileage()+"\n");
        System.out.println(builder);
        return builder.toString();
    }
}
