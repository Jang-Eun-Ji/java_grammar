public class l {
    public static void main(String[] args) {
        String X ="5525";
        String Y ="1255";

        String answer = "";
        String a = "";
        //x에서 겹치는것 삽입
        for(int i = 0; i < X.length(); i++){
            char xnum = X.charAt(i);
            for (int k = 0; k < Y.length(); k++){
                char ynum = Y.charAt(k);
                if(xnum == ynum){
                    a += String.valueOf(xnum);
                    System.out.println(xnum);
                }
            }
        }
        System.out.println("a = "+ a);
        // X랑 Y랑 겹치는 숫자가 없을때
        if (a ==""){
            answer = "-1";
        }
        // X랑 Y가 겹치는 숫자가 0일때
        if(a == "[0]+"){
            answer = "0";
        }
        //Y보다 많은 숫자가 들어가면 Y로 입력하기

//        System.out.println(answer);
    }
}
