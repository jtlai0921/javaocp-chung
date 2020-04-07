public class add1{
	public static void main(String[] args) {
		//Money.pv=150000;//呼叫類別(Money類別中所有的pv)
		Money.Title();
		Money.setPv(300000);
		Money m1=new Money(0.01,5);
		Money m2=new Money(0.012,5);
		Money m3=new Money(0.013,5);
		Money m4=new Money(0.014,5);
		Money m5=new Money(0.015,5);

		m1.show(); 
		m2.show();
		m3.show();
		m4.show();
		m5.show();

		System.out.println("===================================");
		m4.setR(0.02);
		Money.Title();
		Money.setPv(200000);
		
		m1.show(); 
		m2.show();
		m3.show();
		m4.show();
		m5.show();
		
	}
}