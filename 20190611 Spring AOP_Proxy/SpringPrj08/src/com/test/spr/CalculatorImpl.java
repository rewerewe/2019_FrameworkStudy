/*=============================================
 	CalculatorImpl.java
 	- Calculator 인터페이스를 구현하는 클래스.
 	- 주 업무 적용 형태 
 =============================================*/

package com.test.spr;

public class CalculatorImpl implements Calculator
{
	// 주 업무(core concern) 진행을 위한 메소드 구현
	
	@Override
	public int add(int x, int y)
	{
		int result = 0;
		
		// 주 업무(core concern) 실행 내용 
		result = x + y;
		System.out.printf("%d + %d = %d%n", x, y, result);
		
		return result;
	}
	
	@Override
	public int sub(int x, int y)
	{
		int result = 0;
		
		// 주 업무(core concern) 실행 내용 
		result = x - y;
		System.out.printf("%d - %d = %d%n", x, y, result);
		
		return result;
	}
	
	public int multi(int x, int y)
	{
		int result = 0;
		
		// 주 업무(core concern) 실행 내용 
		result = x * y;
		System.out.printf("%d * %d = %d%n", x, y, result);
		
		return result;
	}
	
	public int div(int x, int y)
	{
		int result = 0;
		
		// 주 업무(core concern) 실행 내용 
		result = x / y;
		System.out.printf("%d / %d = %d%n", x, y, result);
		
		return result;
	}
}
