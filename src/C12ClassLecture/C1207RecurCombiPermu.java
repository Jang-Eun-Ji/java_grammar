package C12ClassLecture;

import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class C1207RecurCombiPermu {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>(Arrays.asList(1,2,3,4));
        ArrayList<List<Integer>> combinations = new ArrayList<>();

//        for(int i = 0; i < myList.size() - 1; i++){
//            for(int j = i+1; j < myList.size(); j++){
//                List<Integer> temp = new ArrayList<>();
//                temp.add(myList.get(i));
//                temp.add(myList.get(j));
//                combinations.add(temp);
//            }
//        }
//        System.out.println(combinations);

        List<Integer> temp = new ArrayList<>();
//
//        for (int i = 0; i<myList.size(); i++){
//            temp.add(myList.get(i));
//            for (int j = i+1; j < myList.size(); j++){
//                temp.add(myList.get(j));
//                combinations.add(new ArrayList<>(temp)); //그냥 temp를 쓰면 주솟값을 넣어서 나중에 temp remove하면 빈칸이 나옴
//                temp.remove(temp.size() -1);
//            }
//            temp.remove(temp.size()-1);
//        }
//        System.out.println(combinations);
        Com(myList,0,2,combinations, temp);
        System.out.println("combinations = " + combinations);
    }
    public static void Com (List<Integer> myList, int start, int k, ArrayList<List<Integer>> combi, List<Integer> temp1){
        if(temp1.size() == k){
            combi.add(new ArrayList<>(temp1)); //주솟값을 저장하면 밑에서 remove할때 삭제된다.
            return;
        }
        for (int i = start; i < myList.size(); i++){
            temp1.add(myList.get(i));
            Com(myList, i+1, k, combi, temp1);
            temp1.remove(temp1.size() -1);
        }

    }


}
