import java.util.Date;
class date
{
	public static void main(String[] args) {
		Date d1=new Date();
		System.out.println(d1);
		System.out.println("年:"+d1.getYear(d1)+1900);
	}
}