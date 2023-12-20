package C14Interface.BankService;

import java.util.Scanner;

//사용자 요청처리
public class BankController {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.println("1.계좌번호 설정하기, 2.");
        int inputs_int = myScan.nextInt();
        BankAcount acount = new BankAcount("1234", 5);
        BankService myka = new BankapayService() {};
        myka.Deposit(acount, 15);
        myka.Withdraw(acount, 3);
        BankService mycard = new BankapayService() {};
        mycard.Deposit(acount, 15);
        mycard.Withdraw(acount, 3);


    }
}
