package C16EtcClass;

import java.util.Arrays;

public class C1603GenricMain {
    public static void main(String[] args) {
//        재너릭 메소드 안쓴 예제
        String[] stArr = {"java","python","C++"};
        swap(stArr, 0, 1);
        System.out.println(Arrays.toString(stArr));

        Integer[] intArr = {1,2,3,4,5};
        swap(intArr, 0,1);
        System.out.println(Arrays.toString(intArr));

        GenericStudent <String>stu = new GenericStudent<>();
        System.out.println(stu.getAge().getClass());
        stu.setAge("20");
        System.out.println(stu.getAge());

        GenericStudent <Integer> intu = new GenericStudent<>();
        System.out.println(intu.getAge().getClass());
        intu.setAge(25);
        System.out.println(intu.getAge());
    }

//    static Integer[] swapIn(Integer[] intArr, int a, int b) {
//        Integer temp2 = 0;
//        temp2 = intArr[a];
//        intArr[a] = intArr[b];
//        intArr[b] = temp2;
//        return intArr;
//    }
//    static String[] swapSt(String [] stArr, int a, int b){
//        String temp1 = "";
//        temp1 = stArr[a];
//        stArr[a] = stArr[b];
//        stArr[b] = temp1;
//        return stArr;
//    }
    //재네릭 메소드 생성: 반환타입 왼쪽에 <T> 선언
//    제네릭은 객체 타입이 들어와야함에 유의
    static <T> T[] swap(T [] arr, int a, int b){
        T temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
        return arr;
    }



}
class GenericStudent <T>{
    String name;
    T age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public T getAge() {
        return age;
    }

    public void setAge(T age) {
        this.age = age;
    }
}

