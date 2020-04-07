class ex3
{
	public static void main(String[] args) {
		/*int[][] c=new int[2][3];
		c[0][0]=10;
		c[0][1]=20;
		c[0][2]=30;

		c[1][0]=40;
		c[1][1]=50;
		c[1][2]=60;*/
		int[][] c=
		{
			{10,20,30},
			{40,50,60},
		};

		

		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<c[i].length;j++)
			{
				System.out.println("c["+i+"]["+j+"]="+c[i][j]);
			}
		}


		//System.out.println("================================");

		for(int[] o:c)
		{
			for(int n:o)
			{
				System.out.println(n);
			}
		}

	}
}