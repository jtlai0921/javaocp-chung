public class student{
	private String name;
	private int chi;
	private int eng;
	private int sum;
	private double ave;

	student(String name,int chi,int eng){
		this.name=name;
		this.chi=chi;
		this.eng=eng;
		sum=chi+eng;
		ave=sum/2.0;
	}
	student(){
	 	System.out.println("student");
	}
	/*String getName(){
		return name;
	}
	void setName(){
		this.name=name;
	}*/
	/*void change(int chi,int eng){
		this.chi=chi;
		this.eng=eng;
		sum=chi+eng;		
	}
	void change(int chi){

	}
	void change(String name,int chi){

	}
	/*String change(String name,int chi){
		return "student";
	}*/
	int change2(int chi,int eng){
		this.chi=chi;
		this.eng=eng;
		sum=chi+eng;
		return sum;//return相當於"=" 但是其形態需符合一開始的宣告(int)，一開始一定要宣告此類型以供回傳
		//return (int)10.25 亦可以過，只是轉類型
	}
	void show(){
		System.out.println("名字:"+name+
			"\t國文成績:"+chi+
			"\t英文成績:"+eng+
			"\t總分:"+sum+
			"\t平均:"+ave);
	}
}