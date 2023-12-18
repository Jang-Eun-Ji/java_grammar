package C12ClassLecture;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C1206RecursiveBasic {
    public static void main(String[] args) {
        int answer = 0;
        for (int i = 0; i <= 10; i++){
            answer +=i;
        }
        System.out.println(answer);

        System.out.println(add_acc(10));
        System.out.println(ff(10));

//        피보나치 수열

        List<Integer> pi = new ArrayList<>(Arrays.asList(1,1));
        for(int i = 0; i < 10; i++){
            pi.add(pi.get(i) + pi.get(i + 1));
        }
//        == 같은거
//        int first= 1;
//        int second = 1;
//        for(int i = 2; i <=10; i++){
//            int third =  first + second;
//            first = second;
//            second = third;
//        }

        System.out.println(pi.get(10));
        System.out.println(fibo(10));

        int n = 10;
        int[] arr = new int[n];
//        fibo - for 문으로만 (배열활용
//         메모이제이션 (기억알고리즘 - DP)
//        단계마다 계산결과값이 필요할때 메모이제이션 활용
        arr[0] = 1;
        arr[1] = 1;
        for(int i = 2; i<n; i++){
            arr[i] = arr[i -1] + arr[i -2];
        }
        System.out.println(Arrays.toString(arr));
//        System.out.println(fiboList(10));
    }
//    매소드가 자기자신을 호출하는 매소드를 재귀함수라고 하고, 이러한 호출방식을 재귀호출이라고 한다.
//    함수구조는 스택메모리에(실행 메모리로) 쌓인다.(선입후출)
    static int add_acc(int n){
        if(n == 1){
            return 1;
        }
        return n + add_acc(n-1);
    }

    static int ff(int n){
        if(n <= 1){
            return 1;
        }
        return n * ff(n-1);
    }

    static int fibo(int n){
        if(n <= 1){
            return 1;
        }
        return (fibo(n-1) + fibo(n -2));
    }

//    static int fiboList(int n){
//        if(n < 2){
//            return 1;
//        }
//        List<Integer> fiboL = new ArrayList<>();
//        fiboL.add(fiboL.get(n -1) + fiboL.get(n - 2));
//        return fiboL.get(n);
//    }
}
