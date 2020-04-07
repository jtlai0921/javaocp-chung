class add1
{
	public static void main(String[] args) {
		
		/*student[] s=new student[2];
		s[0]=new A("a",78);
		s[1]=new B("b",77);*/

		student[] s=
		{
				new A("abc",78),
				new B("abc",78),
		};

		for(student o:s)
		{
			System.out.println(o.show());
		}


		System.out.println(s[0].getClass());


		Double x1=10.2;
		Double y1=10.2;

		System.out.println(x1==y1);
		System.out.println(x1.equals(y1));

		System.out.println("======================");

		//String x2="abc";
		//String y2="abc";

		String x2=new String("abc");
		String y2=new String("abc");
		System.out.println(x2==y2);
		System.out.println(x2.equals(y2));

		System.out.println("======================");

		System.out.println(s[0]==s[1]);
		System.out.println(s[0].getName()==s[1].getName());
		System.out.println(s[0].equals(s[1]));
		System.out.println(s[0].getName().equals(s[1].getName()));
		System.out.println(s[0].get()==s[1].get());
		System.out.println(s[0].get().equals(s[1].get()));
		System.out.println("======================");


	}
}