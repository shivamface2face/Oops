package Basics;

public class Wrapper {
    public static void main(String[] args) {
        Integer a=90;
        Integer b=80;

        Integer num=45;

        swap(a,b);
        System.out.println(a+" "+ b);

//        final  int bonus=78;
//        bonus=0;

        A kunal=new A("shivam");
        kunal.name="other name";

    }

    static void  swap(Integer a, Integer b){
        Integer temp=a;
        a=b;
        b=temp;
    }

}


class A{
    final int num=9;
    String name;
    public A(String name){
        this.name=name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("object is distroyrd");
    }
}
