package com.won.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.*;

public class tempCaclurator {

	public static void main(String[] args) {
		LocalDateTime currentDay = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일");
		String formatted = currentDay.format(formatter);
		int goalWaitDay; // 목표 달성까지
		int goalPrice; // 목표금액
		int currentCompletionPrice; // 현재 목표 달성금액
		int goalPrecent; // 목표 달성률
		
		int goalYear = 2023;
		int goalMonth = 10;
		int goalDay = 30;
		LocalDateTime endDT = LocalDateTime.of(goalYear, goalMonth, goalDay, 14, 30, 55); // 여기에 목표날짜 받아오기..

		Period diff = Period.between(currentDay.toLocalDate(),endDT.toLocalDate());
		
		goalWaitDay = diff.getYears() + diff.getMonths() + diff.getDays();
		goalPrice = 2000000; // 목표 금액 받아오기
		currentCompletionPrice = 205000; // 현재 달성 금액 받아오기
		goalPrecent = (int)((float)currentCompletionPrice / (float)goalPrice * 100);
		
		System.out.println(
		formatted + " 기준\n"
		+ "목표 달성까지 " + goalWaitDay + "일\n" 
		+ "목표 금액 " + goalPrice + "원\n"
		+ "현재 달성 금액 " + currentCompletionPrice + "원\n"
		+ "목표 달성률 " + goalPrecent + "%");
		
	}

}
