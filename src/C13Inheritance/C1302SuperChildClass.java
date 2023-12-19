package C13Inheritance;
//super():부모클래스의 생성자 의미, super키워드: 부모클래스의 의미
public class C1302SuperChildClass extends SuperParents{ //중복 상속이 안된다. 오버라이드 할때??
    int b;
    int a;
    C1302SuperChildClass(){
        super(100);
        a =  30;
        b = 20;
    }
    void display(){ //우선권은 자식 클래스에 있고, super를 적으면 부모 클레스가 호출됨
        System.out.println(a);
        System.out.println(super.a);
        System.out.println(b);
    }

    public static void main(String[] args) {
        C1302SuperChildClass sc = new C1302SuperChildClass();
        System.out.println(sc.a); //자식 클래스의 a가 나온다.
        sc.display();
    }
}
class SuperParents{
    int a;
    SuperParents(int a){
        this.a = a;
    }
}
