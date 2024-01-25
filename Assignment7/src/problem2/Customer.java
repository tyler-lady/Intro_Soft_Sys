package problem2;

public class Customer {

    String name;
    String address;
    int number;

    public Customer(String name, String address, int number){
        this.name = name;
        this.address = address;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void mailCheck(){
        System.out.println("A check has arrived in the mail for:\nName: "+getName()+"\nAddress: "+getAddress()+"\nNumber: "+getNumber()+"\n");
    }
}
