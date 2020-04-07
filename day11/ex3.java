public class ex3
{
	public static void main(String[] args) {
		member[] m=new member[3];//~~m[0]、m[1]、m[2]的名字
		m[0]=new member("a","iii");
		m[1]=new member("b","ppp");
		m[2]=new member("c","lll");
		System.out.println(m);//出現記憶體位置
		System.out.println(m[0]);//出現數值
		for(int i=0;i<m.length;i++)
		{
			m[i].show();
		}
		for(member o:m)
		{
			o.show();
		}
		//m[0].show();

		/*member m=new member("t","iii");
		m.show();*/
	}
}