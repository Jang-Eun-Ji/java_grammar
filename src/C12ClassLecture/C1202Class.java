package C12ClassLecture;

public class C1202Class {
//    매개변수 없음() 없음, 변수, 메소드있을수도 없을수도(클래스안의 실행되는 클래스(main메소드가 있는)가있을 수도) 있음
//    클래스는 객체를 만들어 내기 위한 도면 같은것
//    함수 == 메소드
    public static void main(String[] args) {
//        변수 = 필드
//      클래스 변수 - static있는거
//      인스턴스 변수 - static없는거 보통 객체에 스태틱없음
//        메소드 입력값 = 매개변수 = parameter
//        메소드 내에서 선언된 변수는 해당 메소드 내에서만 유효 - 지역변수
//        클레스 변수와 객체변수는 저장되는 위치가 다름


        int total =  MyCalculator.sum(19,20);
        System.out.println(total);


//        A부서의 매출
        MyCalculator.sum_acc(10);
        MyCalculator.sum_acc(20);
        MyCalculator.sum_acc(30);
        System.out.println(MyCalculator.total);

//        B부서의 매출

        MyCalculator.sum_acc(10);
        MyCalculator.sum_acc(20);
        MyCalculator.sum_acc(30);
//        클래스 변수를 공용으로 사용하다 보니, 변수와 메소드에 고유성이 보장되지 않음/ 객체는 복제가능 메소드는 불가능
        System.out.println(MyCalculator.total);

//        A부서의 매출
        MyCalInsatance myCalA = new MyCalInsatance();
        myCalA.sum_acc(10);
        myCalA.sum_acc(20);
        myCalA.sum_acc(30);
        System.out.println(myCalA.total);

//        B부서의 매출
        MyCalInsatance myCalB = new MyCalInsatance();
        myCalB.sum_acc(10);
        myCalB.sum_acc(20);
        myCalB.sum_acc(30);
        System.out.println(myCalB.total);


    }
}

//내부 클레스, 클레스 public는 한개만 됨
class MyCalculator{
    static int total = 0;

    static int sum(int num1, int num2) {
        return num1 + num2;
    }
    static void sum_acc(int a) {
        total +=a;
    }


}

class MyCalInsatance{
    //static이 붙어있는 변수는 클래스변수
//    안붙어 있으면 객체 변수
    int total = 0;

    int sum(int num1, int num2) {
        return num1 + num2;
    }
    void sum_acc(int a) {
        //객체 그자신을 의미한다. 위의 total에 static이 있으면 this가 의미가 없음
        this.total += total;
        //이 클래스 안의 total이라는걸 의미하고 우측은 사용자가 입력한 total이라는걸 의미(없어도 가능하지만 있으면 좀더 확실함)
    }


}