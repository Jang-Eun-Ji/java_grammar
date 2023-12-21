package C15AnonymousLambda;

public class Test {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("새로 만든 쓰레드 입니다.");
            }
        });

        t1.start();
        System.out.println("main의 쓰레드 입니다.");

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("새로 만든 쓰레드 입니다.");
            }
        });
        t2.start();
        new Thread(() -> System.out.println("새로만든 쓰레드 입니다.")).start();
        System.out.println("main의 쓰레드 입니다.");



    }
}
