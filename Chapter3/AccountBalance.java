package Chapter3;

public class AccountBalance {
    private String name;
    private double balance;

    public AccountBalance(String name, double balance) {
        this.name = name;

        if (balance > 0.0) {
            this.balance = balance;

        }
    }

    public double deposit(double depositAmount) {
        if (depositAmount > 0.0) {
            balance = balance + depositAmount;
        }
        return depositAmount;
    }

    public double getBalance() {
        return balance;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}

