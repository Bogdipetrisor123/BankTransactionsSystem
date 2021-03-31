package BankSystem;

public class WithdrawMoney extends Transcation {

    private double amount;
    public WithdrawMoney(double amount){
        this.amount = amount;
    }
    @Override
    public String execute(Account account)
    {
        account.setBalance(account.getBalance()-amount);
        return "New account balance is: "+account.getBalance();
    }


}

