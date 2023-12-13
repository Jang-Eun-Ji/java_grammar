import java.util.Arrays;
import java.util.HashMap;
import java.util.*;

public class l {
    public static void main(String[] args) {

        int [] numbers = {3,1,2,3};
        Set<String> mySet = new TreeSet<>();

        List<Integer> myList = new ArrayList<>();
        for(int i = 0; i < numbers.length - 1; i++){
            for (int j = i + 1; j < numbers.length; j++){
                myList.add(numbers[i] + numbers[j]);
            }
        }
        Collections.sort(myList);
        System.out.println(myList);







    }
}
