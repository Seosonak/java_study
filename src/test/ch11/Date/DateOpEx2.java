package test.ch11.Date;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateOpEx2 {

	public static void main(String[] args) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy.MM.dd a HH:mm:ss");

		LocalDateTime startDateTime = LocalDateTime.of(2022, 1, 1, 0, 0, 0); // 2
		System.out.println("시작일: " + startDateTime.format(dtf));

		LocalDateTime endDateTime = LocalDateTime.of(2021, 12, 31, 0, 0, 0); // 2
		System.out.println("종료일: " + endDateTime.format(dtf));

		if (startDateTime.isBefore(endDateTime)) { // 이전날짜인지?
			System.out.println("진행중입니다");
		} else if (startDateTime.isEqual(endDateTime)) {
			System.out.println("종료합니다.");
		}else if (startDateTime.isAfter(endDateTime)) {
			System.out.println("종료했습니다.");
		}
	}
}
