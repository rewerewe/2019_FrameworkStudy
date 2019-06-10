package com.test.spr;

public class RecordImp1 implements Record
{
	// 주요 속성 구성
	private int kor, eng, mat;
	private String name;
	private String tel;
	private String addr;

	@Override
	public void setKor(int kor)
	{
		this.kor = kor;
	}

	@Override
	public int getKor()
	{
		return kor;
	}

	@Override
	public void setEng(int eng)
	{
		this.eng = eng;
	}

	@Override
	public int getEng()
	{
		return eng;
	}

	@Override
	public void setMat(int mat)
	{
		this.mat = mat;
	}

	@Override
	public int getMat()
	{
		return mat;
	}

	@Override
	public void setName(String name)
	{
		this.name = name;
	}

	@Override
	public String getName()
	{
		return name;
	}

	@Override
	public void setTel(String tel)
	{
		this.tel = tel;
	}

	@Override
	public String getTel()
	{
		return tel;
	}

	@Override
	public void setAddr(String addr)
	{
		this.addr = addr;
	}

	@Override
	public String getAddr()
	{
		return addr;
	}

	@Override
	public int getTotal()
	{
		int result = 0;
		
		result = this.getKor() + this.getEng() + this.getMat();
		
		return result;
	}

	@Override
	public double getAvg()
	{
		double result = 0;
		
		result = this.getTotal() / 3.0;
		
		return result;
	}

}
