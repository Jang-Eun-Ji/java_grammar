import java.util.Arrays;
import java.util.HashMap;

public class l {
    public static void main(String[] args) {
//        int [] nums = {3,2,4};
//        int target = 6;
//        int x =0;
//        int[] arr = new int [2];
//        HashMap<Integer, Integer> map = new HashMap<>();
//        map.put(nums[x], target - nums[x]);
//        for(int i = 0; i < nums.length; i++){
//            if(map.get(nums[x]) == nums[i] && (x != i)){
//                System.out.println("hi" + x + i);
//                arr[0] = x;
//                arr[1] = i;
//            }
//        }
//
//        System.out.println(Arrays.toString(arr));


        //프로그래머스
        int[] numbers = {2,1,3,4,1};
        int [] a = new int[numbers.length*(numbers.length -1)];
        int index = 0;
        for(int i = 0; i < numbers.length - 1; i++){
            for (int j = i + 1; j < numbers.length; j++){
                a [index] = numbers[i] + numbers[j];
                index ++;
            }
        }

        int [] res = Arrays.copyOfRange(a, 0, index);
        Arrays.sort(res); // a = numbers의 값을 다 더한 값 배열
        System.out.println(Arrays.toString(res));
        int iindex = 0;
        int [] answer_i = new int [res.length];
        for(int i = 0; i < res.length -1; i++){
            if(res[i] != res[i+1]){
                answer_i[iindex] = res[i];
                iindex ++;
            }
        }
        answer_i[iindex] = res[res.length -1];
        int[] new_x = Arrays.copyOfRange(answer_i, 0, iindex + 1);

    }
}
