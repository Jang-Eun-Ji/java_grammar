package C14Interface;

public class StaticFinalInterface {
    public static void main(String[] args) {
        MyInterface mi = new MyImplements();//좌측에 인터페이스를 적는 이유는 임플리먼트가 바뀌어도 우측 new 임플리먼트만 바꾸면 됨 바꿔줘도됨
        mi.methodA();
        MyImplements mk = new MyImplements();
        mk.methodA(); //우측 임플리먼트에 있는것이 실행된다.
        System.out.println(mi.my_constant);
    }
}
interface MyInterface{
//    아래 변수는 컴파일타임에 static final이 붙는다.
    int my_constant = 100;
    void methodA();
}

class MyImplements implements MyInterface{
    @Override
    public void methodA() {
        System.out.println("임플리먼트의 메소드A");
    }
}
//인터페이스, 추상클래스 차이 - 추상클래스안에는 그냥 메소드가 들어가 있지만 인터페이스는 전부 따라서 목적성과 활용도가 다름