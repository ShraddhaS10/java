package com.gvacharya.datetimeapi;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class DateTimeApiDemo {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		System.out.println(today);
		
		LocalDate epochHistory = LocalDate.EPOCH.plus(19896, ChronoUnit.DAYS);
		System.out.println(epochHistory);
		
		LocalDate tomorrow= LocalDate.of(2024, 06, 23);
		System.out.println(tomorrow);
		
		LocalDate formattedDate = LocalDate.parse("24/06/2024",
				DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		
		System.out.println(formattedDate);
		
		
		LocalDate africanHarareDate = LocalDate.now(ZoneId.of("Africa/Harare"));
		System.out.println(africanHarareDate);
		
		
		LocalDate bDay = LocalDate.parse("2002-10-29");
		System.out.println(bDay.getDayOfWeek());
		System.out.println(bDay.getMonth());
		
		String strBDay=bDay.format(DateTimeFormatter.ofPattern("dd.MM.yyy"));
		System.out.println(strBDay);
		
		bDay=bDay.plusMonths(2);
		System.out.println(bDay.getDayOfWeek());
//		System.out.println(bDay.for);
		
		LocalTime timeNow = LocalTime.now();
		System.out.println(timeNow);
		
		LocalTime timeNow1 = LocalTime.of(02, 54);
		System.out.println(timeNow1);
		
		LocalTime timeNow2 = LocalTime.parse("01:30:40");
		System.out.println(timeNow2);
		
		System.out.println(timeNow2.minus(10, ChronoUnit.HOURS));
		
		LocalTime localTime = LocalTime.of(02,30);
		boolean isAfter = localTime.isAfter(LocalTime.parse("22:00"));
		boolean isBefore = localTime.isBefore(LocalTime.parse("22:00"));
		
		System.out.println(isAfter);
		System.out.println(isBefore);
		
		LocalDateTime timeStamp = LocalDateTime.now();
		System.out.println(timeStamp);
		
		Period p = Period.between(bDay, LocalDate.now());
		
		System.out.println("Years:" + p.getYears());
		System.out.println("Months:" + p.getMonths());
		System.out.println("Days:" + p.getDays());
		
		
		DayOfWeek bDayminus5=bDay.minus(Period.ofDays(5)).getDayOfWeek();
		System.out.println(bDayminus5);
		
		
		Duration timeDuration = 
				Duration.between(LocalTime.parse("09:09"), localTime.parse("08:08"));
		System.out.println(timeDuration.toHours());
		System.out.println(timeDuration.toMinutes());
		
		SimpleDateFormat simpleDate = new SimpleDateFormat("dd.MM.yyyy");
		Date newDate=null;
		try {
			newDate = simpleDate.parse("01.01.2001");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println(newDate);
		
		
		LocalTime fromTime = newDate.toInstant()
				.atZone(ZoneId.systemDefault())
				.toLocalTime();
		
		System.out.println(fromTime.getHour());
	}
}
