package Cjavabasic;

import java.util.ArrayDeque;
import java.util.Deque;

public class C11StackQueueDeque {
    public static void main(String[] args) {
//       Stack 선입 후출 // 자체가 클레스임(인터페이스가 아니고 구현체) 그래서 우측에 구현체가 필요없음
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
//        // 뒤로가기 기능도 있어야함
//        // 스케너로 신규사이트 방문 or 뒤로 가기
////        신규사이트 방문일 경우, 해당 주소 추가 push
//        뒤로가기일 경우 해당 주소pop


//        Stack<String> myHistory = new Stack<>();
//        Stack<String> forwards = new Stack<>();
//        boolean site = true;
//        while (site){
//            System.out.println("1번 신규 사이트, 2번 뒤로 가기, 3번 앞으로 가기");
//            Scanner myScan = new Scanner(System.in);
//            String input = myScan.nextLine();
//            if(input.equals("1")){
//                System.out.println("사이트 입력");
//                Scanner sc2 = new Scanner(System.in);
//                String input2 = sc2.nextLine();
//                System.out.println("방문한 사이트는" + input2);
//                myHistory.push(input2);
//            }else if(input.equals("2")){
//                String temp = forwards.pop();
//                myHistory.push(temp);
//                System.out.println("앞으로 가기를 통해 방문한 곳은" + temp);
//            }else {
//                String temp = myHistory.pop();
//                forwards.push(temp);
//                System.out.println("뒤로가기로 방문하신 곳" + myHistory.peek());
//            }
//        }
        //큐선언 (poll, peek도 있다.)
//        Queue<Integer> myQue = new LinkedList<>();
//        myQue.add(10);
//        myQue.add(20);
//        myQue.add(30);
//        System.out.println(myQue.poll()); //poll 제일 처음 값을 빼면서 산출함
//        System.out.println(myQue);

//        프린터 대기열 예제
//        문서 1, 문서 2, 문서 3 추가
//        Queue<String>myPrint = new LinkedList<>();
//        myPrint.add("문서 1");
//        myPrint.add("문서 2");
//        myPrint.add("문서 3");
//        while (!myPrint.isEmpty()){
//            System.out.println("현재 인쇄 중인 문서: " + myPrint.poll());
//        }

        //길이에 제한이 있는 큐 : ArrayBlockingQueue
//        Queue<String> myQue = new ArrayBlockingQueue<>(3);
//        //add 와 offer의 차이: add는 길이가 다 찼을때 에러를 발생, offer공간이 충분할 때만 add
//        myQue.offer("hello1");
//        myQue.offer("hello2");
//        myQue.offer("hello3");
//        myQue.offer("hello4");
//        System.out.println(myQue);

        //맨 앞에는 제일 작은 숫자임, 매번 초반 조금만 정렬함
        //매우 빠름
//        Queue<Integer> pq = new PriorityQueue<>();
//        pq.add(30);
//        pq.add(20);
//        pq.add(40);
//        pq.add(10);
//        pq.add(50);
//        while (!pq.isEmpty()){
//            System.out.println(pq);
//            System.out.println(pq.poll());
//        }

//        ArrayDeque : 양방향에서 데이터를 삽입/ 제거 할수 있다.
//        성능 빠름
        //Deque 선언법 (Ddeque이 Queue를 상속하고 있음 Queue는 LinkedList를 상속)
        Deque<Integer> myDeque = new ArrayDeque<>();
        //addFirst()
        myDeque.addFirst(10);
        myDeque.addFirst(20);// 20 -10 순으로 나옴
        System.out.println(myDeque);
//        addLast()
        myDeque.addLast(30); // 20-10-30
        System.out.println(myDeque);
//        pollFirst()
        System.out.println(myDeque.pollFirst());
//        pollLast()
        System.out.println(myDeque.pollLast());
//        peekFirst()
//        peekLast()






    }
}
