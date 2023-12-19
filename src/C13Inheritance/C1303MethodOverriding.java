package C13Inheritance;

import java.util.LinkedList;
import java.util.List;
import java.util.SimpleTimeZone;

public class C1303MethodOverriding {
    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.sound();
        Cat cat = new Cat();
        cat.sound();
        Animal animal = new Animal();
        animal.sound();
        dog.sound();

//        상속관계일때 부모클래스 타입을 자식클래스객체의 타입으로 출력 가능
        Animal dog1 = new Dog();
        dog1.sound();
//      Animal클래스에 정의된 메소드만 사용가능하도록 제약이 발생
//        Animal myDog = new Dog();
//        myDog.sound2();

        List<String> myList = new LinkedList<>();



    }
}
class Animal{
    int a = 10;
    void sound(){
        System.out.println("동물은 소리를 냅니다.");
    }

}
class Dog extends Animal{
    void sound(){
        System.out.println("멍멍");
    }
    void sound2(){
        System.out.println("멍멍멍");
    }
    Dog(){
        super();
    }
}
class Cat extends Animal{
    void sound(){
        System.out.println("야옹");
    }
    Cat(){
        super();
    }

}