/*========================================
 	CalculatorProxy.java
 	- 프록시 클래스.
 	- 보조 업무 적용 및 주 업무 호출 과정.
 ========================================*/

package com.test.spr;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.StopWatch;

// ※ Proxy 클래스는 만드는 방법 중 비교적 쉽고 직관적인 방법은
//    InvocationHandler 인터페이스를 구현하는 클래스를 만드는 것이다. 

public class CalculatorProxy implements InvocationHandler
{
	private Object target;
	
	// 생성자 정의 
	public CalculatorProxy(Object target)
	{
		this.target = target;
	}

	// 보조 업무 적용 및 업무 호출 과정 추가 
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable
	{
		// 보조 업무() 실행 내용 
		//-- 시간측정(Around Advice)
		Log log = LogFactory.getLog(this.getClass());
		StopWatch sw = new StopWatch();
		sw.start();
		log.info("처리 시간 측정 시작 --------------------------------");	//-- 로그창에 출력하겠다.
		
		// 주 업무(core concern) 실행 내용
		//-- 따라해야할 대상은 target (= 윤비) 을 지정해주는 것. 
		Object result = method.invoke(target, args);
		
		sw.stop();
		log.info("처리 시간 측정 종료 --------------------------------");
		log.info(String.format("경과시간 : %s/1000초", sw.getTotalTimeMillis()));
		
		return result;
	}
	
	
}
