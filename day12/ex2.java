import java.util.Arrays;
public class ex2
{
	public static void main(String[] args) {
		int[] x={25,88,42,20,96,66};

		for(int o:x)
		{
			System.out.print(o+" ");
		}
		System.out.println("\n===================================");
		Arrays.sort(x);
		for(int o:x)
		{
			System.out.print(o+" ");
		}
		System.out.println("\n"+Arrays.binarySearch(x,42));
		System.out.println("\n"+Arrays.binarySearch(x,70));

		int y=70;
		System.out.println(y>=80? "yes":"no");
	}
}