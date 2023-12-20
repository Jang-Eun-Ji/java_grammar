//import java.util.*; :util하위의 모든 클래스/인터페이스 파일 import가능
//import java.* 불가능, 특정 패키지의 하위패키지의 모든 파일까지 import하는 것은 불가능
//폴더 == 패키지
package C13Inheritance;

//public class C1305Others extends {
////    final 상속, 오버라이딩이 다 안됨
//}
public class C1305Others {
//    final 상속, 오버라이딩이 다 안됨
    public static void main(String[] args) {
        C1305Dog myDog = new C1305Dog();
        myDog.makeSound1();
        myDog.makeSound2();

        C1305Animal myAnimal = new C1305Animal() {
            @Override
            void makeSound1() {

            }
        };
        System.out.println(myDog.getClass());
    }
}
final class FinalClass{

}
abstract class C1305Animal{ //다른 클래스에서 new이렇게 인스턴스 생성 불가, 그리고 상속받은 자식클래스에 무조건 abstract 객체를 받아야함
//    final void makeSound(){
//        System.out.println("동물은 소리를 냅니다.");
//    }
    abstract void makeSound1();
    void makeSound2(){
        System.out.println("makesound2");
    }
}
class C1305Dog extends C1305Animal{
    @Override
    void makeSound1(){
        System.out.println("makesound1");
    }
//    final매소드는 오버라이딩 불가
//    @Override
//    void makeSound(){
//        System.out.println("멍멍");
//    }

}

