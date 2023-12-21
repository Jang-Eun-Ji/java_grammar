package C15AnonymousLambda;

import java.util.*;

public class C1503ComparableComparator {
    public static void main(String[] args) {
//        자바에서는 비교를 위한 인터페이스가 대표적으로 2개 제공: comparable, Comparator
//  Comparable 인터페이스에는 compareTo메소드가 선언, 그리고 java의 많은 클래스에서 구현하고 있음 => 일반적으로 클래스내에서 직접 구현해서 사용하는 방식
//          Compartor인터페이스에는 compare메소드가 선언

//        두 문자열의 각 문자를 앞에서부터 순차적으로 비교
//        문자열의 자릿수의 차이가 발생할때, 그 문자의 유니코드 값의 차이를 반환,
        String a = "hello";
        String b = "world";
        System.out.println(a.compareTo(b));
        List<String> myList = new ArrayList<>();
        myList.add(a);
        myList.add(b);
        Collections.sort(myList); //Comparable의 compareTo메소드를 통해 정렬
////        음수를 return하면 왼쪽이 더 작고, 0이면 같은거다
        Collections.sort(myList, Comparator.reverseOrder());
        myList.sort(Comparator.naturalOrder());
        myList.sort(Comparator.reverseOrder());

        Integer intA = 1;
        Integer intB = 1;
        System.out.println(intA.compareTo(intB));
//
//
        List<Student> studentList = new ArrayList<>();

//        studentList.add(new Student("은지", 22));
//        studentList.add(new Student("어린 은지", 25));
//        studentList.add(new Student("귀여운 은지", 20));
//        studentList.add(new Student("예쁜 은지", 24));
        System.out.println(studentList);

        //방법1: Comparable 인터페이스 implements 후 compareTo메서드 구현, 매개변수 1개
//      나이로 정렬
        studentList.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
//                기본은 오름차순 정렬하려고 시도함
//                기본적으로 음수가 나오게함, 만약 빼서 양수가 나오면 내림차순이라 내림차순되는거라 위치가 바뀜
                return o2.getAge() - o1.getAge();
                //양수면 바꾼다는 생각을 가지고 있어 o2에서 빼면 내림차순이 되는겨

            }
        });

        System.out.println(studentList);

//        방법 2: Compator를 익명객체 방식으로 활용하여 정렬, 매개변수 2개
//        Collections.sort(studentList, Comparator.comparing());
//        studentList.sort(Comparator.reverseOrder());
        studentList.sort((o1, o2) -> o1.getAge() - o2.getAge());
        System.out.println(studentList);
//        이름으로 정렬
        studentList.sort((o1, o2)-> o1.getName().compareTo(o2.getName()));
//        글자길이수로 정렬
        String[] stArr = {"hello", "java", "C++", "world"};
        Arrays.sort(stArr, (o1,o2) -> o1.length() - o2.length());

//        이 문자로 이루어진 가장 큰숫자를 구하라

    }
}
class Student implements Comparable<Student> {
    private String name;
    private int age;

    Student(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
//    조상 클래스인 Object클래스의 toString overriding 하여 객체호출시 자동으로 toString매소드 호출
    @Override
    public String toString(){
        return "이름은 "+this.name + " 나이는 "+this.age;
    }

    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.name);
    }
}

