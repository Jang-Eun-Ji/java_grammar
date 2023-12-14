package Cjavabasic;

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

        int n1 = 5; int n2 = 6;
//        각 자리수가 모두 1인경우만 1
        System.out.println( n1 & n2); //4 => 000100
//        각 자리수가 하나라도 1일경우 1
        System.out.println( n1 | n2); //7 => 000111
//        각 자리수가 일치하지 않을 경우에 1 //  ^ : 대응되는 비트가 서로 다르면 1을 반환함 (비트 XOR연산)
        System.out.println( n1 ^ n2); //3 => 000111
//      ~ : not연산, 각자리마다 반대의 숫자 반환
        System.out.println( ~n1); // 첫쨰자리가 음/양인데 음으로 변황
//        시프트 연산자 : <<, >> => 곱셈과 나눗셈의 효과가 발생
        System.out.println(n1<< 1); //2만큼 곱한거 2의 제곱임

        int a = 13; // 00001101
        int b = 9; // 000010011

        while (true){
            int same_index = a & b;
            a = a ^ b; // XOR연산으로 구한 비트값 a 에 할당
            b = same_index << 1; // 한칸 왼쪽으로 땡김 뒤의 숫자는 2진수로 바꿔서 생각해야함 2면 2의 제곱을 곱한다고 생각
        }
//            첫번째 반본
//            sameindex : 1001
//            a : 0100
//            b : 10010
//            a : 100110





    }
}
