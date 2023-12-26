package C16EtcClass; //enum타입임

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;
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

//        임의로 특정시간을 만들어 내고 싶을때: of 매소드 사용
        LocalDate birthDay = LocalDate.of(1999,05,01);
//        일반 내장 메소드
        System.out.println(birthDay.getYear());
        System.out.println(birthDay.getMonth());
        System.out.println(birthDay.getDayOfMonth());
        LocalTime birthTime = LocalTime.of(02,03,19);

        LocalDateTime birthDayTime = LocalDateTime.of(birthDay, birthTime);
        System.out.println(birthDayTime);

//        크로노 필드 enum타입 사용 - class변수처럼 사용됨, 중요하진 않음, 매개변수로 크로노필드를 받아 프로그램의 유연성 향상
        System.out.println(birthDayTime.get(ChronoField.YEAR));
        System.out.println(birthDayTime.get(ChronoField.MONTH_OF_YEAR));
//        0: 오전, 1: 오후
        System.out.println(birthDayTime.get(ChronoField.AMPM_OF_DAY));
//        현재 시간은 오전, 오후 입니다.
//        int ampm = ChronoField.AMPM_OF_DAY.ordinal();
        int ampm = this_time.get(ChronoField.AMPM_OF_DAY);
        String AmPm = "오후";
        if (ampm == 0);{
            AmPm = "오전";
        }
        System.out.println("현재 시간은 " + AmPm + "입니다.");



    }
}
