/**
 * Created by Farhoud on 11/01/2016.
 */
class BankAccount {
    private float balance;

    public void deposit(float amount) {
        this.balance += amount;
    }

    public float showBalance() {
        return this.balance;
    }

    BankAccount() {
        balance = 100;
    }
}
