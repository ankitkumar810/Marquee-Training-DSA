package Encapsulation;

class BankAcc{
    private double balance;

    public void setBalance (double balance) {
        this.balance = balance;
    }

    public void deposit(double amount){
        this.balance += amount;
    }

    public void withdraw(double amount){
        this.balance -= amount;
    }

    public double getBalance(){
        return balance;
    }
}

public class Main {
    public static void main(String[] args) {
        BankAcc acc = new BankAcc();
        acc.setBalance(10000.00);
        System.out.println(acc.getBalance());
        acc.deposit(500.00);
        System.out.println(acc.getBalance());
        acc.withdraw(200);
        System.out.println(acc.getBalance());
    }
}


//Encapsulation
//Definition (Simple)
//Encapsulation is the process of wrapping data (variables) and methods into a single unit (class) and restricting direct access to the data using access modifiers.
//Technical Definition
//Encapsulation is an OOP principle that binds data members and member functions together into a single unit (class) while protecting the data using access modifiers such as private, public, and protected.