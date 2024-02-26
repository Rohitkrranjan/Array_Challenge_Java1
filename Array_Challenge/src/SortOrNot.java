import java.util.Scanner;

public class SortOrNot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter size of an array : ");
        int size = input.nextInt();
        int [] arr = new int[size];
        int i=0;
        while (i < size)
        {
            System.out.print("Please enter element of an array : " + (i+1)+" : ");
            arr[i] = input.nextInt();
            i++;
        }
        boolean ans = isSortedInDec(arr);
        boolean ans2 = isSortedInInc(arr);

        if(ans || ans2)
            System.out.print("Your Array is sorted : ");
        else
            System.out.print("your Array is not sorted : ");
    }

    public static boolean isSortedInDec(int[] arr)
    {
        int i=1;
        while (i < arr.length)
        {
            if(arr[i] > arr[i-1])
                return false;
            i++;

        }
         return true;
    }

    public static boolean isSortedInInc(int []arr)
    {
        int i=1;
        while (i < arr.length)
        {
            if(arr[i] < arr[i-1])
                return false;
                  i++;
        }
        return true;
    }
}
