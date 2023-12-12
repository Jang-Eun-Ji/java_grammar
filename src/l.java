import java.util.Arrays;
import java.util.HashMap;
import java.util.*;

public class l {
    public static void main(String[] args) {

        int [] nums = {3,1,2,3};
        Map <Integer, Integer> myMap = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(myMap.containsKey(nums[i])){
                myMap.put(nums[i],myMap.get(nums[i])+ 1);
            }else {
                myMap.put(nums[i],1);
            }
        }
        int k = 0;
        for(Integer a : myMap.keySet()){
            k++ ;
        }
        System.out.println(k);

    }
}
