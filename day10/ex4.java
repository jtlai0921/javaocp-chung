public class ex4
{
	public static void main(String[] args) {
		int [][][] x=new int[2][3][2];
		System.out.println(x);
		System.out.println(x[0]);
		System.out.println(x[0][0]);
		System.out.println(x[0][0][0]);
		for(int i=0;i<x.length;i++)
		{
			for (int j=0;j<x[i].length;j++)
			{
				for(int k=0;k<x[i][j].length;k++)
				{
					System.out.println("x["+i+"]["+j+"]["+k+"]="+x[i][j][k]);
				}
			}
		}

		for (int[][] o:x)
		{
			System.out.println(o);
			for (int[] n:o)
			{
				System.out.println(n);
				for(int p:n)
				{
					System.out.println(p);
				}
				System.out.println("\n");
			}
		}
	}
}