package Cjavabasic;

import java.util.Scanner;

public class C01inputoutput {
    public static void main(String[] args) {

        int a = 20;
//       print는 출력후 줄바꿈 없음,println은 줄바꿈
        System.out.print("a = " + a);
        String mystring = "hello world";
        System.out.println(mystring + a);
//        숫자와 숫자를 더하면 더하기 연산이 된다.
        System.out.println( 10 + 20);

//        입력: System.in(사용자의 키보드 입력) + Scanner(입력을 위한 클래스)
//                                    매개변수
        Scanner myScan = new Scanner(System.in);
        System.out.println("아무 문자열을 입력해주세요");

//        nextLine은 입력 받은 데이터를 한 줄 읽어서, String으로 리턴
        String inputs = myScan.nextLine();
        System.out.println("사용자가 입력한 문자열은: " + inputs);

//        nextInt는 입력받은 데이터를 한줄 읽어서, int로 리턴
        int inputs_int = myScan.nextInt();
        System.out.println("사용자가 입력한 숫자는: " + inputs_int);

        System.out.println("더하기 할 숫자 2개를 입력해주세요");
        int inputs_int1 = myScan.nextInt();
        int inputs_int2 = myScan.nextInt();
        System.out.println("사용자가 입력한 두 수를 더한 값은 " +(inputs_int1 + inputs_int2));

        System.out.println("실수 입력");
        double input_double = myScan.nextDouble();
        System.out.println(input_double);

        System.out.println("boolean타입 입력");
        boolean input_boolean = myScan.nextBoolean();
        System.out.println(input_boolean);

        //입출력 시스템 메모리 해제
//        myScan.close();


    }
}
