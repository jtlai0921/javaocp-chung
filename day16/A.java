class A extends student
{
	private int chi;

	final double pi=3.14;

	A(String name,int chi)
	{
		super(name);
		this.chi=chi;

		//pi=56.5;
	}

	void setChi(int chi)
	{
		this.chi=chi;
	}

	int getChi()
	{
		return chi;
	}


	String show()
	{
		return super.show()+"\t國文:"+chi;
	}

	Integer get()
	{
		return getChi();
	}
void skill()
	{
		System.out.println("A skill");
	}

}