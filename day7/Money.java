class Money
{
	private static int pv;
	private double r;
	private int n;
	private int fv;

	Money(double r,int n)
	{
		this.r=r;
		this.n=n;

		fv=(int)(pv*(1+r*n));
	}

	static void Title()
	{
		System.out.println("本金\t利率\t期數\t單利本利和");
	}
	static void setPv(int pv)
	{
		Money.pv=pv;//不可以是this.pv=pv;因為this 屬於物件類，但static屬於類別類，需要用class呼叫

	}

	/*static*/void setR(double r){
		if(r>0){
			this.r=r;
		}
	}
	void show()
	{
		fv=(int)(pv*(1+r*n));
		System.out.println(pv+"\t"+r+"\t"+n+"\t"+fv);
	}
}