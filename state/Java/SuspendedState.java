public class SuspendedState implements AccountState {
    public void deposit(Account account, Double depositAmount) {
        System.out.println("Account is suspended. Cannot deposit.");
    }

    public void withdraw(Account account, Double withdrawAmount) {
        System.out.println("Account is suspended. Cannot withdraw.");
    }

    public void activate() {
        this.account.setAccountState(new ActiveState(this.account));
        System.out.println("Account is activated");
    }

    public void suspend() {
        System.out.println("Account is already suspended");
    }

    public void close() {
        this.account.setAccountState(new ClosedState(this.account));
        System.out.println("Account is closed");
    }
}