public class ex1
{
	public static void main(String[] args) {
		int[] x=new int[3];
		x[0]=10;
		x[1]=20;
		x[2]=30;
		System.out.println(x);
		
		x=new int[10];
		System.out.println(x);
		x[3]=10;
		System.out.println(x[3]);

		for(int o:x)
		{
			System.out.println(o);
		}
	}
}