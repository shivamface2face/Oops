package Pillers.Polymorphism;

public class Number {
    int Sum(int a,int b){
        return a+b;
    }
    int Sum(int a,int b,int c){
       return   a+b+c;
    }

    public static void main(String[] args) {
        Number onj=new Number();
        onj.Sum(1,2,3);
    }

}
