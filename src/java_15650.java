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

        sum1(0,n,m);
        System.out.println("myList = " + myList);

    }
    static void sum1(int start, int n,int m){
        if(temp.size() == n){
            myList.add(new ArrayList<>(temp));
            return;
        }
        for(int i = start; i < n; i++){
            temp.add(i);
            sum1(start + 1, n, m);
            temp.remove(temp.size()-1);
        }
    }


}
