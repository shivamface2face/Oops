package Hexware;
import  java.util.*;
public class Rainy {
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
        int m, n;
        Scanner sc=new Scanner(System.in);
        m = sc.nextInt();
        n = sc.nextInt();
        int arr[][] = new int[m][n];
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        sort(arr);
    }

}
