import java.util.Scanner;

public class NoOfOcc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter no of elements : ");
        int size = input.nextInt();
        int [] arr = new int[size];
        int i=0;
        while(i < size)
        {
            System.out.print("Please enter element of an array : "+ (i+1) + " : ");
            arr[i] = input.nextInt();
            i++;
        }

        System.out.print("Please enter a number you want : ");
        int num = input.nextInt();

        int ans = FindOcc(arr,num);
        System.out.print("Number of occ is "+ ans + " times");
    }

    public static int FindOcc(int[] arr , int num)
    {
        int occ = 0;
        int  i=0;
        while(i < arr.length)
        {
            if(arr[i] == num)
                occ++;
            i++;
        }
        return occ;
    }
}
