import java.util.Scanner;
import java.util.Stack;

public class C11StackQueue {
    public static void main(String[] args) {
//       Stack 선입 후출
//        Stack<Integer> mySt = new Stack<>();
//        mySt.push(10);
//        mySt.push(20);
//        mySt.push(30);
//        //pop: Stack에서 마지막 요소를 제거 후 해당 요소를 반환
//        System.out.println(mySt.pop());
//        //peek: 마지막 마지막 요소를 반환 제거는 아님
//        System.out.println(mySt.peek());
//        System.out.println(mySt);
//        System.out.println(mySt.size());
//        System.out.println(mySt.isEmpty());
//
//        Stack<String> myStack = new Stack<>();
//        myStack.push("hh");
//        myStack.push("qq");
//        myStack.push("ww");
//        myStack.push("rr");
//        myStack.push("oo");
//
//        while (!myStack.isEmpty()){
//            System.out.println(myStack.pop());
//        }
        // 웹페이지 방문 사이트 뒤로 가기 기능 구현
        //방문한 사이트 출력 + history
        // 뒤로가기 기능도 있어야함
        // 스케너로 신규사이트 방문 or 뒤로 가기
//        신규사이트 방문일 경우, 해당 주소 추가 push
//        뒤로가기일 경우 해당 주소pop


        Stack<String> myHistory = new Stack<>();
        Scanner myScan = new Scanner(System.in);
        System.out.println("사이트");
        String inputs = myScan.nextLine();

        myHistory.push(inputs);

        boolean site = true;
        while (site){
            System.out.println("1번 신규 사이트, 나머지 뒤로 가기");
            int inputs_int = myScan.nextInt();
            System.out.println(myHistory);
            if(inputs_int == 1){
                System.out.println(myHistory);
                System.out.println("사이트 입력");
                String inputs2 = myScan.nextLine();
                myHistory.push(inputs2);
                System.out.println(inputs2);
                System.out.println("사이트 입력");

            }else {
                System.out.println(myHistory);
                System.out.println(myHistory.pop());
            }
        }





    }
}
