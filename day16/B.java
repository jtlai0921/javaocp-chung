class B extends student
{
	private int eng;
	B(String name,int eng)
	{
		super(name);
		this.eng=eng;
	}

	void setEng(int eng)
	{
		this.eng=eng;
	}

	int getEng()
	{
		return eng;
	}


	String show()
	{
		return super.show()+"\t英文:"+eng;
	}

	Integer get()
	{
		return getEng();
	}
}