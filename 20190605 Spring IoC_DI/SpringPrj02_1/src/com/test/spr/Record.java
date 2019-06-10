package com.test.spr;

public interface Record
{
	public void setKor(int kor);
	public int getKor();
	
	public void setEng(int eng);
	public int getEng();
	
	public void setMat(int mat);
	public int getMat();
	
	public void setName(String name);
	public String getName();
	
	public void setTel(String tel);
	public String getTel();
	
	public void setAddr(String addr);
	public String getAddr();
	
	public int getTotal();
	
	public double getAvg();
	
}
