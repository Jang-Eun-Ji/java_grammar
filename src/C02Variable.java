import java.math.BigDecimal;

public class C02Variable {
    public static void main(String[] args) {
//        byte로 썼을때 -128 ~127까지의 표현이 가능하고, 그 이상을 세팅할 때 오버/언더 플로우 발생
//        byte num1 = 127;
//        byte num2 = -128;
//
//        num1++;
//        num2--;
//        System.out.println("num1: " + num1);
//        System.out.println("num2: " + num2);
//        실수: float, double(기본)
//          부동소수점 방식이 표준이라 2진수로 변환하여 저장하느라 오차가 발생함
        float f1 = 1.23456789f;
        double b1 = 1.23456789;

        System.out.println("f1: " + f1);
        System.out.println("b1: " + b1);

//        부동소수점 오차 테스트
        double double_num = 0.1;
//        미세오차는 조정되어 정상적으로 출력
        System.out.println(double_num);
//        반복적인 연산시 오차가 확대 되어 오차 확인가능
//        for(int i =0; i < 100; i++ ){
//            System.out.println(i);
//        }

        double kk = 0;
        for(int i = 0; i < 1000; i++) {
            kk = kk + 0.1 *10;
        }
        System.out.println("kk = " + kk/10);

        double d1 = 1.03;
        double d2 = 0.42;
        System.out.println(d1 - d2);

//        저장할때는 문자열 -> 연산할때는 정수로 변환 -> 최종결과는 실수로 변환 // 더 정확한 소수점 연산때 쓰기
        BigDecimal myBig1 = new BigDecimal("1.03");
        BigDecimal myBig2 = new BigDecimal("0.42");
        System.out.println(myBig1.subtract(myBig2));

//        문자: char -- 하나의 문자만 저장 가능 꼭 '' 쓰기
//        char my_chat = '가';
//        System.out.println(my_chat);
//
////        boolean: true(1) or false(0) - 기본형이 false임
//        boolean my_bool = true;
//        System.out.println(my_bool);
////        이 자리에 true가 들어와 실행문이 실행된다.
//        if(my_bool){
//            System.out.println("조건식이 참입니다.");
//        }
//        int bool_num1 = 20;
//        int bool_num2 = 10;
//        if(bool_num1 > bool_num2){
//            System.out.println("조건식이 참입니다.");
//        }

//        묵시적 타입변환
//        char ch1 = 'a';
//        int ch1_num = ch1;
//        System.out.println(ch1_num);
//          chat 형 알파벳 비교를 위한 묵시적 타입변환이 일어난다.
        System.out.println('A'>'a'); //false


//        int myInt1 = 10;
//        double myDouble1 = myInt1;
//        System.out.println(myDouble1);
////        에러 발생: myInt1 = myDouble1;
////        double -> int 명시적 타입은 가능: 소수점 값 손실 발생 가능성이 있다.
//            myInt1 = (int)myDouble1;
//            double myDouble2 = 7.2f + 3;
//        System.out.println("myDouble2 = " + myDouble2);

//        명시적 타입변환
        char my_char2 = 'b';
        int char_num = (int)my_char2;

        int a = 1;
        int b = 4;

        int c = a / b;
        double d = a / b; // 이미 a,b가 int라서 자바에서 인트값을 예상해버림
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        
        double dd2 = (double)a/(double)b;
        System.out.println("d2 = " + dd2);


//        변수와 상수
//        선언과 동시에 초기화

        int a1 = 10;
//    변수값 변경, int는 처음에만 쓰기 초기화할때만 쓰기
        a1 = 20;
//        선언만 한 뒤에 나중에 초기화
        int a2; // 선언만 됐을때는 값이 0으로 초기화

        a2 = 20;
        // 객체로 만들때는 0으로 초기화
        System.out.println("a2 = " + a2);
//        상수는 값의 재할당이 불가능
        final int AGES =20;
//      상수는 값의 변경이 불가능 ->  AGES =30; 에러 발생
//        상수는 선언만 한 뒤에 나중에 초기화 한 방식이 java8 이전에는 안됐었지만, 이후 가능해짐.

//        !!!! int는 선언만 할 경우 0이 할당, String은 선언만 할 경우 null이 할당 !!!!!
    }
}
