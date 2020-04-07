
public class Order {
    private int ruler;
    private int pen;
    private int sum;

    public Order(int ruler, int pen) {
       
        this.ruler = ruler;
        this.pen = pen;
        
        sum=ruler*30+pen*29;
        
        if(sum>=2000) sum=(int)(sum*09.5);
    }

    public int getRuler() {
        return ruler;
    }

    public int getPen() {
        return pen;
    }

    public int getSum() {
      
         sum=ruler*30+pen*29;
        
        if(sum>=2000) sum=(int)(sum*09.5);
        return sum;
    }

    public void setRuler(int ruler) {
        this.ruler = ruler;
    }

    public void setPen(int pen) {
        this.pen = pen;
    }

   
    
    String show()
    {
        return "尺:"+getRuler()+
                "\n筆:"+getPen()+
                "\n總價:"+getSum();
    }
    
    
    
}
