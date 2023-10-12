package com.silsub1.example;

import java.util.Scanner;

public class ForWhile {
	
	Scanner sc = new Scanner(System.in);//전역(필드) 선언.
	//전역 선언하면 해당 클래스 내에서 추가로 선언하지 않고도 사용할 수 있다.
	
	public void printStar1() {
		
		System.out.print("정수 입력 : ");
		int no = sc.nextInt();
		
		if(no > 0) {
			
			for(int i = 1; i <= no; i++) {
				
				for(int j = 1; j <= no; j++) {
					
					/*
					if(i > j) System.out.print("*");
					else if (i < j) System.out.print("");
					else System.out.print(i);
					*/
					
					/* break를 이용한 방법
					 * if(i==j) {
					 * 	System.out.print(i);
					 * 	break;
					 * 
					 * else System.out.print("*");
					 */
					
					/* 
					 * 
					 */
					}
				
				System.out.println();
				
			}
				
					
			for(int i = 1; i <= no; i++) {
						
				for(int j = 1; j <= i; j++) {
							
						if(i==j) System.out.print(i);
						else System.out.print("*");
							
				}
					
					System.out.println();
						
			}
			
		}
		
		else System.out.println("양수가 아닙니다.");
		
	}
	
	public void printStar2() {
		
		System.out.print("정수 입력 : ");
		int no = sc.nextInt();
		
		if(no > 0) {
			/*1번 방법
			for(int i = 1; i <= no; i++) {
				
				for(int j = 1; j <= no; j++) {
					
					if(i >= j) System.out.print("*");
					
				}
				
				System.out.println();
				
			}
			*/
			//2번 방법
			for(int i = 1; i <= no; i++) {
				
				for(int j = 1; j <= i; j++) {
					
					System.out.print("*");
					
				}
				
				System.out.println();
				
			}
			
		}
		
		else if(no < 0) {
			/*1번 방법
			for(int i = -1; i >= no; i--) {
				
				for(int j= -1; j >= no; j--) {
					
					if(i >= j) System.out.print("*");
					
				}
				
				System.out.println();
				
			}
			*/
			//2번 방법
			for(int i = -(no); i > 0; i--) {
				
				for(int j = 1; j <= i; j++) {
					
					System.out.print("*");
					
				}
				
				System.out.println();
				
			}
			
		}
		
		else System.out.println("출력 기능이 없습니다.");

	}
	
	public void countInputCharacter() {
		
		
		//System.out.println((int)'a');
		//System.out.println((int)'A');
		//System.out.println((int)'z');
		//System.out.println((int)'Z');
		
		System.out.print("문자열 입력 : ");
		String str = sc.next();
		
		int i = 0, cnt = 0;//cnt는 문자 개수 카운트할 변수로 선언.
		boolean x = true;//영문자 판별 변수 선언.
		
		 
		while(i < str.length()) {//문자열 길이 만큼만 반복.(.length()는 1부터 카운트하는 것 유의)
			
			char c = str.charAt(i);//문자열의 각 글자를 문자 변수에 입력.(매번 charAt치기 귀찮고, 매번 charAt변환하느라 소스 낭비 막으려고)
			
			if((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')) {//각 문자가 영문자의 범위에 위치해 있는가?(유니코드 통해 영문자 숫자간 자동 형변환 성립)
				
				x = true;//해당 문자는 영문자
				i++;//영문자면 다음 문자가 영문자인지 검색 수행.
				
			}
			else {
				
				x = false;//해당 문자는 영문자가 아니다.
				break;//영문자 아니면 반복문 종료.
				
			}
			
			/* return을 이용한 방법.
			if( !(c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
				
				System.out.println("영문자가 아닙니다.");
				return;
				
			}
			*/
			
		}
		
		if(x == true) {
			
			System.out.print("문자 입력 : ");
			char ch = sc.next().charAt(0);//비교할 문자를 입력받는다.
			
			for(int j = 0; j < str.length(); j++) {//문자열 각 문자 비교.
				
				if(str.charAt(j) == ch) cnt++;
			
			}
			
			System.out.println("포함된 개수 : " + cnt + "개");
			
			
		}
		
		else System.out.println("영문자가 아닙니다.");
		
	}

}
