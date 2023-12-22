package C16EtcClass;

public class C1601Math {
    public static void main(String[] args) {
//        for(int i = 0; i<10; i++){
////        0~1, 0미만의 임의의 double형을 반환
//            double randomValue = Math.random();
//            System.out.println((int)(randomValue*100));
//        }
//        abs()메소드: 절댓값 반환
        System.out.println(Math.abs(-5));
//        floor(): 소수점 내림, ceil:소수점 올림, round():소수점반올림
        System.out.println(Math.floor(5.7));
        System.out.println(Math.ceil(5.7));
        System.out.println(Math.round(5.7));

//        max, min
        System.out.println(Math.max(5,8.7));
        System.out.println(Math.min(5,8));

//        pow(a,b) : 제곱연산 수행 -> a의 b제곱
        System.out.println(Math.pow(5,2));

//        sqrt(a): a의 제곱근 연산 수행/ 루트
        System.out.println(Math.sqrt(3));

//        1~n까지의 숫자 중에 소수인지 아닌지 구해라
        int n = 100;
        for(int i =2; i <= (int)Math.sqrt(n); i++){
            if(n%i !=0){
                System.out.println("소수가 아닙니다.");
                break;
            }
        }


    }


}
