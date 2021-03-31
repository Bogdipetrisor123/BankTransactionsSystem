package BankSystem;

public class CheckMoney extends Transcation {
    @Override
    public String execute(Account account) {
        System.out.println( "Account balance: "+account.getBalance());
        return "Account balance: "+account.getBalance();
    }
}
