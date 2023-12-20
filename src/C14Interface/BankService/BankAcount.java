package C14Interface.BankService;

public class BankAcount {
    private String account_number;
    private int balance;
    BankAcount(String account_number, int balance) {
        this.account_number = account_number;
        this.balance = balance;
    }
    public String getAccount_number() {
        return account_number;
    }

    public int getBalance() {
        return balance;
    }

    public void setAccount_number(String account_number) {
        this.account_number = account_number;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int checkBalance(int balance) {
        return balance;
    }
}
