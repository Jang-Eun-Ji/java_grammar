package C12ClassLecture;

//defalt - 메소드면 같은 패키지 내에만 접근 가능
public class C1203Class2 {
    public static void main(String[] args) {
//        Person MyPerson1 = new Person();
////        변수 값에 직접 접근하여 값을 할당하는 방식
//        MyPerson1.name = "장은지";
//        MyPerson1.email = "jej132456@gamil.com";
//        MyPerson1.age = 24;
//        Person.person_total+=1;
//        System.out.println(MyPerson1.whoIs());
//
//        Person MyPerson2 = new Person();
////        변수 값에 직접 접근하여 값을 할당하는 방식
//        MyPerson2.name = "장은지";
//        MyPerson2.email = "jej132456@gamil.com";
//        MyPerson2.age = 24;
//        Person.person_total+=1;
//        System.out.println(MyPerson2.whoIs());
//
//        Person MyPerson3 = new Person();
////        변수 값에 직접 접근하여 값을 할당하는 방식
//        MyPerson3.name = "장은지";
//        MyPerson3.email = "jej132456@gamil.com";
//        MyPerson3.age = 24;
//        Person.person_total+=1;
//        System.out.println(MyPerson3.whoIs());
        Person myPerson4 = new Person();
        myPerson4.setName("은지");
        myPerson4.setEmail("jej");
        myPerson4.setAge(24);
        System.out.println(" is " + myPerson4.getName() + " 나이는 " + myPerson4.getAge() + " 입니다 ."
                + myPerson4.getEmail() + " 여기로 연락해 미친놈인가");

    }
}

class Person {
    private String name; //초깃값 null
    private int age;
    private String email;
    private int password;
    private int person_total; //초깃값 0임

    //setter - 이름을 세팅하는 public 메소드
    public void setName(String name) {
        if (name.length() > 10) {
            System.out.println("이름이 너무 깁니다.");
        } else {
            this.name = name;
            System.out.println("이름 세팅되었습니다.");
        }
    }

    //이름을 메인에서 get 하게 하는 메소드
    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        if (age > 20) {
            System.out.println("나이가 너무 어려");
        } else {
            this.age = age;
            System.out.println("성인 인증 됨");
        }

    }

    public int getAge() {
        return this.age;
    }

    public void setEmail(String email) {
        if (email.contains("@")) {
            this.email = email;
            System.out.println("이메일 세팅됨");
        } else {
            System.out.println("이메일 형식이 아님");
        }
    }

    public String getEmail() {
        return this.email;
    }

}

