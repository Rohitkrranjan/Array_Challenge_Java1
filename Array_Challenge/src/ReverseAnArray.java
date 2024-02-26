import java.util.Scanner;

public class ReverseAnArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter size of an array : ");
        int size = input.nextInt();
        int[] arr = new int[size];
        int i=0;
        while (i<size)
        {
            System.out.print("Please enter element of an array : "+(i+1)+" : ");
            arr[i] = input.nextInt();
            i++;
        }

        ReverseArray(arr,size);
    }
    public static void ReverseArray(int[]arr,int n)
    {
        int s=0;
        int e = n-1;
        int temp;
        while(s < e)
        {
            temp = arr[s];
            arr[s] = arr[e];
            arr[e]=temp;
            s++;
            e--;
        }
        int i=0;
        while(i<n)
        {
            System.out.print(arr[i]+" ");
            i++;
        }

    }
}
