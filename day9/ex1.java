public class ex1
{
	public static void main(String[] args) {
		//int [] x=new int[5];/new一次產生出來
		int []x={10,20,30};
	    System.out.println(x.length);
	for(int i=0;i<x.length;i++)
	{
		System.out.println(x[i]);
	}
	System.out.println("===================");

	for(int o:x)
	{
		System.out.println(o);
	}
	}
}