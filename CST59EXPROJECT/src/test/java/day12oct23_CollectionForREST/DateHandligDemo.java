package day12oct23_CollectionForREST;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateHandligDemo {

	public static void main(String[] args) {

		LocalDate today = LocalDate.now();
		LocalTime LT = LocalTime.now();
		LocalDateTime LDT = LocalDateTime.now();
		System.out.println(today +" : " + LT +" : " + LDT);
		
		System.out.println("today.getDayOfWeek() : " + today.getDayOfWeek());
		System.out.println("today.getDayOfMonth(): " + today.getDayOfMonth());
		System.out.println("today.getDayOfYear() : " + today.getDayOfYear());
		System.out.println("today.getYear()      : " + today.getYear());
		System.out.println("today.getMonth()     : " + today.getMonth());
		System.out.println("today.getMonthValue(): " + today.getMonthValue());

		System.out.println("today.isLeapYear()   : " + today.isLeapYear());

		System.out.println("Total Days in a year : " + today.lengthOfYear());
		System.out.println("Total Days in a month: " + today.lengthOfMonth());
		
		/*
		 * ISO 8601 is an international standard covering the worldwide exchange 
		 * and communication of date and time-related data. It is maintained by 
		 * the International Organization for Standardization (ISO) 
		 */
		System.out.println("today.getChronology: " + today.getChronology());

	
		// Operations on date/time
				System.out.println("Days after 10 days     : " + today.plusDays(10));
				System.out.println("Days after 100 days    : " + today.plusDays(100));
				System.out.println("Days after 1000 days   : " + today.plusDays(1000));
				System.out.println("Weeks after 5 weeks    : " + today.plusWeeks(5));
				System.out.println("Days after 12 months   : " + today.plusMonths(12));
				System.out.println("Days after 12 years    : " + today.plusYears(12));

				System.out.println("Days before 10 days     : " + today.minusDays(10));
				System.out.println("Days before 100 days    : " + today.minusDays(100));
				System.out.println("Days before 1000 days   : " + today.minusDays(1000));
				System.out.println("Weeks before 5 weeks    : " + today.minusWeeks(5));
				System.out.println("Days before 12 months   : " + today.minusMonths(12));
				System.out.println("Days before 12 years    : " + today.minusYears(12));

				// can create instance of new date as below
				LocalDate hundredYearsBefore = today.minusYears(100);
				System.out.println("100 years before : " + hundredYearsBefore);
				// today will not change though
				System.out.println("today : " + today);
	
				
				// LocalTime operations: Similar operation as that of LocalDate are present
				// you can add or subtract hours, minutes, seconds, Nanos,

				LocalTime now = LocalTime.now();
				System.out.println("Current time    : " + now);
				System.out.println("now.getHour     : " + now.getHour());
				System.out.println("now.getMinute   : " + now.getMinute());
				System.out.println("now.getSecond   : " + now.getSecond());
				System.out.println("now.getNano     : " + now.getNano());
				
				
				// compare and set dates

				LocalDate yesterday = LocalDate.of(2023, 10, 16); 
				System.out.println("yesterday: " + yesterday);

				System.out.println("today.withYear(2012)      : " + today.withYear(2012));
				System.out.println("today.withDayOfMonth(21)  : " + today.withDayOfMonth(21));
				System.out.println("today.Month(3)            : " + today.withMonth(3));
				System.out.println("today.withDayOfYear(11)   : " + today.withDayOfYear(11));
				System.out.println("today.withDayOfYear(120)  : " + today.withDayOfYear(120));

				// compare dates
				System.out.println("Today      :" + today);
				System.out.println("Yesterday  :" + yesterday);

				System.out.println("today.isBefore(yesterday) : " + today.isBefore(yesterday));
				System.out.println("today.isAfter(yesterday)  : " + today.isAfter(yesterday));
				System.out.println("yesterday.isBefore(today) : " + yesterday.isBefore(today));
				System.out.println("yesterday.isAfter(today)  : " + yesterday.isAfter(today));

	}

}
