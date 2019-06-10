/*===================
 	RecordView.java
 	- 인터페이스
 ===================*/
package com.test.spr;

public interface RecordView
{
	// 입·출력 받는 액션을 받는 역할
	
	// setter() 메소드 선언 
	//     : interface 메소드를 정의할 수 없다.
	/*
	 	▶클래스 설계가 모두 정리되어야 인터페이스를 정의(구체화)할 수 있게 되니, 헷갈리는게 당연합니다..
	
	 	김정규 : 클래스 설계
     	남자 1명 : (추상화) 인터페이스 설계
    */ 
	public void setRecord(Record record);
	
	// 입력 액션 전용 메소드 선언 
	public void input();
	
	// 출력 액션 전용 메소드 선언
	public void output();
	
}
