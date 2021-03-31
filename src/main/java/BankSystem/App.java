package BankSystem;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Card card = new Card();
        card.setCardid("4140-4980-2116-4305");
        card.setPin("0000");

        Account account = new Account(card);
        account.setOwner("Bogdan");
        account.setBalance(1000.0);

        Bank bank = new Bank(account);
        ATM atm = new ATM(bank);

        if (atm.insertCard(card,card.getPin())) {
            atm.changePin("0000", "2010");
            atm.checkMoney(account);
            atm.withdraw(200);
            atm.checkMoney(account);
            atm.insertCard(card, "2010");
            atm.insertCard(card, "2030");

        }
    }
}
