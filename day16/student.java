/*final*/ class student
{
	private String name;

	student(String name)
	{
		this.name=name;
	}

	void setName(String name)
	{
		this.name=name;
	}

	String getName()
	{
		return name;
	}

	/*final*/ String show()
	{
		return "名:"+name;
	}

	
	Integer get()
	{
		return 0;
	}

	/*int getChi()
	{
		return 0;
	}

	int getEng()
	{
		return 0;
	}*/
}