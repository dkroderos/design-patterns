public class ClosedState implements AccountState {
    private Account account;

    public ClosedState(Account account) {
        this.account = account;
    }

    public void deposit(Account account, Double depositAmount) {
        System.out.println("You cannot deposit on closed account");
    }

    public void withdraw(Account account, Double withdrawAmount) {
        System.out.println("You cannot withdraw on closed account");
    }

    public void activate() {
        System.out.println("You cannot activate a closed account");
    }

    public void suspend() {
        System.out.println("You cannot suspend a closed account");
    }

    public void close() {
        System.out.println("Account is already closed");
    }
}