package atmachine;
public abstract class Transaction {
    private int accountNumber;
    private Screen screen;
    private BankDatabase bankDatabase;
    
    public Transaction(int userAccountNumber, Screen atmScreen, BankDatabase atmBankDatabase) {
        accountNumber = userAccountNumber;
        screen = atmScreen;
        bankDatabase = atmBankDatabase;
    }
    
    //return acc no.
    public int getAccountNumber() {
        return accountNumber;
    }
    
    //end mtd.
    public Screen getScreen() {
        return screen;
    }
    //ref.
    public BankDatabase getBankDatabase() {
        return bankDatabase;
    }
    
    abstract public void execute();
}
