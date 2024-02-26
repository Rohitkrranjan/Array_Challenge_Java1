import java.util.Scanner;

public class MaxAndMin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter size of an array : ");
        int size = input.nextInt();
        int [] arr = new int[size];
        int i=0;
        while(i < size)
        {
            System.out.print("Please enter value : " + (i+1) + " : ");
            arr[i] = input.nextInt();
            i++;
        }
       int max = Max(arr);
        int min = Min(arr);
        System.out.println("max = " + max);
        System.out.println("min = " + min);
    }
    public static int Max(int[] arr)
    {
        if(arr.length == 0)
            return Integer.MIN_VALUE;
        int max = arr[0];
        int i=1;
        while(i < arr.length)
        {
            if(max < arr[i])
                max = arr[i];
            i++;
        }
        return max;
    }

    public static int Min(int[] arr)
    {
        int min = Integer.MAX_VALUE;

        int i=0;
        while(i < arr.length)
        {
            if(min > arr[i])
                min = arr[i];
            i++;
        }
        return min ;
    }
}
