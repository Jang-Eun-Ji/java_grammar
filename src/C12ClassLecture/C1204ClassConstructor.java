package C12ClassLecture;

public class C1204ClassConstructor {
    public static void main(String[] args) {
//        클래스명(){} - 생성자
//        생성자는 자바에서 객체가 생성될때마다 호출되는 메소드
//        목적은 객체생성 할때 부터 사용자에게 매개변수를 넘겨받아 값을 재정의 하기위함

//        메소드 오버로딩 - 같은 이름의 메소드를 여러개 만든는것/

        Calender calender1 = new Calender();
        Calender calender2 = new Calender("1999","5"); // ==
        Calender calender201 = new Calender("1999","5", null);
        Calender calender3 = new Calender("1999","5","1");

        calender3.hello();
        calender2.hello();
        calender1.hello();


    }
}
class Calender {
    private String year;
    private String month;
    private String day;

    //생성자의 값 초기화 - 객체를 만들때 사용자가 입력한 값을 세팅하라
    public Calender() {

    }

    public Calender(String year, String month) {
        this.year = year;
        this.month = month;
    }
//     == public Calender(String year, String month) {
////        this() 키워드를 통해 클래스 내 매개변수에 맞는 생성자 호출 가능
//        this(year, month, null);   //()안 매개변수 갯수에 따라 위 생성자와 매개변수 갯수가 같은거의 매개변수를 가져옴
//
//    }

    public Calender(String year, String month, String day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public Calender(String year) {
//        this() 키워드를 통해 클래스 내 매개변수에 맞는 생성자 호출 가능
        this(year, null, null);   //()안 매개변수 갯수에 따라 위 생성자와 매개변수 갯수가 같은거의 매개변수를 가져옴

    }

    public void hello(){
        System.out.println(this.year + "년" + this.month + "월" + this.day + "일에 귀여운 은지가 태어남");
    }

    public String getYear() {
        return year;
    }

    public String getMonth() {
        return month;
    }

    public String getDay() {
        return day;
    }
}

