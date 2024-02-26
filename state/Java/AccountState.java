public interface AccountState {
    // deposit, withdraw, activate, suspend, and close.
    void deposit(Account account, Double depositAmount);
    void withdraw(Account account, Double withdrawAmount);
    void activate();
    void suspend();
    void close();
}