package atmachine;
public class BankDatabase {
    private Account[] accounts;
    
    
    //bank data or Information 
    public BankDatabase() {
        accounts = new Account[2];
        //account no.    password   amount   
        accounts[0] = new Account( 17701069, 96010771, 90000.0, 100000.0 );
        accounts[1] = new Account( 12345, 54321, 1000.0, 1200.0 );
    }
    
    private Account getAccount( int accountNumber ) {
        for ( Account currentAccount : accounts ) {
            if( currentAccount.getAccountNumber() == accountNumber )
                return currentAccount;
        }
        return null; // if no matching account was found, return null
    }
    
    public boolean authenticateUser(int userAccountNumber, int userPIN) {
        Account userAccount = getAccount( userAccountNumber );
        
        if ( userAccount != null )
            return userAccount.validatePIN(userPIN);
        else
            return false;
    }
    
    public double getTotalBalance(int userAccountNumber) {
        return getAccount( userAccountNumber ).getTotalBalance();
    }
    
    public double getAvailableBalance(int userAccountNumber) {
        return getAccount( userAccountNumber ).getAvailableBalance();
    }
    
    public void credit(int userAccountNumber, double amount) {
        getAccount(userAccountNumber).credit(amount);
    }
    
    public void debit(int userAccountNumber, double amount) {
        getAccount(userAccountNumber).debit(amount);
    }
}
