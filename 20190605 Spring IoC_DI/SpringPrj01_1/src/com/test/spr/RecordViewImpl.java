package com.test.spr;

import java.util.Scanner;

public class RecordViewImpl implements RecordView
{

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
		
		System.out.print("국어 영어 수학 이름 전화번호 주소(공백구분) : ");
		String kor = sc.next();
		String eng = sc.next();
		String mat = sc.next();
		String name = sc.next();
		String tel = sc.next();
		String addr = sc.next();
		
		record.setKor(Integer.parseInt(kor));
		record.setEng(Integer.parseInt(eng));
		record.setMat(Integer.parseInt(mat));
		record.setName(name);
		record.setTel(tel);
		record.setAddr(addr);
		
		sc.close();
		
	}

	@Override
	public void ouput()
	{
		System.out.print("국어 영어 수학 이름 전화번호 주소");
		System.out.printf("%4d %4d %4d %4s %4s %4s %4d %4.1f"
				, record.getKor(), record.getEng(), record.getMat()
				, record.getName(), record.getTel(), record.getAddr()
				, record.getTotal(), record.getAvg() 
				);
	}


}
