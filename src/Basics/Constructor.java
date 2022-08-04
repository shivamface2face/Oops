package Basics;

public class Constructor {
    public static void main(String[] args) {
        Student1 kunal=new Student1();

        System.out.println(kunal.marks);
        System.out.println(kunal.name);
        System.out.println(kunal.roll);



    }
}

class Student1{
    String name;
    int roll;
    float marks;

    Student1(){
        this.name="shivam";
        this.roll=121;
        this.marks=99.0f;
    }

}
