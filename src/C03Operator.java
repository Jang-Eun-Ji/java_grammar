public class C03Operator {
    public static void main(String[] args) {
//        int num1 = 8, num2 = 3;
////        * 곱하기, /나눗셈, %나머지
//        System.out.println("num1 + num2 = " + (num1 + num2));
//        System.out.println("num1 - num2 = " + (num1 - num2));
//        System.out.println("num1 * num2 = " + (num1 * num2));
//        System.out.println("num1 / num2 = " + ((double)num1 / num2));
//        System.out.println("num1 % num2 = " + (num1 % num2));
//
////        대입연산자 a += 20 ==> a = a+20
//        int n1 = 10, n2 = 3, n3 = 7;
//        n1 = n1 -3;
//        n2 -=3;
//        n3 =-3;
//
//        int n4 = 10; int n5 =10;
//        n4 /= 3;
//        System.out.println("n4 = " + n4);
//        n5 %= 3;
//        System.out.println("n5 = " + n5);
//
////        증감연산자
////        전위증감연산자: 현재 라인의 명령문이 실행되기 전에 값이 증감 - ++x. --x
////        후위증감연산자: 현재 라인의 명령문이 실행되기 후에 값이 증감 x++, x--
//
//        int a= 5;
//        int b = a++; // 후위연산자: 실행문이 끝나고 증감
//        System.out.println(a); //5
//        System.out.println(b); //6
//
//
//        a = 5;
//        b = ++a;
//        System.out.println(a); //6
//        System.out.println(b); //6

        char char1 = 'a';
        char char2 = 'A';
        System.out.println(char1 == char2); //false ()안의 연산 결과가 boolean타입으로 반환된다.
        System.out.println((char1 != char2)); //true

//        논리연산자: &&, ||, !
        int num1 = 10; int num2 = 20;
        boolean result1, result2;
//        result1에 num1이 5보다 큰지 num1이 20 보다 작은지 조건을 and 조건을 통해 boolean 담기
        result1 = num1 > 5 && num1 < 20;
        System.out.println("result1 = " + result1);

//        result2에 num2가 10보다 작은 조건과 num2rk 30보다 작은 조건을 or 조건을 통해 boolean 값 담기
        result2 = num2 <10 || num2 <30;
        System.out.println("result2 = " + result2);

//       (자주 안씀) 비트연산자: &, 2진수의 각 수마다 1이 하나라도 있으면 1로 출력 둘다 0이면 0출력
        System.out.println(2 & 1);
        System.out.println(2>0 & 3>0);

        int n1 = 10; int n2 = 20;



    }
}
