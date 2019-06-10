/*========================================
 	RecordViewImp1.java
 	- 클래스
 	- Record 인터페이스를 구현하는 클래스로 설계 
 ========================================*/

package com.test.spr;

import java.util.Scanner;

public class RecordViewImp1 implements RecordView
{
	// 주요 속성 구성 → 특정 클래스 형태가 아닌.. 인터페이스 타입으로 구성해야 한다.  
	// 지금 record 는 아무것도 없는 상태, main 에서 객체를 생성해서 채워넣어 줄 예정.
	// setter 형태로 record 를 넘겨주겠다는 의미
	private Record record;

	@Override
	public void setRecord(Record record)
	{
		this.record = record;
	}

	@Override
	public void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 영어 수학 점수입력(공백구분) : ");
		String kor = sc.next();
		String eng = sc.next();
		String mat = sc.next();
		
		record.setKor(Integer.parseInt(kor));
		record.setEng(Integer.parseInt(eng));
		record.setMat(Integer.parseInt(mat));
		
		sc.close();
		
	}

	@Override
	public void output()
	{
		System.out.println("국어    영어    수학    총점    평균");
		System.out.printf("%6d %4d %4d %4d %6.1f %n"
				 , record.getKor(),record.getEng(),record.getMat()
				 , record.getTotal(), record.getAvg()
				 );

	}	
	

}
