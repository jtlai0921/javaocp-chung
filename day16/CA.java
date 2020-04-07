class CA extends Company
{
	private int lcd;

	CA(String name,int lcd)
	{
		super(name);
		this.lcd=lcd;
	}


	void setLcd(int lcd)
	{
		this.lcd=lcd;
	}

	int getInt()
	{
		return lcd;
	}


	 int get()
	{
		return getInt();
	}
}