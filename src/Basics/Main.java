package Basics;

public class Main {




    public static void main(String[] args) {


        Student[] student=new Student[5];
        Student kunal=new Student();
        kunal.name="shivam";
        kunal.roll=115;
        kunal.marks=90.9f;
        System.out.println(kunal.marks);

    }
}

class Student{
    String name;
    int roll;
    float marks;
}