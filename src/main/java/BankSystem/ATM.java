package BankSystem;

public class ATM {
    Bank bank;
    Card card;

    public ATM(Bank bank) {
        this.bank = bank;
    }

    public void changePin(String oldPin, String newPin) {
            Transcation changePin = new ChangePin(oldPin, newPin);
            bank.executeTransaction(changePin);
        }


    public void withdraw(double amount) {

        Transcation withdrawMoney = new WithdrawMoney(amount);
        bank.executeTransaction(withdrawMoney);
    }

    public void checkMoney(Account account) {
        Transcation checkMoney = new CheckMoney();
        checkMoney.execute(account);
    }

    public boolean insertCard(Card card, String pin) {
        if (card.getPin().equals(pin)) {
            System.out.println("Corect");
            return true;
        } else {
            System.out.println("incorrect pin");
            return false;
        }
    }

    public void removeCard() {
        card = null;
    }
}
