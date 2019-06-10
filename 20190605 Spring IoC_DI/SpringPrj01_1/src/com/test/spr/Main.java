package com.test.spr;

public class Main
{
	public static void main(String[] args)
	{
		Record rec1 = new RecordImp1();
		
		RecordView view = new RecordViewImpl();
		
		view.setRecord(rec1);
		
		view.input();
		view.ouput();

	}
	
	
	
	
}
