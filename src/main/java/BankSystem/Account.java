package BankSystem;

public class Account {


    public Account(Card card) {
        this.card = card;
    }

    private String owner;
    private double balance;
    Card card;

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
