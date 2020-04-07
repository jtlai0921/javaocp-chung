public class student{
	/*
	String name;
	int chi;
	double eng;
	boolean x;
	float math;
	*/
	String name;
	int chi;
	int eng;
	int sum;
	student(int chi,int eng){
		//this.chi=chi;//this是物件類型(相當於物件本身 )(object)功能是把參數設定為第一行class物件
		//this.eng=eng;
		//c語言和java都有global的特色，設不同參數可以解決但在java中非最好辦法
		chi=60;
		//int chi=60;
		//System.out.println("新年快樂");
	}
	void show(){
		System.out.println("名字:"+name+"\t國文:"+chi+"\t英文:"+eng+"\t總分:"+sum);
	}
	
}