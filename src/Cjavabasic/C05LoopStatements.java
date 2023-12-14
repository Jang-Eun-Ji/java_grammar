package Cjavabasic;

import java.util.Scanner;

public class C05LoopStatements {
    public static void main(String[] args) {
        //2부터 10까지 출력하는 while예제
//        int a = 2;
//        while (a < 11){
//            System.out.println(a);
//            a ++;
//        }

        // while을 이용한 구구단 산출 방법
        Scanner sc = new Scanner(System.in);
//        while (true) {
//            System.out.println("구구단 단수 입력해라");
//            int input = sc.nextInt();
////        System.out.println(input + " X " + 1 + " = " + input*1);
////        System.out.println(input + " X " + 2 + " = " + input*2);
////        System.out.println(input + " X " + 3 + " = " + input*3);
////        System.out.println(input + " X " + 4 + " = " + input*4);
////        System.out.println(input + " X " + 5 + " = " + input*5);
////        System.out.println(input + " X " + 6 + " = " + input*6);
////        System.out.println(input + " X " + 7 + " = " + input*7);
////        System.out.println(input + " X " + 8 + " = " + input*8);
////        System.out.println(input + " X " + 9 + " = " + input*9);
//
//            int mn = 1;
//            while (mn < 10) {
//                System.out.println(input + " X " + mn + " = " + input * mn);
//                mn++;
//            }

//        int times = 0;
//        while ( times < 5) {
//            String password = "0234"; // 0으로 시작하면 db에 0은 안들어간다 따라서 String로 쓰기
//            System.out.println("비밀번호를 입력해주세요");
//            String inputs = sc.nextLine();
//            if (password.equals(inputs)) {
//                System.out.println("문이 열렸습니다.");
//                break;
//            } else {
//                System.out.println("비밀번호가 틀렸습니다.");
//            }
//            times++;
//
//            if (times == 5){
//                System.out.println("입력횟수 초과");
//                break;
//
//            }
//
//        }

        //2부터 10까지 출력하는 do while예제

//        int a = 2;
//        do {
//            System.out.println(a);
//            a ++;
//        }
//        while (a < 11);

        // for 문을 통해서 2~10 출력 for(초기식; 조건식; 증감식)
//        int a;
//        for(a = 2; a < 11; a++){
//            System.out.println(a);
//        }

//        continue는 다시 조건문 부터 실행하기
//        int num1 = 0;
//        for(num1 = 1; num1 < 11; num1++){
//            if(num1%2 == 0){
//                continue;
//            }
//            System.out.println(num1);
//        }

        //라벨문
//        loop1:
//        for(int i = 0; i<5; i++){
//            for(int j = 0; j<5; j++){
//                System.out.println("hello world");
//                if(j == 2){
//                    break loop1; //loop1이 없이 하면 15번인데 있어서 3번만에 끝남
//                }
//            }
//        }

        // 라벨문 활용1
//        int[][] matrix = {{1, 2, 3, 4}, {5, 6, 7}, {8, 9, 10}, {11, 12, 13, 14}};
//        int target = 11;
//        loop2:
//        for (int i = 0; i < matrix.length; i++) {
//            for (int k = 0; k < matrix[i].length; k++) {
//                if (matrix[i][k] == 11) {
//                    System.out.println("matrix " + i + " and " + k);
//                    break loop2;
//                }
//            }
//        }
        loop3:
        for(int num = 1; num < 21; num ++){
            int a = 0; //a가 한 num씩 돌 때마다 리셋 되어야 함
            for (int d = 1; d <= num; d ++){
                if (num % d == 0){
                   a +=1;
                }
                if (a == 5){
                    System.out.println(num);
                    break loop3;
                }
            }
        }
    }
}



