package C17ExceptioFileParsing;

public class C1701Exception {
    public static void main(String[] args) {
//        ArithmeticExection: 0으로 난눌때
//        System.out.println("나눗셈 프로그램 입니다. 숫자 10에 나눌 분모값을 입력해주세요");
//        int num = 10;
//        Scanner sc = new Scanner(System.in);
//        int input = sc.nextInt();
//
////        예외가 발생할 것으로 예상되는 코드에 try catch 감싸준다.
//        try {
//            System.out.println("10에 " + input + " 을 나누면 " + num / input + "입니다.");
////      Catch에는 try구문안에서 발생가능한 예외사항을 적어야 정상적으로 catch가 된다.
//        } catch (IllegalAccessError e) {
//            System.out.println("정상적이지 않는 입력값");
//            e.printStackTrace();
//        } catch (NullPointerException e) {
//            e.printStackTrace();
//        } catch (ArithmeticException e) {
//            System.out.println("0 으로 나눌수 없음");
//            System.out.println(e.getMessage()); // / by zero, 사용자에게 보여주는 용도로 가능
//            e.printStackTrace(); //빨강색으로 어디서 어떤 코드의 에러가 났는지 알수 있다.
//        } catch (Exception e) { // 모든 예외를 포함 하는것, 마지막에 넣어서 나머지 에러를 잡기, 다른 에러 위에 넣으면 밑으로 안감
//            System.out.println("알수 없는 예외가 발생했습니다.");
//        } finally {
////            반드시 실행되어야 하는 구문 삽입, 보통 잘 안쓴다잉
//        }
//        System.out.println("감사합니다.");

//        throw와 throws예제
        String password = "1234";
        try {
            login(password);
        }catch (IllegalArgumentException e){
//            e.getMessage는 login메소드에서 throw new한 곳에서 넘어온 메세지.
            System.out.println(e.getMessage());
        }
//        unchecked exception 에서 throws를 하지 않더라도 예외는 호출한곳으로 전파
//        이때에 throws를 하는 이유는 명시적으로 예외가 발생할수 있음을 알리는것일 뿐/

//        checked execption은 예외처리가 강제되고, 해당메소드에서 예외처리를 하든지 throws를 통해 호출한곳에 위임
//
//        } 이때 호출한 쪽에서는 예외처리가 강제 된다.


    }
    static void login (String password){
        if (password.length() < 10) {
            throw new IllegalArgumentException("비밀번호가 너무 짧음");
        }
    }
}