package Abstract;

public class Son extends Parents{
    @Override
    void carrer(String name) {
        System.out.println("i am going to be "+ " "+name);
    }

    @Override
    void patner(String name,int age) {
        System.out.println("i love"+" "+name+" she is "+age);
    }
}
