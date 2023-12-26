package C16EtcClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class C1604Iterator {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("apple");
        myList.add("banana");
        myList.add("cherry");
//        enhanced for문 :원본이 변경X -> remove불가
//        for (String a : myList){
//            System.out.println(a);
//        }
//      iteraror 사용 : 참조하고 있는 원본 데이터 삭제 가능 -> remove
        Iterator<String> iterList = myList.iterator();
        while(iterList.hasNext()) {
            if(iterList.next().equals("banana")){
                iterList.remove();
            }
//            String str = iterList.next(); //pop같이 앞에것 부터 꺼냄
//            System.out.println(str);
        }
        System.out.println(myList);
    }
}
