abstract class Company
{
	private String name;

	Company(String name)
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

	abstract int get();
	

}