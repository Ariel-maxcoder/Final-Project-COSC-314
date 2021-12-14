package com.java2novice.junit.samples;
import java.util.Scanner;

public class Combination {


    public static double ComArr(int[] arr, int[] data, int n, int e, int num, int r)
    {

        if(num == r)
        {
            for(int j = 0; j < r; j++)
                System.out.print(data[j]+" ");
            System.out.println();
            return 0;
        }

        //replaces num with all possible combination numbers. "e - i + 1 >= r - num
        //making sure one number at num will make a combination with remaining numbers
        //at remaining slots
        for(int i = n; i <= e && e - i + 1 >= r - num; i++)
        {
            data[num] = arr[i];
            ComArr(arr, data, i+1, e, num+1, r);
        }
        return num;
    }


    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        //length of array
        System.out.print("Enter the size of your list: ");
        int n = sc.nextInt();
        // gets all the combination
        System.out.print("Enter " + n + " numbers: ");
        int arr[] = new int [n];

        //captures the numbers enters to store in array
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        //captures size of combinations
        System.out.print("Pick a limit of combinations: ");
        int r = sc.nextInt();

        //temporary array to store all combinations
        int data [] = new int[r];
        System.out.println("Combinations");

        //print all combination using temporary array
        ComArr(arr,data,0,n-1,0,r);
    }
}
