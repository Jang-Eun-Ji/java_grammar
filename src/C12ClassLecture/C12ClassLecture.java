package C12ClassLecture;

import java.util.Arrays;
//한 파일 내에 public클래스는 한개 뿐이다. 나머지는 내부 클래스
public class C12ClassLecture {
    public static void main(String[] args) {
        //for문으로  1~10까지 total출력
//        int total = 0;
//        for (int i = 1; i<11; i++){
//            total = total + i;
//        }
//        System.out.println(total);
//        //for문으로  10~20까지 total출력
//        int total2 = 0;
//        for (int i = 10; i<21; i++){
//            total2 = total2 + i;
//        }
//        System.out.println(total2);

//        코드의 중복이 발생하므로, 코드의 반복을 피하기 위해 특정 기능집합을 별도로 분리

        int total = sum_acc(100,200); // sum_acc안의 total과 연관없음
        System.out.println(total);

        //ctrl로 들어가서 static이 있으면 클레스 이름. 써야함 없으면 new뭐시기 해야함
//        같은 클래스내의 메소드들 사이에서의 호출은 클래스명 생략가능

//        매소드 구성요소: 매개변수, 반환타임, 접근제어자, 클래스 메소드 여부(static)
        //접근 제어자: public같은거 생략되면 디폴트임,


    }


    //    기능 집합이 메소드다
    //void리턴타임: 리턴타입이 없는것
    //int, String 등 리턴타입 명시

    public static int sum_acc(int start, int end){
        int total = 0;
        for(int i = start; i <= end; i++){
            total +=i;
        }
//        System.out.println(total); //void 여서 return이 아니라 개발자의 터미널 창에만 프린트로
        return total; //리턴 키워드를 통해 연산결과값을 반환
    }
    //클레스명(){} - 기본 생성자 클래스 만들 때마다 자동으로 생기고, 다른 생성자 만들면 사라짐
//    () 안에 있는건 클레스를 사용하기 위해 넣어야 하는 변수명임,

}
