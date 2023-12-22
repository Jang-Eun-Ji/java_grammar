package C16EtcClass;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Locale;

public class C1602Calendar {
    public static void main(String[] args) {
//        날짜 관련 클래스 종류: Calendar(java.util),java.time패키지 안에 있는 Local~~클래스.
//        Calendar time = Calendar.getInstance();
//        System.out.println(time.getTime());
//
////        특정한 숫자값은 get함수의 input값으로 주어 원하는 정보를 출력할수 있게 해준다.
//        System.out.println(time.get(1)); // 년도
//        System.out.println(time.get(2) + 1); // 월 1월 부터 0으로 되어서 나와서 +1해줘야함
//        System.out.println(time.get(Calendar.YEAR));
//        System.out.println(time.get(Calendar.MONTH)+1);
//        System.out.println(time.get(Calendar.DAY_OF_MONTH));
//        System.out.println(time.get(Calendar.DAY_OF_WEEK));
//        System.out.println(time.get(Calendar.HOUR_OF_DAY)); //24시 기준
//        System.out.println(time.get(Calendar.HOUR)); //12시 기준
//        System.out.println(time.get(Calendar.MINUTE));
//        System.out.println(time.get(Calendar.SECOND));

//        java.time패키지: Local~ 클래스/ 별로 안쓰
        LocalTime present_time = LocalTime.now();
        System.out.println(present_time.getHour());
//      이거
        LocalTime present_date = LocalTime.now();
        System.out.println(present_date);

        LocalDateTime this_time = LocalDateTime.now();
        System.out.println(this_time);

    }
}
