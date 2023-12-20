import java.util.Arrays;
import java.util.HashMap;
import java.util.*;

public class l {
    static int sum;
    static int count = 0;
    static int k = 80;
    static int[][] dungeons = {{80,20},{50,40},{30,10}};
    static boolean[] visited = new boolean[dungeons.length];
    public static void main(String[] args) {
        permitation3(dungeons,0,sum, k);
        System.out.println(count);

    }
    public static void permitation3(int[][]dungeon,int start, int sum, int k){
        if(count < sum ){
            count = sum;
        }
        for (int i = start; i < dungeon.length; i++){
            if(!visited[i] && k >= dungeon[i][0]){
                visited[i] = true;
                sum++;
                k -= dungeon[i][1];
                permitation3(dungeon,i, sum, k);
                visited[i] = false;
                sum--;
                k = k + dungeon[i][1];
            }
        }

    }
}
