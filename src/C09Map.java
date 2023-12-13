import java.util.*;

public class C09Map {
    public static void main(String[] args) {
        //삽입된 데이터의 순서가 없다.
//        LinkedHashMap - 넣은 순서대로 순서 있음
//        TreeMap - key값으로 정렬
//        Map<String,String> myMap = new HashMap<>();
//        myMap.put("basketball","농구");
//        myMap.put("soccer","축구");
//        myMap.put("baseball","야구");
//        System.out.println(myMap);
//        System.out.println(myMap.get("soccer"));
////        size(), isEmpty() 사용 가능
//        //이미 키가 있을경우 덮어쓰기 됨
//        myMap.put("basketball", "탁구"); //덮어쓰기 됨
//        //키가 없으면 넣겠다
//        myMap.putIfAbsent("baseball", "배구");
//        System.out.println(myMap);
//
////        getOrDefault : 키가 없으면 디폴트 값 return 그냥 get하면 null
//        System.out.println(myMap.getOrDefault("tennis", "스포츠"));
//
//        System.out.println(myMap.containsKey("tennis"));
//
//        //key 삭제
//        myMap.remove("baseball");
//
//        System.out.println(myMap.keySet());
//        System.out.println(myMap.values());
//
//        //enhanced for: key 값 하나씩 출력.
//        for(String a : myMap.keySet()){
//            System.out.println(myMap.get(a));
//        }

//        Map<String,String> myMap = new HashMap<>();
//        myMap.put("basketball","농구");
//        myMap.put("soccer","축구");
//        myMap.put("baseball","야구");
//
//        //iterator를 통해 key값 하나씩 출력
//        Iterator<String> myIter = myMap.keySet().iterator();
//        //next() 메소드는 데이터를 소모시키며 return/ pop과 유사함
////        System.out.println(myIter.next());
//        //hasNext() : iterator안에 값이 있는지 없는지.
//        while(myIter.hasNext()) {
//            System.out.println(myIter.next());
//        }

//        List<String> myList = new ArrayList<>();
//        myList.add("basketball");
//        myList.add("basketball");
//        myList.add("basketball");
//        myList.add("baseball");
//        myList.add("baseball");
//        myList.add("tennis");
//        myList.add("tennis");
//        myList.add("tennis");
//
//
//        Map<String, Integer> mySport = new HashMap<>();

//        for(int i =0; i < myList.size(); i++){
//            if(!mySport.containsKey(myList.get(i))){
//                mySport.put(myList.get(i), 1);
//            }else {
//                mySport.put(myList.get(i), mySport.get(myList.get(i)) + 1);
//            }
//        }
//        for (String a : myList){
//            if(mySport.containsKey(a)){
//                mySport.put(a, mySport.get(a) + 1);
//            }else {
//                mySport.put(a,1);
//            }
//        }

//        for(String a : myList){
//            mySport.put(a, mySport.getOrDefault(a, 0) + 1);
//        }


//        for(String a : mySport.keySet()){
//            System.out.println(a + "를 좋아하는 사람은" +  mySport.get(a));
//
//        }

        //LinkedHashMap: 데이터 삽입순서 유지
        Map<String, Integer> myMap = new LinkedHashMap<>();
        myMap.put("hello5",1);
        myMap.put("hello4",1);
        myMap.put("hello3",1);
        myMap.put("hello2",1);
        myMap.put("hello1",1);
        System.out.println(myMap.keySet());

        //TreeMap: key를 통한 데이터 정렬
        Map<String, Integer> myMap2 = new TreeMap<>();
        myMap2.put("hello5",1);
        myMap2.put("hello4",1);
        myMap2.put("hello3",1);
        myMap2.put("hello2",1);
        myMap2.put("hello1",1);
        System.out.println(myMap2.keySet());






    }
}
