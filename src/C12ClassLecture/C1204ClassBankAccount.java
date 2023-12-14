package C12ClassLecture;

public class C1204ClassBankAccount {
    public static void main(String[] args) {
        Account myAcc1 = new Account("1234");
        System.out.println("myAcc1 = " + myAcc1.getAccountNumber());
        System.out.println("myAcc1 = " + myAcc1.checkBalance(3000));
        myAcc1.Deposit(30000);
        myAcc1.Withdraw(2000);

        
    }
}
class Account{
    private String account_number;
    private int balance;
    //클래스 만들때 마다 별도의 생성자를 만들지 않으면 매개변수 없는 기본생성자가 숨겨져있다.
//    Account(){} -- 기본생성자 형식
//    생성자란 클래스가 객체화 될때 자동으로 실행되는 메소드

    Account(String account_number){
        this.account_number = account_number;
    }
    public String getAccountNumber(){
        return account_number;
    }

    public int checkBalance(int balance) {
        return balance;
    }

    //예금
    public void Deposit(int deposit) {
        this.balance = this.balance + deposit;
        System.out.println(deposit + "원 입금됨");
    }
    //출금
    public void Withdraw(int withdraw) {
        if(this.balance < withdraw){
            System.out.println("잔고 없음");
        }else {
            this.balance = this.balance - withdraw;
            System.out.println(withdraw + "출금 후" +"남은 잔고는" + this.balance );

        }
    }

}