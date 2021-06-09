package cw.otherHW;

public class Account {
    private String number;
    private long balance;
    private boolean isLocked;

    public Account(String number, long balance, boolean isLocked) {
        this.number = number;
        this.balance = balance;
        this.isLocked = isLocked;
    }

    public String getNumber() {
        return number;
    }

    public long getBalance() {
        return balance;
    }

    public boolean isLocked() {
        return isLocked;
    }

    @Override
    public String toString() {
        return "Account{" +
                "number='" + number + '\'' +
                ", balance=" + balance +
                ", isLooked=" + isLocked +
                '}';
    }
}
