package problem1;

import problem1.Person;

public class Driver extends Person {

    final String name;

    int age;

    boolean isLicensed;

    public Driver(String name, int age){
        this.name = name;
        this.age = age;
        if(age >= 16)
            this.isLicensed = true;
        else
            this.isLicensed = false;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isLicensed() {
        return isLicensed;
    }

    @Override
    public void getDetails() {
        System.out.println("Printing Details:\nName: "+ getName() +"\nAge: "+getAge()+"\nIs Licensed: "+isLicensed()+"\n");
    }
}
