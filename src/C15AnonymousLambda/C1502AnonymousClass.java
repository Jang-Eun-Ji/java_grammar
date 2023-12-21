package C15AnonymousLambda;

public class C1502AnonymousClass {
    public static void main(String[] args) {
//        클래스명이 Animal 아닌 이름없는 익명클래스와 객체를 동시에 생성
        Animal dog = new Animal() {
            @Override
            public void makeSound(int n, int n2) {
                System.out.println("멍멍" + n + n2);
            }
        };
        dog.makeSound(1,2);
//        () ->
//        익명객체에 구현메소드가 1개밖에 없을 경우에 람다표현식(화상표함수)로 표현가능
//        ()부분에 매개변수 지정하여 구현체에서 활용, 구현함수가 1개라 int인지 알아서 생략가능
//        변수의 개수가 많을때는 개수에 맞춰 지정
        Animal cat = (n, n2) -> System.out.println("냥냥" + n + n2);
        cat.makeSound(10,20);
    }
}
interface Animal{
    void makeSound(int n1, int n2);

}

