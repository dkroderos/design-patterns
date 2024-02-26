public class ActiveState implements AccountState {
    public void deposit(Account account, Double depositAmount) {
        var currentBalance = this.account.getBalance();
        account.setBalance(currentBalance + depositAmount);
    }

    public void withdraw(Account account, Double withdrawAmount) {
        var currentBalance = this.account.getBalance();
        account.setBalance(currentBalance - withdrawAmount);
    }

    public void activate() {
        System.out.println("Account is already activated");
    }

    public void suspend() {
        this.account.setAccountState(new SuspendedState(this.account));
    }

    public void close() {
        this.account.setAccountState(new ClosedState(this.account));
    }
}