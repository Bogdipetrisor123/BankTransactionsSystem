package BankSystem;

public class ChangePin extends Transcation {
    public String oldPin;
    public String newPin;
    public ChangePin(String oldPin, String newPin){
        this.oldPin = oldPin;
        this.newPin = newPin;
    }
    @Override
    public String execute(Account account) {
        if (account.card.getPin().equals(oldPin)){
            account.card.setPin(newPin);
            System.out.println("Card pin: "+account.card.getPin());
        }else System.out.println("You have enter a wrong ping.");
        return null;
    }
}
