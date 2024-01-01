package Cjavabasic;

import java.util.Scanner;

public class C04IfStatements {
    public static void main(String[] args) {
        //if를 이용한 도어락 예제
//        String password = "0234"; // 0으로 시작하면 db에 0은 안들어간다 따라서 String로 쓰기
        Scanner myScan = new Scanner(System.in);
//        System.out.println("비밀번호를 입력해주세요");
//        String inputs = myScan.nextLine();
//        if(password.equals(inputs)) {
//            System.out.println("문이 열렸습니다.");
//        }else {
//            System.out.println("비밀번호가 틀렸습니다.");
//        }

        // 알파벳 대소문자 비교예제
//        묵시적 타입변환, 각 문자가 숫자를 가지고 있다.
//        a: 97, A:65, B:66
//        사용자한테 알파벳을 아무거나 입력받고, 그 알파벳이 대문자인지 소문자인지 판별
//        System.out.println("알파벳을 입력해");
//
//        char input = myScan.nextLine().charAt(0);
//
//        if(input >= 'a' && input <= 'z') {
//            System.out.println("소문자 입니다.");
//        }else if (input >= 'A' && input <= 'Z'){
//            System.out.println("대문자 입니다.");
//        }else {
//            System.out.println("알파벳이 아님");
//        }


        // 버스카드 예제
//        내 돈이 얼마 있는지를 입력
//
//        System.out.println("잔액, 분실 했는지 입력");
//        int money = myScan.nextInt();
//        boolean missing = myScan.nextBoolean();
//        if (money > 1500 && missing == false) {
//            System.out.println("정상탑승");
//        }else {
//            System.out.println("탑승불가");
//        }


        // 결과값 = 조건식 ? 반환값1 :반환값2의 도어락 예제
//        String password = "0234";
//        System.out.println("비밀번호를 입력해주세요");
//        String inputs = myScan.nextLine();
////        String result = 조건식? 참 : 거짓; // 참과 거짓은 result에 담을 String타입으로 넣으면 됨
//        String result = password.equals(inputs)? "문이 열리네요 그대가 들어오죠" : "다시 입력";
//        System.out.println(result);

        // if else를 사용한 예제. 택시 만원, 버스 3천원, 킥보드 2천원
//        int myMoney = 10000;
//        if (myMoney >= 10000){
//            System.out.println("택시탐");
//        }else if (myMoney >= 3000){
//            System.out.println("버스탐");
//        }else if(myMoney >= 2000){
//            System.out.println("킥보드 탐");
//        }
//        else {
//            System.out.println("걸어감");
//        }

//        switch(비교대상의 변수){case1: 명령문; break; case2: 명령문; break; default: 명령문; break;}
       //고객센터 전화번호 예시
//        System.out.println("원하시는 서비스 번호 입력");
//        int number = myScan.nextInt();
//        switch (number) {
//            case 1 :
//                System.out.println("대출서비스 입니다.");
//                break;
//            case 2 :
//                System.out.println("예금");
//                break;
//            case 3 :
//                System.out.println("적금");
//                break;
//            case 0 :
//                System.out.println("상담사 연결");
//                break;
//            default :
//                System.out.println("잘못 누르셨습니다.");
//                break;
//        }
//        int a = 2;
//        while (a < 11){
//            System.out.println(a);
//            a ++;
//        }
    }
}
