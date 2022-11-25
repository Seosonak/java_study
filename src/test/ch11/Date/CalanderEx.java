package test.ch11.Date;

import java.util.Calendar;

public class CalanderEx {

	public static void main(String[] args) {
		Calendar now = Calendar.getInstance(); //현재 시간과날짜를 가져옴
		int year = now.get(Calendar.YEAR);   //now에 겟 연도를 구한다 ,
		int month = now.get(Calendar.MONTH);
		int day = now.get(Calendar.DAY_OF_MONTH);
		int week = now.get(Calendar.DAY_OF_WEEK); //요일 일요일-1 토요일-7
		System.out.println(year);
		System.out.println(month);
		System.out.println(day);
		System.out.println(week);
		
		String strWeek = null;
		
		 switch(week) {
		 case Calendar.MONDAY: strWeek = "월"; break;
		 case Calendar.TUESDAY: strWeek = "화"; break;
		 case Calendar.WEDNESDAY: strWeek = "수"; break;
		 case Calendar.THURSDAY: strWeek = "목"; break;
		 case Calendar.FRIDAY: strWeek = "금"; break;
		 case Calendar.SATURDAY: strWeek = "토"; break;
		 case Calendar.SUNDAY: strWeek = "일"; break;
		 
		 }
		 System.out.println(strWeek);
		 int amPm = now.get(Calendar.AM_PM);
		 System.out.println(amPm);
		 System.out.println(Calendar.AM);
		 if(amPm == Calendar.AM) {
			 System.out.println("오전"); 
		 }else {
			 System.out.println("오후");
		 }
		 System.out.println(now.get(Calendar.HOUR)+ "," + now.get(Calendar.MINUTE) + ","
				 + now.get(Calendar.SECOND));
	}

}
