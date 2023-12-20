package C13Inheritance_Test;

import C13Inheritance.C1304ProtectedClass; //import를 할때 src기준으로 컴파일 파일을 찾는다.

public class ProtectedMain extends C1304ProtectedClass{
    public static void main(String[] args) {
//        C1304ProtectedClass pt = new C1304ProtectedClass();
//        System.out.println(pt.st4); // 다른패키지 내에서는 public만 호출가능하댜

        ProtectedMain pm = new ProtectedMain(); //이패키지 안에서만 상속관계가 정의되어있어서 이걸로 객체만들어야함
//        상속한 객체에서 protected변수 접근 가능
        System.out.println(pm.st3);
        System.out.println(pm.st3);

    }
}
