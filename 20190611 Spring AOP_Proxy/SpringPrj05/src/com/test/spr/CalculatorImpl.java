/*=============================================
 	CalculatorImpl.java
 	- 클래스.
 	- Calculator 인터페이스를 구현하는 클래스.
 	- 주 업무, 보조 업무가 함께 처리되는 형태 
 =============================================*/

package com.test.spr;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.StopWatch;

public class CalculatorImpl implements Calculator
{
	// 주 업무(core concern) 진행을 위한 메소드 구현
	
	@Override
	public int add(int x, int y)
	{
		int result = 0;
		// 보조 업무() 실행 내용 
		//-- 시간측정(Around Advice)
		//-- LogFactory : 로그를 생산하는 객체. 
		// 백그라운드에서 리소스 공유가 필요할 때 static 으로 만드는데, getLog 도 static 이다.
		Log log = LogFactory.getLog(this.getClass());
		StopWatch sw = new StopWatch();
		sw.start();
		log.info("처리 시간 측정 시작 --------------------------------");	//-- 로그창에 출력하겠다.
		
		// 주 업무(core concern) 실행 내용 
		result = x + y;
		System.out.printf("%d + %d = %d%n", x, y, result);
		
		sw.stop();
		log.info("처리 시간 측정 종료 --------------------------------");
		log.info(String.format("경과시간 : %s/1000초", sw.getTotalTimeMillis()));
		
		return result;
	}
	
	@Override
	public int sub(int x, int y)
	{
		int result = 0;
		// 보조 업무() 실행 내용 
		//-- 시간측정(Around Advice)
		//-- LogFactory : 로그를 생산하는 객체. 
		// 백그라운드에서 리소스 공유가 필요할 때 static 으로 만드는데, getLog 도 static 이다.
		Log log = LogFactory.getLog(this.getClass());
		StopWatch sw = new StopWatch();
		sw.start();
		log.info("처리 시간 측정 시작 --------------------------------");	//-- 로그창에 출력하겠다.
		
		// 주 업무(core concern) 실행 내용 
		result = x - y;
		System.out.printf("%d - %d = %d%n", x, y, result);
		
		sw.stop();
		log.info("처리 시간 측정 종료 --------------------------------");
		log.info(String.format("경과시간 : %s/1000초", sw.getTotalTimeMillis()));
		
		return result;
	}
	
	public int multi(int x, int y)
	{
		int result = 0;
		// 보조 업무() 실행 내용 
		//-- 시간측정(Around Advice)
		//-- LogFactory : 로그를 생산하는 객체. 
		// 백그라운드에서 리소스 공유가 필요할 때 static 으로 만드는데, getLog 도 static 이다.
		Log log = LogFactory.getLog(this.getClass());
		StopWatch sw = new StopWatch();
		sw.start();
		log.info("처리 시간 측정 시작 --------------------------------");	//-- 로그창에 출력하겠다.
		
		// 주 업무(core concern) 실행 내용 
		result = x * y;
		System.out.printf("%d * %d = %d%n", x, y, result);
		
		sw.stop();
		log.info("처리 시간 측정 종료 --------------------------------");
		log.info(String.format("경과시간 : %s/1000초", sw.getTotalTimeMillis()));
		
		return result;
	}
	
	public int div(int x, int y)
	{
		int result = 0;
		// 보조 업무() 실행 내용 
		//-- 시간측정(Around Advice)
		//-- LogFactory : 로그를 생산하는 객체. 
		// 백그라운드에서 리소스 공유가 필요할 때 static 으로 만드는데, getLog 도 static 이다.
		Log log = LogFactory.getLog(this.getClass());
		StopWatch sw = new StopWatch();
		sw.start();
		log.info("처리 시간 측정 시작 --------------------------------");	//-- 로그창에 출력하겠다.
		
		// 주 업무(core concern) 실행 내용 
		result = x / y;
		System.out.printf("%d / %d = %d%n", x, y, result);
		
		sw.stop();
		log.info("처리 시간 측정 종료 --------------------------------");
		log.info(String.format("경과시간 : %s/1000초", sw.getTotalTimeMillis()));
		
		return result;
	}
}
