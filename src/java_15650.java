import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.*;
public class java_15650 {
    static int n, m;
    static List<Integer> temp = new ArrayList<>();
    static List<List<Integer>> myList = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk =new StringTokenizer(bf.readLine());
        n = Integer.parseInt(stk.nextToken());
        m = Integer.parseInt(stk.nextToken());
        System.out.println("n = " + n);
        System.out.println("m = " + m);

        sum1(1,n,m,myList);
        System.out.println("myList = " + myList);

    }
    static void sum1(int start, int n,int m, List<List<Integer>> myList){
        if(temp.size() == m){
            myList.add(new ArrayList<>(temp));
            return;
        }
        for(int i = start; i < n; i++){
            temp.add(i);
            sum1(i + 1, n + 1, m, myList);
            temp.remove(temp.size()-1);
        }
    }


}
