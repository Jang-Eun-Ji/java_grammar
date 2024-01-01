package C15AnonymousLambda;

import javax.tools.OptionChecker;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class C1505StreamAPI {
    public static void main(String[] args) {
//        int[] arr = {10,30,4,13};
//        for(int i = 0; i < arr.length;i++){
//            System.out.println(arr[i]);
//        }

//    데이터와 객체 중심이 아닌, 입력에 따른 출력만이 존재하는 함수형 프로그래밍 방식
//    java에서 함수형 프로그래밍을 지원하기 위한 라이브러리 ->streamApi
//      foreach: 스트림의 각 요소를 소모하면서 동작을 수행
//
//        Arrays.stream(arr).forEach(a -> System.out.println(a)); //foreach로 하나씩 출력하겠다??
//
//        Arrays.stream(arr).sorted().forEach(a -> System.out.println(a)); //기존의 stream을 다른 방식으로 정렬하고 출력
//
//        String[] MyArr = {"world"};

//        스트림의 생성
//        String[] stArr = {"HTML", "CSS", "JAVA", "{PYTHON"};
////        Stream<객체> : 재네릭 타입으로 stream객체가 생성
//        Stream<String> stStream = Arrays.stream(stArr);


//        int는 리턴타입이 intstream이라 string이랑 리턴타입, 매소드가 다름
//        int[] intArr = {10, 20, 30, 40, 50};
//        Arrays.stream(intArr);
//        IntStream intstream = Arrays.stream(intArr);
//
//        //20보다 큰 수 모음
//        int[] intArr2 = intstream.filter(a -> a>20).toArray(); //보통 toarry보다 sum이나 바로 뭔가 하는걸 많이 씀
//        System.out.println(Arrays.toString(intArr2));

        //length가 4이하인 것들 모음
//        참조변수의 스트림 변환의 경우 제내릭의 타입소거 문제 발생
//        제네릭의 타입소거란 java버전의 호환성을 위해 제네릭 타입을 런타임시점에 제거하는 것을 의미
//        제네릭 타입이라 앞에 스트링이라고 붙였으면 스트링타입으로 좌측에 적기
//        String[] stArr2 = stStream.filter(a ->a.length()<=4).toArray(a ->new String[a]);

//        메소드 참조방식으로 표현하는 것이 더 일반적, 메소드 참조방식: (String[])클래스::매소드(new)
//        String[] stArr2 = stStream.filter(a ->a.length()<=4).toArray(String[]::new);
//        System.out.println(stArr2);
//
//        stream 중개연산 : filter, map, sorted,distinct

//        distint: 중복제거 후 스트림 반환
//        int[] intArr = {10,20,30,40,50};
//        int answer = Arrays.stream(intArr).distinct().sum(); // 중복 제거 후 총합 반환

//        String[] stArr = {"java", "java", "python", "c++"};
//      중복 제거 후 새로운 배열 생성
//        Stream<String> stStream = Arrays.stream(stArr);
//        String[] stArr2 = stStream.distinct().toArray(String[]::new);
//        System.out.println("stArr2 = " + Arrays.toString(stArr2));

//        중복제거 하고 길이가 3개 이하인 것으로 제한하고, 남은 배열의 길이 총합
//        mapToint를 통해 IntStream으로 변환 됨
//      IntStream myStream = Arrays.stream(stArr).distinct().filter(a->a.length()<=3).mapToInt(a-> a.length());
//      int myStreamsum = Arrays.stream(stArr).distinct().filter(a->a.length()<=3).mapToInt(a-> a.length()).sum();

//      sorted: 정렬된 스트림 반환
//        int[] arr = {5,3,6,7,1,4,8};
////        내림차순 정렬된 숫자 신규 배열 반환
//        int[] new_arr =  Arrays.stream(arr).sorted().toArray();
//
//        List<Integer> myList = new ArrayList<>(Arrays.asList(6,2,7,8,9,4));
////        Collect(변환할 컬랙션 명시)
//        List<Integer> myList2 = myList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
//
//        List<String> stList = new ArrayList<>(Arrays.asList("java", "python", "C++", "javascript"));
////        streamAPI를 사용해서 문자열의 길이 4개 이상인, 문자열의 길이를 기준으로 정렬(내림)까지하여 신규 List생성
////        List<String> mySting = Arrays.stream(stList).
////        List<String> res = stList.stream().filter(a -> a.length() >= 4).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
//
//        ArrayList<Object> objects = new ArrayList<>();
//        List<String> myString = stList.stream().filter(a ->a.length()>=4).sorted((o1,o2) ->o2.length() -o1.length())
//                                .collect(Collectors.toList());
//
////
//        int[] arr_plus10 = Arrays.stream(arr).map(a ->a+10).toArray();
//        System.out.println(Arrays.toString(arr_plus10));
//
////        arr에서 짝수만 골라서 해당수의 제곱의 합을 구하라. sum();
//        int answer = Arrays.stream(arr).filter(a -> a%2==0)
//                .map(a ->a*a).sum();
//        System.out.println(answer);

//        reduce: 누적연산, forEach: 하나씩 꺼내서 연산
//        스트림소모: forEach, reduce
//        int[] arr = {10,20,30,40};
//        Arrays.stream(arr).forEach(System.out::println);
//        System.out.println(Arrays.toString(arr));


//        초깃값을 지정하지 않으면 Optional객체 return
//        optional객체: 값이 있을수도 있고, 없을수도 있다는 것을 명시한 타임(java8이후 추가)
//        int result = Arrays.stream(arr).reduce((a,b) -> a*b);

//        값을 null으로 넣으면 아무 연산이 안됨 -- 에러 남
//        List<String> myList = new ArrayList<>(Arrays.asList("hello", null, "java"));
//        myList.sort(Comparator.naturalOrder());
//        String a = null;
//        System.out.println(a.length());
//
//        String a = null;
//        System.out.println(a.length());
//        Optional<String> myOptional = Optional.ofNullable("hello");
//        if(myOptional.isPresent()){
//            System.out.println(myOptional.get().length());
//        }
        //Stream<Integer>을 int로 바꾸고 싶으면 mapToInt하기
//        int result1 = Arrays.stream(arr).reduce(1,(a,b) ->a*b);
//        System.out.println(result1);
////                                              초깃값,       null인것을 확인하고 꺼내고 싶을때
//        int result2 = Arrays.stream(arr).reduce((a,b) ->a+b).getAsInt();
//        System.out.println(result2);
//
//        String[] stArr = {"hello","java","world"};
//        String answer = "hello, java, world";
//        Optional<String> result3 = Arrays.stream(stArr).reduce((a, b) -> a + ", " + b);
//        if(answer.isPrecent()){
//            System.out.println(answer);
//        }
//        System.out.println(result3);
//        컨실러, 블러셔, 뷰러
//        최소/최대/평균/총합: min(나이나 이름 등등 넣기)/max/average/sum/count
//        List<Integer> myList = new ArrayList<>(Arrays.asList(1,2,3,4,5));
//        int min = myList.stream().mapToInt(a ->a).min().getAsInt();
//        System.out.println(min);
//        int max = myList.stream().mapToInt(a ->a).max().getAsInt();
//        System.out.println(max);
//
//        double average = myList.stream().mapToDouble(a ->a).average().getAsDouble();
//        System.out.println(average);
//
//        int sum = myList.stream().mapToInt(a ->a).sum();
//        System.out.println(sum);
//
//        long count = myList.stream().count();
//        System.out.println(count);
//
////        findFirst
//        List<Student> mystudens = new ArrayList<>();
//        mystudens.add(new Student("장은지",18));
//        mystudens.add(new Student("보석쓰",20));
//        mystudens.add(new Student("지한쓰",26));
//        mystudens.add(new Student("종석쓰",25));
//        mystudens.add(new Student("화장은지",33));
//        mystudens.add(new Student("화지",36));
//
//        Student s1 = mystudens.stream().filter(a -> a.getAge()>=30).findFirst().get();
//        System.out.println(s1);
//
//        Student s2 = mystudens.stream().min((o1, o2) -> o1.getAge() -o2.getAge())	// min 값을 얻어오는 함수
//                .get();
//        System.out.println("min"+s2);
//
//        int oldperson = (int) mystudens.stream().filter(a ->a.getAge()>=30).mapToInt(a -> a.getAge()).count();
//        System.out.println(oldperson);
//
//        double ave = mystudens.stream().mapToInt(a ->a.getAge()).average().getAsDouble();
//        System.out.println(ave);
//
//        List<Student> youngperson = mystudens.stream().filter(a ->a.getAge()<30).collect(Collectors.toList());
//        System.out.println(youngperson);
//
////        java8 이후에 나온 Optional 객체를 통해 특정 객체에 값이 없을지도 모른다는 것을 명시적으로 표현
////        Optional객체에 빈값을 명시적으로 넣는 방법: Optional.empty(); - null은 아닌데 문제를 발생시키는 빈값
//        Optional<String> opt1 = Optional.empty();
////      빈값인지 아닌지 check하는 메소드: isPresent()
//        System.out.println(opt1.get().compareTo("abc"));
//        if(opt1.isPresent()){
//            System.out.println(opt1.get().compareTo("abc"));
//        }else {
//            System.out.println("값이 없습니다.");
//        }
//
////      optional 객체 생성
////        Optional<String> opt2 = Optional.ofNullable(null); //null 일수도 있음을 의미// 거의 안씀 - nullable는null써도 됨
//        Optional<String> opt2 = Optional.of("hello"); //null 일수도 있음을 의미// 거의 안씀
//
////        orElse관련 메소드 활용하여 null(빈값)처리
////        orElse(), orElseGet(), orElseThrow()
////        orElse() : 값이 있으면 해당값 return, 없으면 defult지정값 return
//        System.out.println(opt2.orElse("").compareTo("abc")); //- 중요!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
////      orElseGet : 값이 있으면 해당값 return, 없으면 람다함수 또는 메소드참조 실행
//        System.out.println(opt1.orElseGet(() ->new String()).compareTo("abc")); // 안중요혀
//
////        중요!!! - orElseThrow(): 값이 있으면 해당값 return, 없으며 지정된 예외를 발생
//        System.out.println();
//
//        opt1.get();
//        int result = opt1.orElseThrow(()-> new NoSuchElementException("객체에 값이 없습니다.")).compareTo("abc");
////        System.out.println(result);
////        orElse, orElseThrow - 자주씀, orElseGet - 자주 안써
//
////        OptionalInt, OptionalDouble
//        OptionalInt oi = new ArrayList<>(Arrays.asList(1,2,3,4)).stream().mapToInt(a->a).max();
//        if(oi.isPresent()){
//        }else {
//
//        }
////        orelse등의 방법 활용
//        System.out.println(oi.orElseThrow(()-> new NoSuchElementException("no value")));

//        모든클래스의 조상 클래스: Object - toString(), equals() -기본으로 있는 메소드


// List, map, Array 복습하기, set,lambda,compator - 스프링에선 많이 안쓴다.
//  객체에 대한 감을 잡기, Constrator - 스프링위해, 재귀

    }
}
