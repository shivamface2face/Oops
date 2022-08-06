package Pillers;

public class BoxWeight extends Box{
    double w;
    public BoxWeight(){
        this.w=-9;
    }
    public  BoxWeight(double l,double b ,double w){
        super(l,b);
        this.w=w;
    }
}
