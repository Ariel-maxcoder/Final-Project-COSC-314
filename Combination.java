import java.util.Scanner;

public class Combination {

    static void ComArr(int arr[], int r, int s, int index, int data[], int e){

        if(index == r)
        {
            for(int i = 0; i<r; i++)
            System.out.println(data[i] + " ");
            System.out.println(" ");
            return;
        }
        // when array is full

        if(e >= s)
            return;
        data[index] = arr[e];

        ComArr(arr,s,r,index+1,data,e+1);
        ComArr(arr, s ,r ,index ,data, e+1);
    }

    static void printCombination(int arr[], int c, int r)
    {
        int data[ ] = new int[r];

        ComArr(arr, r,c,0, data, 0);
    }

    public static void main (String[] args)
    {
        int c;
        int r;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 5 number of elements you want to store: ");
        //reading the number of elements from the that we want to enter
        c=sc.nextInt();
        //creates an array in the memory of length 10
        int[] arr = new int[10];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<c; i++)
        {//reading array elements from the user
            arr[i]=sc.nextInt();

        }

        System.out.print("Limit of combination for list: ");
        r= sc.nextInt();


        System.out.println("Array elements are: ");

            printCombination(arr, c, r);


    }
}
