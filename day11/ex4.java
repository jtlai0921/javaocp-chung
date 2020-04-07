public class ex4
{
	public static void main(String[] args) {
		member[][][] m=new member[2][][];
		m[0]=new member[2][];
		m[0][0]=new member[2];
		m[0][1]=new member[3];
		m[1]=new member[3][];
		m[1][0]=new member[2];
		m[1][1]=new member[3];
		m[1][2]=new member[4];

		m[0][0][0]=new member("a1","ooo");
		m[0][0][1]=new member("a2","ppp");

		m[0][1][0]=new member("b1","lll");
		m[0][1][1]=new member("b2","kkk");
		m[0][1][2]=new member("b3","iii");

		m[1][0][0]=new member("c1","jjj");
		m[1][0][1]=new member("c2","nnn");

		m[1][1][0]=new member("d1","mmm");
		m[1][1][1]=new member("d2","bbb");
		m[1][1][2]=new member("d3","vvv");

		m[1][2][0]=new member("e1","ccc");
		m[1][2][1]=new member("e2","xxx");
		m[1][2][2]=new member("e3","ddd");
		m[1][2][3]=new member("e4","www");

		for(int i=0;i<m.length;i++)
		{
			for(int j=0;j<m[i].length;j++)
			{
				for(int k=0;k<m[i][j].length;k++)
				{
					m[i][j][k].show();
				}
			}
		}

		for(member[][] o:m)
		{
			for(member[] n:o)
			{
				for(member t:n)
				{
					t.show();
				}
			}
		}

	}
}