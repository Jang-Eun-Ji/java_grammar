package Cjavabasic;

import javax.management.InstanceNotFoundException;
import java.sql.Struct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.SimpleTimeZone;
import java.util.regex.Pattern;

public class C06String {
    public static void main(String[] args) {
//        참조자료형: 기본 자료형을 제외한 모든 자료형
//        Wrapper Class: 기본형 타입에 없는 다양한 기능을 지원하기 위한 클레스

        // int 박싱 언박싱 수동 오토 알기, 별로 안중요해서 외우지 말기
//        int a = 10;
//        Integer b = new Integer(20); // 기본형의 클레스
////        오토 언박싱(자동으로 integer를 언박싱해 int에 넣어준것// integer -> int 형 변환)
//        int c = b;
////        수동 언박싱
//        int d = b.intValue();
////        오토 박싱
//        Integer e = a;
////        수동 박싱
//        Integer g = Integer.valueOf(a);

        //String과 int을 형변환 중요!!
//        int a = 10;
//        String st_a2 = String.valueOf(a);
//        String st_a = Integer.toString(a); // int -> String "10"
//        int c = Integer.parseInt(st_a); //String -> int 10
//
//        //참조 자료형에 원시 자료형을 담을 때는 wrapper클레스를 써야 한다. (배열 제외), ex) 컬렉션 프레임 워크 (list, set ...)
//        List<Integer> list_a = new ArrayList<>();
//        list_a.add(10);
//        list_a.add(20);
//        list_a.add(30);
//        System.out.println(list_a);

//            String myStr1 = new String("hello");
//            String myStr2 = new String("hello");
//            String myStr3 = "hello"; //같은 문자열이면 같은 문자열을 공유함!!
//            String myStr4 = "hello";
//            String myStr5 = myStr1; //주소값을 저장함
//
//        System.out.println(myStr1 == myStr2); //false
//        System.out.println(myStr1 == myStr3); //false
//        System.out.println(myStr3 == myStr4); //true
//        System.out.println(myStr1 == myStr5); // true 주소값을 할당해 완벽히 같은 객체임

        // 문자열의 길이 : length();
//        String mySt = "hello";
//        System.out.println(mySt.length());
//
//        // indexOf(): 특정 문자열이 가장 먼저 나오는 문자열의 시작 위치를 반환
//        String mySt2 = "hello java";
//        int mySt2_index = mySt2.indexOf("java");
//        System.out.println(mySt2_index);
////
////       contains: 특정 문자열이 있는지 여부를 boolean으로 리턴
//        System.out.println(mySt.contains("hello"));

//        charAt: 문자열에서 특정위치(index)의 문자(char)를 리턴
//        String a = "hello";
//        char myChar = a.charAt(1);
//        System.out.println(myChar);

        // charAt를 이용해 a가 몇개 있는지 구하기
//        String st = "abcdefabaaf";
//        int awhere = 0;
//        for (int i = 0; i < st.length(); i++) {
//            char charst = st.charAt(i);
//            if (charst == 'a') {
//                awhere += 1;
//            }
//        }
//        System.out.println(awhere);

        //substring(a,b): a이상 b미만의 index를 자르는 메소드
//        String str1 = "hello world";
//        System.out.println(str1.substring(0,5));
//        System.out.println(str1.substring(6,str1.length()));

        //strip, trim 왼쪽, 오른쪽에 있는 공백을 다 제거
//        String stripSt = "   hello world  ";
//        String newSt = stripSt.strip();
//        System.out.println(newSt);
//
//        //toUpperCase(): 다 대문자 바꿔줌, toLowerCase(): 다 소문자로
//        String a = "Hello";
////        String a1 = a.toUpperCase();
////        String a2 = a.toLowerCase();
////        System.out.println(a1);
////        System.out.println(a2);
//
//
//        a+= " world";
//        a+= " world";
//        a+= " world";
//        a+= " world";
//        a+= " world";
//        System.out.println(a);

        //char -> String 형변환
//        char ch1 ='a';
//        String st1 = Character.toString(ch1);

        //+= 를 이용해 알파벳만 빼고 문자를 str2에 새롭게 담기
//        String str = "01abc123한글123";
//        String str2 = "";
//        for(int i = 0; i< str.length(); i++){
//            char k = str.charAt(i);
//            if('a'> k || 'z' < k){
//                str2 +=  Character.toString(k);
//            }
//        }
//        System.out.println(str2);

        //replace
//        String st1 = "hello world";
//        String st2 = st1.replace("world","java");
//        String st3 = st1.replaceAll("world","eunji");
//        System.out.println(st2);
//        System.out.println(st3);


//        String str = "01abc123한글123";
        // replaceAll를 이용해 알파벳만 빼고 문자를 str2에 새롭게 담기-- String이 리턴 타입
        //소문자 알파벳 [a-z]
//        String str_hangeul = str.replaceAll("[a-z]","");
//        System.out.println(str_hangeul);
//        //한글 [가-힣]
//        String str2 = str.replaceAll("[가-힣]", "");
//        System.out.println(str2);
//        //숫자 [0-9]
//        String str3 = str.replaceAll("[0-9]", "");
//        System.out.println(str3);
//        // 알파벳 전체 [A-Za-z]
//        String str4 = str.replaceAll("[A-Za-z]", "");
//        System.out.println(str4);
//        //알파벳 전체, 숫자
//        String str5 = str.replaceAll("[A-Za-z0-9]", "");
//        System.out.println(str5);


//        Patten 클레스 -- boolean이 리턴 타입
//          boolean matcher = Pattern.matches("[a-z]", "helloworld");
//
//          System.out.println(matcher);
//
//          //전화번호 검증
////        \d:숫자, {}: 연속으로
//          boolean matcher2 = Pattern.matches("^\\d{3}-\\d{4}-\\d{4}$", "010-356-0501");
//        System.out.println(matcher2);

        //이메일 검증
//        \d:숫자, {}: 연속으로, []+ 안에있는게 1개 초과 여러개일때
//          boolean matcher3 = Pattern.matches("^[a-z0-9]+@+[a-z]+.com$", "jej132456@gmail.com");
//        System.out.println(matcher3);
//
////        split: -- String ->String[]
//        String a = "a:b:c:d";
//        String[] starr = a.split(":");
//        System.out.println(Arrays.toString(starr));

        // split를 이용해 공백으로 나누기
//        String b = "a  b c d";
//        String[] starr2 = b.split(" ");
//        System.out.println(Arrays.toString(starr2));
//
//        //split를 이용해 공백 1개 이상으로 나누기
//        String[] starr3 = b.split("\\s+");
//        System.out.println(Arrays.toString(starr3));
//
//        //앞의 공백 없애기
//        b.trim();
//        String[] starr4 = b.split("\\s+");
//        System.out.println(Arrays.toString(starr3));
//

        //isEmpty와 null 구분
//        String str1 = null;
//        String str2 = "";
//
//        System.out.println(str1 == null);
//        System.out.println(str2 == null);
//        System.out.println(str2.isEmpty());
//        //NullPointer Exception 예외 발생 - 런타임 에러
//        System.out.println(str1.isEmpty()); // null은 아예 비어있는 값이라 비교 불가
//
//        String[] arr = new String[5];
//        arr[0] = "hello";
//        arr[1] = "world";
//        for(int i = 0; i< arr.length; i++){
//            System.out.println(arr[i].length());
//        }

//        join : String[] -> String
//        String[] arr = {"java","css","html"};
//        String arrlist = String.join(" ",arr);
//        System.out.println(arrlist);

//        String Buffer
        String st1 = "hello";
        StringBuffer sb1 = new StringBuffer(st1);
        //append 마지막에 문자열을 추가, 재선언 하는 거임
        sb1.append(" world");
        //insert
        sb1.insert(6, "java ");

        //substring 실제 원본을 자르는게 아니라 출력만
        System.out.println(sb1.substring(5,10));
        //delect
        sb1.delete(5,10);

        System.out.println(sb1);

//        성능: String < StringBuffer < StringBuilder(스레드 safe X)
//        스레드: 작업의 단위, 작업의 주체이기도 함
        StringBuilder sb2 = new StringBuilder("hello");
        sb2.append(" world");
        System.out.println(sb2);



    }
}
