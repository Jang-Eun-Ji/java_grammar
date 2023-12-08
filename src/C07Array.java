import java.util.Arrays;
import java.util.Comparator;

public class C07Array {
    public static void main(String[] args) {
        //표현식1
//        int[] int_arr1 = {1,2,3,4};
//        //표현식2 // [] 안의 값은 length 값이다.
//        int[] int_arr2 = new int[4];
//        int_arr2[0] = 1;
//        int_arr2[1] = 2;
//        int_arr2[2] = 3;
//        int_arr2[3] = 4;
//        int_arr2[4] = 5;
        //표현식3/ 자주안써
//        int[] int_arr3 = new int[]{1,2,3,4};
        //표현식4는 불가 java의 배열은 반드시 길이가 지정되어야 함
//        int[] int_arr4 = new int[];

        //int 배열을 선언한뒤, 총합, 평균값
//        int[] int_sum = {85,65,90};
//        int sum = 0;
//        int ave = 0;
//        for(int i = 0; i < int_sum.length; i++){
//            sum += int_sum[i];
//        }
//        ave = sum/int_sum.length;
//
//        System.out.println(sum);
//        System.out.println(ave);

        //최댓값, 최솟값
//        int[] arr = {10,20,30,12,8,17};
//        int max = arr[0];
//        int min = arr[0];
//
//        for(int i = 1; i < arr.length; i++){
//            if(max < arr[i]){
//                max = arr[i];
//            }
//            if(min > arr[i]){
//                min = arr[i];
//            }
//        }
//        System.out.println(max);
//        System.out.println(min);

        //순서 바꾸기
//        int[] arr = {10,20};
//        int temp = arr[0];
//        arr[0] = arr[1];
//        arr[1] = temp;
//        System.out.println(Arrays.toString(arr));

//        //0번째 INDEX부터 마지막 자리까지 CHANGE
//        int[] arr2 = {10,20,30,40,50,60,70};
//        for(int i = 0; i < arr2.length -1; i++){
//            int temp2 = arr2[i];
//            arr2[i] = arr2[i+1];
//            arr2[i+1] = temp2;
//        }
//        System.out.println(Arrays.toString(arr2));

        //배열 뒤집기
//        int[] arr = {1, 2, 3, 4, 5};
        //신규배열 선언
//        int[] new_arr = new int[5];
//        for(int i = 0; i < new_arr.length; i++){
//            new_arr[i] = arr[new_arr.length - (i + 1)];
//        }
//        System.out.println(Arrays.toString(new_arr));
        //배열 자체를 뒤집기
//        for (int i = 0; i < arr.length / 2; i++) {
//            int temp = arr[i];
//            arr[i] = arr[arr.length - (i + 1)];
//            arr[arr.length - (i + 1)] = temp;
//        }
//        System.out.println(Arrays.toString(arr));

        // 이렇게 선언만 하면 다 null로 채워져 있음 or 123만 선언해도 나머지가 null 이라 또 에러임
//            String[] arr_st = new String[5];
//            for(int i = 0; i < arr_st.length; i++){
//                if(arr_st[i].isEmpty()){
//                    System.out.println("비어있습니다");
//                }
//            }
//
//            int[] arr_int = new int[5];
//            for(int i = 0; i < arr_int.length; i++){
//                    arr_int[i] +=10;
//            }


        //정렬: sort() 함수 사용
        int[] arr = {5, 1, 2, 7, 3, 1, 2};
        //오름차순 정렬이 기본이다.
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
//        내림차순
        //방법1. comparator클레스 객체 사용
//        객체타입인 경우에만 Comparator클레스 객체 사용 가능
        String[] st_arr = {"hello", "hi", "bye", "goodmoring"};
        Arrays.sort(st_arr);
        System.out.println(Arrays.toString(st_arr));
        Arrays.sort(st_arr, Comparator.reverseOrder());
        System.out.println(Arrays.toString(st_arr));

        //Comparator 클레스는 기본형타입은 처리 불가
//        Arrays.sort(arr, Comparator.reverseOrder());

        Integer[] arr_integer = {5,1,2,5,6,7};
        Arrays.sort(arr_integer, Comparator.reverseOrder()); //int형이면 안됨

        //방법2. 배열 뒤집기
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - (i + 1)];
            arr[arr.length - (i + 1)] = temp;
        }
        System.out.println(Arrays.toString(arr));
        //StreamApi, lambda를 활용한
        int[] arr2 = {5, 1, 2, 7, 3, 1, 2};
        int[] new_arr2 = Arrays.stream(arr2) //arr2를 객체로 stream(복사)객체 생성
                        .boxed() //Integer 형변환한 스트림객체 생성
                        .sorted(Comparator.reverseOrder()) //내림차순 정렬
                        .mapToInt(a->a) //Integer를 int로 변환
                        .toArray(); //배열로 변환






    }
}
