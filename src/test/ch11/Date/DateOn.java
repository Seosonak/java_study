package test.ch11.Date;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateOn {

	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now(); //현재 날짜시간
		
		//데이터 포맷 형태
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy.MM.dd a HH:mm:ss");
		System.out.println(now.format(dtf));
		
		LocalDateTime result1 = now.plusYears(1); // 1sus ejgka
		System.out.println(result1.format(dtf));
		
		LocalDateTime result2 = now.minusMonths(2);
		System.out.println(result2.format(dtf));
		
		LocalDateTime result3 = now.plusDays(7);
		System.out.println(result3.format(dtf));
	}

}
