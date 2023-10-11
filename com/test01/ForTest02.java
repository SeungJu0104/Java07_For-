package com.test01;

import java.util.Scanner;

public class ForTest02 {
	
	//[반복문]
	//4) 중첩 For문
	//for문의 특징을 공유한다.
	//둘 이상의 for문을 중첩할 수 있다.

	public static void main(String[] args) {
		
		//[static 메소드 실행(호출)]
		//클래스명.메소드명();
		
		//ForTest02.testFor01();
		//ForTest02.testFor02();
		//ForTest02.testFor03();
		//ForTest02.testFor04();
		ForTest02.testFor05();

	}
	
	public static void testFor01() {
		
		for(int i = 0; i < 10; i++) {//i는 10번 반복
			for(int j = 0; j < 10; j++) {//i가 1씩 증가할 때마다 j는 10번씩 반복 실행한다.
				
				System.out.println("i = " + i + ", j = " + j);
				
			}
		}//총 100번(10 * 10) 반복 수행.
			
	}
	
	public static void testFor02() {
		//구구단을 2단부터 9단까지 출력한다.
		//중첩 for문을 이용한다.
		
		for(int i = 2; i <= 9; i++) {//i행
			
			System.out.println();
			System.out.println("[" + i + "단]");
			
			for(int j = 1; j <= 9; j++) {//j열
				
				//System.out.println(i + " * " + j + "=" + (i*j));//i*j의 값을 별도 변수에 저정하지 않고 직접 계산해 출력.
				
				int res = 0;//j열 반복할 때마다 곱셈 값 변수 초기화.
				res = i*j;//i와 j의 곱셈 값을 res에 대입.
				
				System.out.println(i + " * " + j + " = " + res);
				
			}
			
		}
		
	}
	
	public static void testFor03() {
		// *****
		// *****
		// *****
		// *****
		// *****
		//해당 모양으로 출력하기.
		//중첩 for문 이용한다.
		
		for(int k = 0; k < 5; k++) {//k행(5줄 출력)
			
			for(int a = 0; a < 5; a++) {//a열(한 줄에 * 5개 출력)
				
				System.out.print("*");
				
			}
			
			System.out.println();//중첩 for문 보다 앞에 이 문장이 있으면 첫 줄을 비우고 두번째 줄부터 모양을 출력한다.
			
		}
		
	}
	
	public static void testFor04() {
		//입력된 줄 수와 칸 수 만큼 * 문자를 출력한다.
		//단, 줄 수와 칸 수가 일치하는 위치에서는 줄 번호의 숫자가 출력된다.
		/*	Ex)
				1**
				*2*
				**3
			
		*/
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("줄 수 : ");
		int row = s.nextInt();
		
		System.out.print("칸 수 : ");
		int col = s.nextInt();
		
		s.close();
		
		for(int i = 1; i <= row; i++) {//i행(줄 수)
			
			for(int j = 1; j <= col; j++) {//j열(칸 수)
				
				if(i==j) System.out.print(i);//줄 수와 칸 수가 일치하는 위치에서는 줄 번호 숫자를 출력.
				else System.out.print("*");//나머지는 모두 * 문자를 출력.
				
			}
			
			System.out.println();//각 행마다 줄 바꿈.
			
		}
		
		/*
		 * for(int i = 0; i < row; i++) {//i행(줄 수)
			
			for(int j = 0; j < col; j++) {//j열(칸 수)
				
				if(i==j) System.out.print(i+1);//줄 수와 칸 수가 일치하는 위치에서는 줄 번호 숫자를 출력.
				else System.out.print("*");//나머지는 모두 * 문자를 출력.
				
			}
			
			System.out.println();//각 행마다 줄 바꿈.
			
		}
		 */
		
	}
	
	public static void testFor05() {
		/*
		 * 1 2 3 4 5
		 * 6 7 8 9 10
		 * 11 12 13 14 15
		 * 16 17 18 19 20
		 * 21 22 23 24 25
		 * 
		 * 대각선들의 숫자 합을 구한다.
		 */
		
		int sum = 0;
		int cnt = 0;
		
		for(int i = 1; i <= 5; i++) {
			
			for(int j = 1; j <= 5; j++) {
				
				cnt++;
				//System.out.print("("+i+","+j+")"+cnt + " ");
				
				if(i == j || (i+j) == 6) {
					
					sum += cnt;
					//System.out.print(sum + " ");
					
				}
				
			}
			
			//System.out.println();
			
		}
		
		System.out.println("대각선의 합 : " + sum);//13은 중복되기 때문에 한번만 합산.
			
	}

}
