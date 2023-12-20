package C14Interface.BankService;

public class BankapayService implements BankService {
    @Override
    public void Deposit(BankAcount acount, int money) {
        acount.setBalance(acount.getBalance() + money);
        System.out.println("acount = " + acount.getBalance());
    }

    @Override
    public void Withdraw(BankAcount acount, int withdraw) {
        acount.setBalance(acount.getBalance() - withdraw);
        System.out.println("acount = " + acount.getBalance());
    }

}

