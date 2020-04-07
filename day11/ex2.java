public class ex2
{
	public static void main(String[] args) {
		int[][][]x=new int[2][][];
		x[0]=new int [2][];
		x[0][0]=new int [2];//new後面皆有幾個數字的陣列
		x[0][1]=new int [3];//new後面皆有幾個數字的陣列

		x[1]=new int[3][2];
		int v=10;
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<x[i].length;j++)
			{
				for(int k=0;k<x[i][j].length;k++)
				{
					x[i][j][k]=v;
					v=v+10;
					System.out.println("x["+i+"]["+j+"]["+k+"]="+x[i][j][k]);
				}
			}
		}

		for(int[][] o:x)
		{
			for(int[] n:o)
			{
				for(int t:n)
				{
					System.out.println(t);
				}
			}
		}
	}
}