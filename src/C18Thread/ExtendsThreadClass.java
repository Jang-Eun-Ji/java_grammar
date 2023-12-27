package C18Thread;
//Thread클래스에 이미 구현되어 있는 run메소드는 아무작업도 하지 않는 빈 메소드다
//작업하고 싶은 메소드를 run()메소드를 overriding하여 정의 할 수있다.
//상속관계이다 보니, 다른 클래스 상속불가: 단저 -> Runnable 대체
public class ExtendsThreadClass extends Thread{
//    run메소드는 스레드가 시작되면 실행
    @Override
    public void run(){
        System.out.println("ExtendsThreadClass :"+ Thread.currentThread().getName());
    }
}
