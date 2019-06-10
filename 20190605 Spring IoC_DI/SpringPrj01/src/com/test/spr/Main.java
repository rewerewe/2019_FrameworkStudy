/*========================================
 	Main.java
 	- main() 메소드가 포함된 테스트 클래스 
 ========================================*/

package com.test.spr;

public class Main
{
	public static void main(String[] args)
	{
		// [스프링이 처리하고 관리하게 될 영역]
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
		
		//-------------------------------------------------------------------------- 
		
		view.input();
		
		view.output();
		
	}
}
