package Abstract;

public abstract class Parents {
    int age;

    public  Parents(int age){
        this.age=age;
    }
    abstract void carrer(String name);
    abstract void patner(String name,int age);
}
