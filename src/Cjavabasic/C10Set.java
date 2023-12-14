package Cjavabasic;

import java.util.*;
import java.util.Set;

public class C10Set {
    public static void main(String[] args) {

        //중복없고, 순서 없음 - list 같은거에 중복제거 할때 사용
//        Set<String> mySet = new HashSet<>();
//        mySet.add("h");
//        mySet.add("h");
//        mySet.add("e");
//        mySet.add("l");
//        mySet.add("l");
//        mySet.add("o");
//        System.out.println(mySet);

        //반 학생들이 좋아 하는 운동 종목: list로 만들고,
//        좋아하는 종목만 추리도록 set으로 변환

//        List<String> myList = new ArrayList<>();
//        myList.add("basketball");
//        myList.add("basketball");
//        myList.add("basketball");
//        myList.add("baseball");
//        myList.add("baseball");
//        myList.add("tennis");
//        myList.add("tennis");
//        myList.add("tennis");

//        Set<String> mySet1 = new HashSet<>();
//        for (int i = 0; i < myList.size(); i++){
//            mySet1.add(myList.get(i));
//        }
        //list를 인자값으로 받아 초기값 세팅
//        Set<String> mySet1 = new HashSet<>(myList);
//        System.out.println(mySet1.size());

        //배열을 인자값으로 받아 set 초기값 세팅
//        String[] myarr = {"hih", "gigi","jiji"};
//        Set<String> mySet = new HashSet<>(Arrays.asList(myarr));
//        mySet.remove("hih");
//        System.out.println(mySet);
//
//        int[] myArrInt = {1,2,3,4};
//        Set<Integer> mySet1 = new HashSet<>();
//        for(int a: myArrInt){
//            mySet1.add(a);
//        }
//        System.out.println(mySet1);

//        Set<String> mySet1 = new HashSet<>(Arrays.asList("java","python","javascript"));
//        Set<String> mySet2 = new HashSet<>(Arrays.asList("java","html","css"));
//
//        //교집합: retainAll
//        Set<String> temp1 = new HashSet<>(mySet1);
//        temp1.retainAll(mySet2);
//        System.out.println(temp1);
//
//        //합집합: addAll
//        Set<String> temp2 = new HashSet<>(mySet1);
//        temp2.addAll(mySet2);
//        System.out.println(temp2);
//
//        //차집합: removeAll
//        Set<String> temp3 = new HashSet<>(mySet1);
//        temp3.removeAll(mySet2);
//        System.out.println(temp3);

        //순서가 없으므로 enhanced for문 , iterator사용

//      LinkedHashSet, TreeSet
        Set<String> mySet = new TreeSet<>();
        mySet.add("hello5");
        mySet.add("hello4");
        mySet.add("hello3");
        mySet.add("hello2");
        mySet.add("hello1");
        System.out.println(mySet);

        //전화번호 목록
        //두개 뽑아서 더하기


    }
}
