
import java.util.Date;


public class dateEx {

    
    public static void main(String[] args) {
        Date d1=new Date();
	System.out.println(d1);
	System.out.println("年:"+(d1.getYear()+1900));
        System.out.println("月:"+(d1.getMonth()+1));
        System.out.println("星期:"+d1.getDay());
        System.out.println("日:"+d1.getDate());
    }
    
}
