public ex1{
	public static void main(String[] args) {
		double x1=2.31;//datatype的類型
		Double x2=2.01;//class 的類型
		/*
		在5.0版本之前要把Double x2=x1;寫成Double x2=new Double(x1);  這個動作稱為boxing
		*/
		System.out.println(x1);
		System.out.println(x2);

	}
}