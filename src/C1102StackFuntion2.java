public class C1102StackFuntion2 {
    public static void main(String[] args) {
        System.out.println("main함수 시작");
        System.out.println(funtion1(1));
        System.out.println("main 함수 끝");
    }
    //return 값, () 어떤 값을 받기위한 변수
    static int funtion1(int a){
        System.out.println("funtion1시작");
        System.out.println("funtion1끝");
        return funtion1(a * 2);
    }


}
