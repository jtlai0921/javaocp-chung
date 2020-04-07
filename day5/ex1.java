public class ex1{
	public static void main(String[] args) {
		double x1=12.3;
		double x2=12.3;

		System.out.println(x1==x2);
		System.out.println((byte)x2);

		Double y1=10.;
		Double y2=10.45;
		//Double y1=new Double(10.45);
		//Double y2=new Double(10.45);
		System.out.println(y1);
		System.out.println(y2);
		System.out.println(y1==y2);
		System.out.println(y1.equals(y2));
		System.out.println(y2.byteValue());
		//System.out.println((byte)y2);
	}
}