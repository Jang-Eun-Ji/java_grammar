package C15AnonymousLambda;

import java.util.Arrays;

public class C1503LamdaExpresion { //메소드 하나면 람다 쓸수 있다
    public static void main(String[] args) {
//        실행문이 1개일때는 return이 생략
//        실행문이 2개 이상일 때는 return 필요
//        매개변수를 순서로 인지하므로, 타입을 지정할 필요는 없다.
        LambdaInterface La = (i, j, k) -> {
            String answer = "장은지는"+ i + j + k;
            return answer;
        };
        La.makeString("는 예쁘다", " 너무 귀엽다", 18);
        System.out.println(La.makeString("는 예쁘다", " 너무 귀엽다", 18));

        int[] numbers = {3, 30, 34, 5, 9};
        String[] strArray = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            strArray[i] = String.valueOf(numbers[i]);
        }
        System.out.println(Arrays.toString(strArray));
    }
}
interface LambdaInterface{
    String makeString(String a, String b, int c);
}
