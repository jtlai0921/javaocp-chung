public class ex1
{
	public static void main(String[] args) {
		int[] y=new int[]{10,20,30};//==int[] y={10,20,30};

		/*int[][]x=new int[2][];//x[0][]x[1][]
		x[0]=new int[2];
		x[1]=new int[3];*/
		int[][]x=
		{
			{10,20,30},
			{20,30,40},
		};//同int[][]x=newint[][]{{10,20,30},{20,30,40},};


		for(int i=0;i<x.length;i++)
		{
			for (int j=0;j<x[i].length;j++)
			{
				System.out.println("x["+i+"]["+j+"]= "+x[i][j]);
			}
		}
		x[0]=x[1];//傳位址將某個位址的直填入另一個位址
		x[0][0]=x[1][1];//傳直

		for(int[] o:x)
		{
			for(int n:o)
			{
				System.out.println(n);
			}

		}
	
	}
	
}