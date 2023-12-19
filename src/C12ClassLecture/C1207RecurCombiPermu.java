package C12ClassLecture;

import javax.swing.plaf.IconUIResource;
import java.net.Inet4Address;
import java.util.*;

public class C1207RecurCombiPermu {
    static List<Integer> myList = new ArrayList<>(Arrays.asList(1,2,3,4));
    static boolean[] permi = new boolean[myList.size()];
    static int max = 0;
    static List<Integer> max_List = new ArrayList<>();

    static List<Integer> temp = new ArrayList<>();
    public static void main(String[] args) {

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
        // 1번 출력
//        permitation1(0,combinations, temp, new boolean[myList.size()]);
//        System.out.println("c = " + combinations);
            //2번 출력
//        for(int k = 1; k < myList.size() + 1; k++){
//            permitation2(0,k,combinations, temp, new boolean[myList.size()]);
//        }
//        System.out.println("c = " + combinations);
//        System.out.println(combinations.size());
        //3번 출력

        permitation3(0,3,combinations,new boolean[myList.size()],0,0 );
        System.out.println(max);

    }
//    public static void Com (List<Integer> myList, int start, int k, ArrayList<List<Integer>> combi, List<Integer> temp1){
//        if(temp1.size() == k){
//            combi.add(new ArrayList<>(temp1)); //주솟값을 저장하면 밑에서 remove할때 삭제된다.
//            return;
//        }
//        for (int i = start; i < myList.size(); i++){
//            temp1.add(myList.get(i));
//            Com(myList, i+1, k, combi, temp1);
//            temp1.remove(temp1.size() -1);
//        }
//
//    }
    public static void permitation1 (int start, ArrayList<List<Integer>> combi,
                                    List<Integer> temp1, boolean[] visited){
        if(temp1.size() == 2){
            int count = 0;
            for(int a :temp1){
                count +=a;
            }
            if(count >= 6){
                combi.add(new ArrayList<>(temp1)); //주솟값을 저장하면 밑에서 remove할때 삭제된다.
            }
            return;
        }
        for (int i = start; i < myList.size(); i++){
            if(!visited[i]){
                visited[i] = true;
                temp1.add(myList.get(i));
                permitation1(start, combi, temp1, visited);
                temp1.remove(temp1.size() -1);
                visited[i] = false;
            }
        }

    }

//    public static void permitation2 (int start,int k, ArrayList<List<Integer>> combi,
//                                     List<Integer> temp1, boolean[] visited){
//
//        int count = 0;
//        if(temp1.size() == k){
//            for(int a :temp1){
//                count +=a;
//            }
//            if(count >= 6){
//                combi.add(new ArrayList<>(temp1));
//                return;
//            }
//        }
//
//        for (int i = start; i < myList.size(); i++){
//            if(!visited[i]){
//                visited[i] = true;
//                temp1.add(myList.get(i));
//                permitation2(start,k, combi, temp1, visited);
//                temp1.remove(temp1.size() -1);
//                visited[i] = false;
//            }
//        }
//
//
//    }

    public static void permitation3 (int start, int k, ArrayList<List<Integer>> combi,
                                     boolean[] visited,int temp, int count){
        if(count == k){
            if(temp > max){
                max = temp;
            }
            return;
        }
        for (int i = start; i < myList.size(); i++){
            if(!visited[i]){
                visited[i] = true;
                temp += myList.get(i);
                permitation3(start,k, combi, visited,temp, count +1);
                temp -= myList.get(i);
                visited[i] = false;
            }
        }

    }
}
