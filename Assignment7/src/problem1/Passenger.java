package problem1;

import problem1.Person;

public class Passenger extends Person {

    final String name;

    int age;

    public Passenger(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public void getDetails(){
        System.out.println("Printing Details:\nName: "+ getName() +"\nAge: "+getAge()+"\n");
    }
}
