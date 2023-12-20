package C14Interface;

public class InterfaceMain {
    public static void main(String[] args) {
        AnimalInterface1 myCat = new CatImplements(); //오른쪽 cat이 가질수 있는 메소드가 더 크다(여러개 상속이 가능함/멀티 implements가능)
        myCat.makeSounds();
        AnimalInterface1 myDog = new DogImplements();
        myDog.makeSounds();

//      new쓸때 제일 앞부분을 여러 클래스가 가능하단거 -   다형성이란 하나의 객체가 여러개의 참조변수를 가질수 있음을 의미

        CatMultiImplements myMultiCat = new CatMultiImplements();

        myMultiCat.makeSounds();
//        타입을 interface1으로 선언하면 interface2에 정의된 메서드는 사용불가
//        System.out.println(myMultiCat.play("동구", "옹심"));
        DogMultiImplements myMultiDog = new DogMultiImplements();
//        System.out.println(myMultiDog.play("젤리", "웰시코기"));
//        myMultiDog.makeSounds();

//        기본적으로 추상클래스, 인터페이스는 객체 생성이 불가능하다. 익명내부 클래스 방식으로 사용가능
        AnimalInterface1 ai = new AnimalInterface1() {
            @Override
            public void makeSounds() {

            }
        };

    }
}
