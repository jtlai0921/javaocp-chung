class Order{
	String name;
	int lcd;
	int ram;
	int mouse;
	int sum;
	/*
	這行請就單純定義，不可以做任何的運算式，如任何的迴圈
	*/
	Order(int m,int n){

	}
	Order(int lcd,int ram){
		
	}
	Order(String name,int lcd,int ram,int mouse){
		if(lcd>0 && ram>0 && mouse>0){
			this.name=name;
			this.lcd=lcd;
			this.ram=ram;
			this.mouse=mouse;
			this.sum=this.lcd*4999+this.ram*1280+this.mouse*799;
			/*
			這行可以寫成sum=lcd*4999+ram*1280+mouse*799;
			*/
		}
		else{
			System.out.println("數量請輸入>0");
		}
	}
	Order(int lcd,int ram,int mouse){
		if(lcd>0 && ram>0 && mouse>0){
			this.lcd=lcd;
			this.ram=ram;
			this.mouse=mouse;
			this.sum=this.lcd*4999+this.ram*1280+this.mouse*799;
			/*
			這行可以寫成sum=lcd*4999+ram*1280+mouse*799;
			*/
		}
		else{
			System.out.println("數量請輸入>0");
		}
	}
	Order(){}
	void show(){
		System.out.println("name:"+name+
			"\tlcd:"+lcd+
			"\tram:"+ram+
			"\tmouse:"+mouse+
			"\tsum:"+sum);

	}
}
