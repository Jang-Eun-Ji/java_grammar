import java.util.Arrays;
import java.util.HashMap;
import java.util.*;

public class l {
    public static void main(String[] args) {

        int[] scoville = {1, 2, 3, 9, 10, 12};
        int K = 7;

        List<Integer> myList = new ArrayList<>();
        for(int a : scoville){
            myList.add(a);
        }

        Map<Integer, Integer> myMap = new TreeMap<>();
        for(int i = 0; i < myList.size(); i++){
            myMap.put(myList.get(i), i);
        }
        myMap.put(myList.get(0), 0);

        int count = 0;
        System.out.println(myList.get(0));
        while (K > myList.get(0)){
            Iterator<Integer> myIter = myMap.keySet().iterator();
            int temp1 = myIter.next();
            int temp2 = myIter.next();
            myList.add(temp1 + temp2);

            for(int i = 0; i < myList.size(); i++){
                myMap.put(myList.get(i), i);
            }
            myList.clear();
            for(int a : myMap.keySet()){
                myList.add(a);
            }
            count++;
            if(myList.size() == 1 && myList.get(0) < K){
                count = -1;
                break;
            }

        }

        System.out.println(count);



    }
}
