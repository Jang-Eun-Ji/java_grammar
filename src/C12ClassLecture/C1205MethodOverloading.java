package C12ClassLecture;

import java.util.ArrayList;
import java.util.List;

public class C1205MethodOverloading {
    public static void main(String[] args) {
//        static이 없는 매소드는 패키지 재선언을 해서 사용해야함
        C1205MethodOverloading mo = new C1205MethodOverloading();
//        매소드 오버로딩을 통해 같은 매소드면 재활용
        int a = 10;
        int b = 20;
        int c = 30;

        mo.sum(a,b,c);
        mo.sum(a,b);
        mo.sum(3.2, 10.1);

//      재네릭을 통해 타입 재활용 - 어떤 타입이든 <> 여기 안에 들어올수 있도록 만든
        List<Integer> myList = new ArrayList<>();

    }
    public int sum(int a, int b, int c){
        int answer = a + b + c;
        System.out.println(answer);
        return answer;
    }
    public int sum(int a, int b){
        int answer = a + b;
        System.out.println(answer);
        return answer;
    }
    public double sum(double a, double b){
        double answer = a + b;
        System.out.println(answer);
        return answer;
    }
}
