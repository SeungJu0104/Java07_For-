package com.test01;

import java.util.Scanner;//java.util 패키지의 Scanner 클래스를 import

public class ForTest01 {
	//[반복문]
		//3) For문
		//For(초기식; 조건식; 증감식) {조건식이 참일 동안 수행할 코드}
		//조건식의 결과 값은 논리값(true 또는 false)를 가져야한다.
		//초기식, 증감식은 1개 이상 기입 가능하다.
		//초기값 -> 조건식 -> 수행 코드 -> 증감식 순으로 반복 진행된다.
		//조건식의 결과 값이 true이면 계속해서 반복, false면 반복 종료.
		//조건문, 반복문 중첩 가능.

	public static void main(String[] args) {
		//[non static 메소드 실행]
		//클래스명 변수명 = new 클래스명();(이 문장은 한 클래스에 한번만 적어도 된다.)
		//변수명.메소드명();
		//또는 클래스명().메소드명();
		
		ForTest01 t = new ForTest01();
		//t.testFor01();
		//t.testFor02();
		//t.testFor03();
		t.testFor04();
		

	}
	
	public void testFor01() {
		//1-10 출력
		for(int i = 1; i<=10; i++) {
			
			System.out.println("i : " + i);
			
		}//변수 i는 for문에만 있는 지역변수.
		
	}
	
	public void testFor02() {
		//10~1 출력
		for(int i = 10; i>=1; i--) {
			
			System.out.print(i + " ");
			
		}//변수 i는 for문에만 있는 지역변수.
		
		System.out.println();
		
		for(int i = 0; i<10; i+=2) {
			
			System.out.println(i);
			
		}//변수 i는 for문에만 있는 지역변수.
		
		//초기식, 증감식은 1개이상 기입 가능하다.
		for(int i=0, j = 10; i<10 && j>0; i++, j--) {
			
			System.out.println(i + "번째");
			System.out.println(j + "번째");
			
		}
		
		for(char ch = 'a'; ch <= 'z'; ch++) {//문자와 숫자는 유니코드로 대응되는 값이 서로 존재. 그래서 자동형변환 발생.
			
			System.out.print(ch + " ");
			
		}
		
		//for문의 무한반복
		for(;;) {
			System.out.println('a');
		}//a가 무한히 계속 출력된다.
	
	}
	
	public void testFor03() {
		//정수를 한개 입력받아 그 수가 1-9면 해당 숫자의 구구단을 출력한다.
		//양수가 아니면 "반드시 1-9사이의 양수를 입력해야 합니다."를 출력한다.
		
		System.out.print("1-9사이의 양수 입력 : ");
		
		Scanner s = new Scanner(System.in);
		int no = s.nextInt();//정수 하나 입력 받는다.
		
		s.close();//스캐너 종료.
		
		System.out.println();
		
		if(no >= 1 && no <= 9) {//입력받은 값은 1-9사이 양수 값이다.
			
			for(int i = 1; i < 10; ++i) {//입력받은 값이 1-9사이의 값이면 반복문을 수행.
				
				//System.out.println(no + "X" + i + "=" + (no*i));//곱셈 결과 값을 따로 변수에 담지 않고 바로 계산해 출력.
				
				int res = 0;//반복할 때마다 no*i값을 0으로 초기화.
				res = no * i;//i번째의 숫자와 no값을 곱한 값을 res에 대입.
				
				System.out.println(no + " * " + i + " = " + res);
				
			}
			
		}
		else System.out.println("반드시 1-9까지의 양수를 입력해야 합니다.");//입력받은 값이 1-9이외의 값이다.
		
	}
	
	public void testFor04() {
		//1부터 100사이의 정수 중 임의의 난수를 구한 다음, 1~난수까지의 합계를 구한 후 출력한다.
		
		int random = (int)(Math.random()*100)+1;//난수는 Math.random()함수 이용해 구한다.
		//Math.random은 0과 1사이의 실수를 랜덤하게 뽑는 함수이다. 
		//이를 이용해 100을 곱하고, 0부터 시작이므로 1부터 시작하도록 1을 더한 뒤, 정수로 강제 형변환하면 실수부분은 버려지므로, 1~100사이 임의의 정수 값을 구할 수 있다.
		
		int sum = 0;//합계 변수 초기화.
		
		for(int i = 0; i <= random; i++) {//1부터 random까지 반복
			
			sum += i;//sum = sum + i;와 동일.
			//1씩 증가하는 i값을 sum값에 지속해서 합산.
			//즉, sum의 값은 1부터 random까지의 정수 합계.
			
		}
		
		System.out.println("1부터 " + random + "까지의 정수 합 : " + sum);
		
	}

}
