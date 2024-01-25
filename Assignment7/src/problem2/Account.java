package problem2;

public class Account extends Customer {

    long accountNumber;
    public Account(String name, String address, int number, long accountNumber){
        super(name, address, number);
        this.accountNumber = accountNumber;
    }

    public long getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public void mailCheck(){
        System.out.println("A check has arrived in the mail for:\nName: "+getName()+"\nAddress: "+getAddress()+"\nNumber: "+getNumber()+"\nAcct No: "+getAccountNumber());
    }
}
