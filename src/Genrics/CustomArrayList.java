package Genrics;

import java.util.ArrayList;

public class CustomArrayList {

    private int data[];
    private  static int Default_size=10;
    private int size=0;

    public CustomArrayList(){
        this.data=new int[Default_size];
    }

    public int get(int index){
        return data[index];
    }
    public int size(){
        return size;
    }
    public int remove(){
        int remove=data[--size];
        return remove;
    }

    public void add(int num){
        if(isFull()){
            resize();
        }
        data[size++]=num;
    }

    private  boolean isFull(){
        return size== data.length;
    }

    private  void resize(){
        int[] temp=new int[data.length*2];

        for (int i = 0; i < data.length ; i++) {
            temp[i]=data[i];
        }
        data=temp;
    }


    public static void main(String[] args) {
        ArrayList al=new ArrayList();
//        al.add(34);
//        al.add(23);
//        al.remove(23);

        CustomArrayList list=new CustomArrayList();
        list.add(12);
        list.add(34);
        list.remove();
        System.out.println(list.size());
//        list.size();

    }
}
