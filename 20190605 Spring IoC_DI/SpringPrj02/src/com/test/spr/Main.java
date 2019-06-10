/*========================================
 	Main.java
 	- main() 메소드가 포함된 테스트 클래스 
 ========================================*/

/*
 	※ 이와 같이 처리했을 때 가장 큰 장점은
 	   자바 소스코드 변경없이 객체 생성 및 DI(의존성 주입) 설정을 
 	   변경할 수 있다는 점이다. 
 */


package com.test.spr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main
{
	public static void main(String[] args)
	{
		/* [스프링이 처리하고 관리하게 될 영역]
		//---------------------------------------------------------------------------
				
		// ① RecordImp1(Record) 객체 생성 과정 
		Record rec1 = new RecordImp1();
		//-- 주입할 객체(인스턴스)를 생성한 것. 	dependency(의존 객체)  
		
		// ② RecordImp2(Record) 객체 생성 과정 
		// Record rec2 = new RecordImp2();		//-- dependency(의존 객체)
		
		// RecordViewImpl(RecordView) 객체 생성 과정
		//-- Record 객체(의존 객체 - RecordImp1 / RecordImp2) 필요 
		RecordView view = new RecordViewImp1();
		
		// 의존 객체 주입
		//--  의존 객체 주입 방법을 사용하게 되면 
		//    느슨한 결합(인터페이스로 속성을 구성한 것 자체.)을 구성할 수 있게 되고, 
		//    한 쪽의 변동 사항이 다른 쪽에 영향을 덜 줄 수 있게 된다. 
		view.setRecord(rec1);					//-- setter injection
												//   (setter 를 통한 주입) 
		
		//-------------------------------------------------------------------------- */
		
		// ※ 스프링 프레임워크에서는
		//    객체 생성 과정 및 DI(의존객체 주입)에 대한 설정은
		//    스프링 환경 설정 파일로 대체된다. (→ applicationContext.xml)
		
		// 스프링 프레임워크에서 『applicationContext.xml』 파일을 읽어서 
		// 생성 및 관리할 객체에 대한 정보를 얻어야 한다.
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		//-- 필요하면 인터페이스 라던지, 클래스 라던지 주입해서 사용하렴.
		
		// 『getBean()』메소드를 이용하여 사용자가 원하는 객체를 얻는다. 
		// 메소드 인자값으로 id 속성값을 지정하게 된다. 
		
		// RecordView view = (RecordViewImp1)context.getBean("view");
				// 스프링 3.0 이후 버전에서 사용 가능한 코드
		// (RecordView) 로 형변환 안해주려고. RecordViewImpl.class 타입으로 변환됨. 
		RecordView view = context.getBean("view", RecordViewImp1.class);
		
		view.input();
		
		view.output();
		
	}
}
