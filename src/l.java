import java.util.Arrays;
import java.util.HashMap;
import java.util.*;

public class l {
    public static void main(String[] args) {

        String s = "(())()";
        boolean answer = false;
        int count = 0;

        int size = s.length();
        if(s.charAt(0) == '(' && s.charAt(size -1 ) == ')') {
            for (int i = 0; i < size; i++) {
                if (s.charAt(i) == '(') {
                    count++;
                } else {
                    count--;
                }
                if (count == 0) {
                    answer = true;
                }
            }
        }
        System.out.println(answer);
    }
}
