public class ex2
{
	public static void main(String[] args) {
		
		int[] x={10,20,30};
		int[] y={40,50,60};

		System.out.println("x[0]="+x[0]);
		System.out.println("y[0]="+y[0]);
		System.out.println("x="+x);
		System.out.println("y="+y);
		System.out.println("========================");
		//x[0]=y[0];-->value
		x=y;//--->address--->回收
		System.out.println("x[0]="+x[0]);
		System.out.println("y[0]="+y[0]);
		
		y[0]=100;
		System.out.println("========================");
		System.out.println("x[0]="+x[0]);
		System.out.println("y[0]="+y[0]);
		System.out.println("x="+x);
		System.out.println("y="+y);
		x=null;
		System.out.println("x="+x);
		

		/*int x=10;
		int y=20;

		System.out.println("x="+x);
		System.out.println("y="+y);
		System.out.println("========================");
		x=y;
		System.out.println("x="+x);
		System.out.println("y="+y);
		y=30;
		System.out.println("========================");
		System.out.println("x="+x);
		System.out.println("y="+y);*/




	}
}