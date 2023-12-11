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
//        int[] arr = {5, 1, 2, 7, 3, 1, 2};
        //오름차순 정렬이 기본이다.
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
//        내림차순
        //방법1. comparator클레스 객체 사용
//        객체타입인 경우에만 Comparator클레스 객체 사용 가능
//        String[] st_arr = {"hello", "hi", "bye", "goodmoring"};
//        Arrays.sort(st_arr);
//        System.out.println(Arrays.toString(st_arr));
//        Arrays.sort(st_arr, Comparator.reverseOrder());
//        System.out.println(Arrays.toString(st_arr));
//
//        //Comparator 클레스는 기본형타입은 처리 불가
////        Arrays.sort(arr, Comparator.reverseOrder());
//
//        Integer[] arr_integer = {5,1,2,5,6,7};
//        Arrays.sort(arr_integer, Comparator.reverseOrder()); //int형이면 안됨
//
//        //방법2. 배열 뒤집기
//        for (int i = 0; i < arr.length / 2; i++) {
//            int temp = arr[i];
//            arr[i] = arr[arr.length - (i + 1)];
//            arr[arr.length - (i + 1)] = temp;
//        }
//        System.out.println(Arrays.toString(arr));
//        //StreamApi, lambda를 활용한
//        int[] arr2 = {5, 1, 2, 7, 3, 1, 2};
//        int[] new_arr2 = Arrays.stream(arr2) //arr2를 객체로 stream(복사)객체 생성
//                        .boxed() //Integer 형변환한 스트림객체 생성
//                        .sorted(Comparator.reverseOrder()) //내림차순 정렬
//                        .mapToInt(a->a) //Integer를 int로 변환
//                        .toArray(); //배열로 변환

        //선택정렬(오름차순)
//        int[] arr = {30,22,20,25,12};
//
//        for(int i =0; i<arr.length -1; i++){
//            for(int j = i + 1; j< arr.length; j++ ){
//                System.out.println("i = "+ i + "j = " + j);
//                if(arr[i] > arr[j]){
//                    int temp = 0;
//                    temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(arr));

        //숫자 조합의 합: 각기 다른 숫자의 배열이 있을때 만들어질수 있는 2개의 조합의 합을 출력하라
//        int[] int_arr ={10,20,30,40,50,60};
//        for(int i =0; i<int_arr.length -1; i++){
//            for(int j = i + 1; j< int_arr.length; j++ ){
//                System.out.println("int_arr = " + int_arr[i] + int_arr[j]);
//                }
//        }

//        //배열 복사
//        int[] temp = {10,10,40,5,7};
////        int[] new_temp = Arrays.copyOfRange(temp, 0, 3);
////        System.out.println(Arrays.toString(new_temp));
//
//        // 배열 중 중복되는 값 제거
//        int[] x = new int[temp.length];
//        int a = 0;
//        int index = 0;
//        Arrays.sort(temp);
//        for(int i = 0; i < temp.length -1; i++){
//            if(temp[i] != temp[i+1]){
//                x[index] = temp[i];
//                index ++;
//            }
//        }
//        x[index] = temp[temp.length -1];
//
//        int[] new_x = Arrays.copyOfRange(x, 0, index + 1);
//        System.out.println(Arrays.toString(new_x));

        // 버블정렬
//        int [] babo = {1,4,5,6,7,2};
//        int temp = 0;
//
//        for(int i = 0; i < babo.length; i++){
//            boolean isChanged = false;
//            for(int j =0; j < babo.length - i -1 ; j++){
//
//                if (babo[j] > babo[j+1]) {
//                    temp = babo[j];
//                    babo[j] = babo[j + 1];
//                    babo[j + 1] = temp;
//                    isChanged = true;
//                }
//                if (isChanged == false){
//                    break;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(babo));



        //이진검색(Binary Search)
//        사전에 오름차순 정렬이 되어 있어야 이진검색 가능.
//        int[] arr = {1,2,3,8,7};
//        int answer = Arrays.binarySearch(arr, 8);
//        System.out.println(answer);
//
//        //배열간 비교 equals, 순서까지 동일해야 true
//        int [] arr1 = {1,2,3};
//        int [] arr2 = {3,2,1};
//        System.out.println(Arrays.equals(arr1,arr2));

        //배열 복사 : copyOf(배열, endindex)
//        대상 배열을 넘어서는 경우 초기값으로 세팅괴어 endindex만큼의 배열의 길이로 세팅
        //copyOfRange(대상배열, star)

//        int[] new_arr1 = Arrays.copyOf(arr1, 10);
//        int[] new_arr2 = Arrays.copyOfRange(arr2,1,4);
//        System.out.println(Arrays.toString(new_arr1));
//        System.out.println(Arrays.toString(new_arr2));

        //가변배열 -배열안에 또 다른 배열이 있는 경우
//        int[][] arr = new int[2][3];
//        arr[0][0] = 1;
//        arr[0][1] = 2;
//        arr[0][2] = 3;
//        arr[1][0] = 4;
//        arr[1][1] = 5;
//        arr[1][2] = 6;
//        System.out.println(Arrays.deepToString(arr));
//
//        //2차원 가변배열 선언 및 할당
//        int[][] arr2 = new int[3][];// 앞의 배열 숫자는 무조건 있어야함
//        arr2[0] = new int[1];
//        arr2[1] = new int[2];
//        arr2[2] = new int[3];
////        arr2[0][0] = 10;
////        arr2[1][0] = 20;
////        arr2[2][0] = 30;
//        System.out.println(Arrays.deepToString(arr2));
//
//
//        //가변배열 리터럴 방식
//        int[][] arr3 = {{1,2,3},{1,2,3}};
//        int[][] arr4 = {{10,20,30},{20,30,40},{40,50}};
//
//        //가변배열에 1~12넣기
//        int[][] arr5 = new int[3][4];
//        int a = 1;
//        for(int i = 0; i < arr5.length; i++){
//            for(int j = 0; j< arr5[i].length; j ++){
//                arr5[i][j] = a;
//                a ++;
//            }
//        }
//        System.out.println(Arrays.deepToString(arr5));

        //가변배열 만들기
//        각 배열마다 사이즈 1,2,3,4,5 로 커지도록
//        count 1부터 시작해 끝날때 까지 +1시키면서 데이터 세팅하기
//        각 사이즈별로 10, 20, 30이 각각 1,2,3 배열에 들어가도록 하기
        int arr[][] = new int[5][];
        int a = 10;
        for(int i =0; i < 5; i++){
            arr[i] = new int[i +1];
            for (int j = 0; j <arr[i].length; j++){
                arr[i][j] = a;
            }
            a = a + 10;
        }
        System.out.println(Arrays.deepToString(arr));


    }
}
