package Hexware;
import java.util.*;
public class main {

    static int sort(int arr[][])
    {

        for (int i = 0; i < arr.length; i++)
            Arrays.sort(arr[i]);


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }

        return 0;
    }


    public static void main(String[] args) {

        int arr[][] = { { 7,9,2,4 },
                {  3,2,5,4},
                { 9,7,8,1} };
        sort(arr);

    }
}
