package Cjavabasic;

import java.lang.reflect.Array;
import java.util.*;

public class C05LoopPractice {
    public static void main(String[] args) {
        //짝수의 합 계산하기
        //1~20까지 짝수의 합 출력

//        int sum = 0;
//        for (int n = 1; n < 21; n++) {
//            if(n%2 == 1){
//                sum = sum + n;
//            }
//
//            System.out.println(sum);
//        }


        // 숫자 뒤집기

//        int num = 1234;
////        int o = (num % 10) *1000;
////        int t = ((num % 100 - o)%10)* 100;
////        int h = (num % 1000 - o - t) * 10;
//
//        int result = 0;
//        while (num != 0){
//            int temp = num % 10;
//            result = result * 10 + temp;
//            num = num /10;
//        }
//        System.out.println(result);
//

////        a=24, b= 36
//        int a =24;
//        int b = 36;
//        int max = 0;
//        int min = 0;
//        if (a >b){
//            min = a;
//        }else {
//            min = b;
//        }
//        for (int i = 1; i <= min; i++ ){
//            if(a % i == 0 && b %i == 0){
//                max = i;
//            }
//        }
//        System.out.println("max = " + max);

//        int[] myArr = {1, 5, 7, 9, 10};
//        System.out.println(myArr[0]);
//    //일반 for문
//    for(int i = 0; i<5; i++){
//        System.out.println(myArr[i]);
//    }
//    //enhance for문(배열의 값 그대로 가져오는 방식), 순서가 없는 배열(set, map) 들도 추출이 가능함
////        enhance for은 요소를 참조할 때만 사용 가능함, 요소를
//    for (int a : myArr){
//        System.out.println(a);
//    }

//    일반 for문을 통해 myArr의 값에 10씩 더한 뒤에 출력
//        int a = 0;
//        for(int i = 0; i<5; i++){
//            myArr[i] = myArr[i]+ 10;
//        }
//        System.out.println(Arrays.toString(myArr));
//
//    }
        //enhance for 문으로 값에 10씩 더하기 // enhance는 값을 복사해 오는거라 배열을 바꿀수 없음
//        int sum = 0;
//        for (int e : myArr) {
//            e = e + 10;
//        }
//        System.out.println(myArr);
//
//        int num = 10;
//        if(num > 1){
//            int abc = 20;
//            num = 20;
//        }
//        System.out.println(num); // if문 밖에서 선언된 변수값을 if안에서 접근하여 변경하는 것은 가능
//        System.out.println(abc); if문 안에서 정의된 변수는 밖에서 인지 불가

//        for(int i = 2; i < 9; i++){
//            System.out.println(i + "단입니다");
//
//            for(int k = 1; k <= 9; k++){
//                System.out.println(i + " X " + k + " = " + i*k);
//            }
//
//        }

        int[][] arr = {{1,2,3,4}, {5,6,7,8}};
        System.out.println(arr[0][0]);
        for (int k = 0; k<arr.length; k++){
            for(int i = 0; i<arr[k].length; i++){
                System.out.println(arr[k][i]);
            }
        }
    }
}



