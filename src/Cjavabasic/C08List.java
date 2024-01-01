package Cjavabasic;

import java.util.*;

public class C08List {
    public static void main(String[] args) {
        //리스트 선언 방법
//        ArrayList<String> myList = new ArrayList<String>();
//        ArrayList<String> myList = new ArrayList<>();
        //가장 일반적인 방법
        // 왼쪽엔 인터페이스, 오른쪽엔 구현체
//                 warpping된 거만 넣을수 있음
//        List<String> myList = new ArrayList<>(); // ArrayList<String> myList = new ArrayList<>(); 로도 쓸수 있음 우측에 Array를 나중에 바꿀 수 있어서 이게 더 좋음
//
//        //초기값 생성 방법1, 하나씩 add
//        myList.add("java");
//        myList.add("python");
//        myList.add("c++");
//        System.out.println(myList);
//
//        //초기값 생성방법2, 한꺼번에 add(배열을 이용한 변환)
//        String[] myArr1 = {"java", "python","c++"};
//        ArrayList<String> myList2 = new ArrayList<>(Arrays.asList("java", "python","c++"));
//        System.out.println(myList2);
//        //배열이 int인 경우 -> 형변환 이슈 발생
//        int[] myIntArr1 = {1,2,3};
//        List<Integer> myIntList1 = new ArrayList<>();
//        for(int a : myIntList1){
//            myIntList1.add(a);
//        } //실행문 하나면 for문도 {} 안써도됨

//        List<Integer> myList = new ArrayList<>();
//        myList.add(10);
//        myList.add(20);
//        //add (int index, int element): 중간에 값 삽입은 기본적으로 성능 저하
//        myList.add(1,15);
//        System.out.println(myList);
//        List<Integer> myList2 = new ArrayList<>();
//        myList2.add(30);
//        myList2.add(40);
//        myList2.add(50);
//
//        //addAll(Collection 객체): 특정 리스트의 요소를 모두 add
//        myList.addAll(myList2); //끝으로 추가 됨
//        System.out.println(myList);
//
//        //get(int index): 특정 위치의 요소를 반환
//        System.out.println(myList.get(0));
//
//        //size(): 리스트의 개수 반환
//        for(int i = 0; i < myList.size(); i++){
//            System.out.println(myList.get(i));
//        }
//
//        //remove: 요소 삭제
////        remove는 value 삭제, index를 통한 삭제
//
//        //remove를 통한 index 삭제 : 0번째
////        myList.remove(0);
////        System.out.println(myList);
//
//        //remove를 통한 value를 삭제 : Integer.valueOf  똑같은 값이 2개면 앞을 value를 삭제함
//        myList.remove(Integer.valueOf(15));
//        System.out.println(myList);
//
//
//
//        //set(int index, E element) : index자리에 값 변경
//        myList.set(myList.size()-1, 100);
//        System.out.println(myList);
//
//        //contains(E element): 특정값이 있는지 없는 boolean return
//        System.out.println(myList.contains(100));

//        List<Integer> myList = new ArrayList<>();
//        myList.add(10);
//        myList.add(10);
//        myList.add(20);
//        myList.add(30);
//        //indexOf: 몇번째 인덱스에 위치한지 return, 요소가 없으면 -1 return
//        //같은 숫자가 있으면 첫번째 index값을 return
//        System.out.println(myList.indexOf(20));
//
//        //전체 삭제: clear()
//        myList.clear();
//        System.out.println(myList);
//
//        //isempty: 값이 비었는지 안비었는지
//        System.out.println(myList.isEmpty());
//
//        //contains(E element)
//        System.out.println(myList.contains(10));

//        이미 toString 을 내부적으로 호출하고 있으므로 출력시 호출 하지 않아도 됨
        //리스트 출력
//
//        List<int[]> myList = new ArrayList<>();
//        myList.add(new int[]{1,2,3});
//        myList.add(new int[2]);
//        myList.add(new int[3]);
//        myList.get(1)[0] =10;
//        myList.get(1)[1] =20;
////        myList.get(1)[2] =30;
//        for(int[] a : myList){ // myList안에 있는거 하나씩 a 에 담는다 1,2,3씩
//            System.out.println(Arrays.toString(a));
//        }


//        List<List<Integer>> myList2 = new ArrayList<>();
//        myList2.add(new ArrayList<>(Arrays.asList(1,2,3)));
//        myList2.add(new ArrayList<>(Arrays.asList(10,20,30)));
//        myList2.add(new ArrayList<>(Arrays.asList(100,200,300)));
//        //조회
//        System.out.println(myList2);
//        for(List<Integer> a : myList2){ // myList안에 있는거 하나씩 a 에 담는다 1,2,3씩
//            System.out.println(a);
//        }
//        //for를 통해 모든 list에 값 넣기
//        for(int i = 0; i <myList2.size(); i++){
//            myList2.get(i).add(10);
//        }
//        //그냥 List에 값 넣기
//        myList2.get(0).add(55);
//        System.out.println(myList2);

//        List<int[]> myList = new ArrayList<>();
//        myList.add(new int[3]);
//        myList.add(new int[3]);
//        myList.add(new int[3]);
//
//        int a = 1;
//        for(int i = 0; i < myList.size(); i++){
//            for(int j = 0; j < myList.get(i).length; j++){
//                myList.get(i)[j] = (j + 1) * a;
//            }
//            a = a*10;
//        }
//        for(int[] k : myList){ // myList안에 있는거 하나씩 a 에 담는다 1,2,3씩
//            System.out.println(Arrays.toString(k));
//        }

        //정렬
        //Collection는 여러가지 기능을 클레스
        // 오름차순 Collections.sort(numbers); == numbers.sort(Comparator.naturalOrder());
        // 내림차순 Collections.sort(numbers, Comparator.reverseOrder()); == numbers.sort(Comparator.naturalOrder());
        //Comparator - 주로 두 객체를 비교하는 함수형 인터페이스, 주로 객체들의 컬렉션을 정렬할때 사용


//        List<Integer> myList = new ArrayList<>(Arrays.asList(5,4,3,9,1,2));
//        //리스트 정렬 1: Collections.sort()
//        Collections.sort(myList);
//        System.out.println(myList);
//        Collections.sort(myList, Comparator.reverseOrder());
//        System.out.println(myList);
//        //리스트 정렬 2: 객체.sort()
//        myList.sort(Comparator.naturalOrder());
//        System.out.println(myList);
//        myList.sort(Comparator.reverseOrder());
//        System.out.println(myList);
//
////        1.String 배열을 List로 변환
//        String[] StringList = {"eunji", "jiji", "enu"};
//        //방법 1-1
//        List<String> stlist = Arrays.asList(StringList);
//        System.out.println(stlist);
//        //방법 1 -2
//        List<String> stlist2 = new ArrayList<>();
//        for(String a : StringList){
//            stlist2.add(a);
//        }
//        System.out.println(stlist2);
//        //방법 1-3 streamApi(참고만)
//        List<String> stlist3 = Arrays.stream(StringList).collect(Collectors.toList());

        //방법 2. int 배열을 list로 변환
//        1-1 Arrays.asList 사용불가
//        1-2 for문 담기 사용 가능
//        1-3 StreamApi 사용가능

        //방법 3. String List 를 String 배열로 변환
//        3-1 for 문 할당
        List<String> stList = new ArrayList<>(Arrays.asList("hihi","bibi","jiji"));
        String[] st = new String [stList.size()];
        for(int i = 0; i < stList.size(); i++){
            st[i] = stList.get(i);
        }
        System.out.println(Arrays.toString(st));

//        3-2 streamApi(참고만)
        String[] strArr2 = stList.stream().toArray(a ->new String[a]);

        //4. Int 리스트를 int 배열로 변환
        // 4-1 for문으로 변환
//        4-2 streamApi 로 변환

//        두개 뽑아서 더하기: 리스트




    }
}
