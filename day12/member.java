class member
{
	private String name;
	private String address;

	member(String name,String address)
	{
		this.name=name;
		this.address=address;
	}
	void show()
	{
		System.out.println("姓名："+name+"\t地址："+address);
	}
}