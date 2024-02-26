import java.util.Scanner;

public class SumAndAvg {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int [] arr = {1,2,3,4,5,6,7};
//        Sum_Avg_Arrya(arr);
        Scanner input = new Scanner(System.in);
        System.out.println("please enter the number of elements : ");
        int size = input.nextInt();
        int [] nums = new int[size];
        int i=0;
        while(i<size)
        {
            System.out.println("Please enter element no : "+(i+1) + " : ");
            nums[i] = input.nextInt();
            i++;
        }
        Sum_Avg_Arrya(nums);
    }

    public static void Sum_Avg_Arrya(int[] arr)
    {
        long sum = 0;
        double avg = 0;
        int i=0;
        while(i < arr.length)
        {
            sum = sum + arr[i];
            i++;
        }
        System.out.println("Sum of the given array is : " + sum);
        avg = sum/arr.length;
        System.out.println("avg of given number is : "+avg);

    }
}