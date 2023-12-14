package C12ClassLecture;

public class C1201MethodPractice {
    public static void main(String[] args) {
//        소수 :1과 자기 자신을 제외해서는 약수가 없는것.
//        소수인지 아닌지 판별하는 메소드 생성,
        boolean num = prim(7);
        System.out.println(num);

    }

    public static boolean prim(int num) {
        boolean answer = true;
        if (num > 2) {
            for (int i = 2; i*i <= num; i++) { //tip* 소수 문제는 i*i까지만 나눠보면 됨 시간절약
                if (num % i == 0) {
                    return false; //메소드가 return을 만나면 바로 종료
                    //void 리턴타입 메소드에서도 강제종료를 위해 return 사용 가능
                }
            }
        } else {
            answer = false;
        }
        return answer;
    }

    public static void isPrimPrint(int num) {
        boolean answer = true;
        if (num > 2) {
            for (int i = 2; i*i <= num; i++) {
                if (num % i == 0) {
                    System.out.println("소수가 아닙니다.");
                    return; //void에서도 강제종료를 위해 retrun사용 가능함/ 메소드 전체의 break라고 생각 가능
                }
            }
        }
        System.out.println("소수입니다.");
    }
}