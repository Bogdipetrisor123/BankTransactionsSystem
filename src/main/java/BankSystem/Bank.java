package BankSystem;

public class Bank {
    Account account;
    public Bank(Account account){
        this.account = account;
    }

    public String executeTransaction(Transcation transcation){
        return transcation.execute(account);
    }
    public Account getAccountByCardId(String cardId){
        if (account.card.getCardid().equals(cardId)){
            return account;
        }
        return null;
    }
}
//ATM->BANK->Transcation
