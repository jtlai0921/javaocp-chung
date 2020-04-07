/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class student {
    private String name;
    private int chi;
    private int eng;
    private int sum;
    private double ave;

    public student(String name, int chi, int eng) {
        this.name = name;
        this.chi = chi;
        this.eng = eng;
        
        sum=chi+eng;
        ave=sum/2.;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setChi(int chi) {
        this.chi = chi;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public String getName() {
        return name;
    }

    public int getChi() {
        return chi;
    }

    public int getEng() {
        return eng;
    }

    public int getSum() {
        return sum;
    }

    public double getAve() {
        return ave;
    }
     String ans()
    {
        return "名:"+getName()+
                "\n國文:"+getChi()+
                "\n英文:"+getEng()+
                "\n總分:"+getSum()+
                "\n平均:"+getAve();
    }
   
    
    
}