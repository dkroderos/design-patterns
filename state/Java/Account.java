public class Account {
    private String accountNumber;
    private Double balance;
    private AccountState accountState;

    public Account(String accountNumber, Double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountState = new ActiveState(this);
    }

    public void deposit(Double depositAmount) {
        this.accountState.deposit(this, depositAmount);
        System.out.println(this.toString());
    }

    public void withdraw(Double withdrawAmount) {
        accountState.withdraw(this, withdrawAmount);
        System.out.println(this.toString());
    }

    public void activate() {
        accountState.activate();
        this.accountState = new ActiveState();
    }

    public void suspend() {
        accountState.suspend();
    }

    public void close() {
        accountState.close();
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public Double getBalance() {
        return this.balance;
    }
    
    public void setAccountState(AccountState accountState) {
        this.accountState = accountState;
    }
    
    @Override
    public String toString() {
        return "Account Number: " + this.accountNumber + "\n" + 
        "Balance: " + this.balance + "\n";
    }
}