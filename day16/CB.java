class CB extends Company
{
	private int ram;

	CB(String name,int ram)
	{
		super(name);
		this.ram=ram;
	}


	void setRam(int ram)
	{
		this.ram=ram;
	}

	int getRam()
	{
		return ram;
	}
}