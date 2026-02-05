import java.util.Scanner;

public class SecondLargest{

    public int secondLargest(int [] nums){
        int max = nums[0];
        int smax = Integer.MIN_VALUE;

        for(int i = 0; i < nums.length; i ++){
            if(max < nums[i]){
                smax = max;
                max = nums[i];
            }
            else if(nums[i] < max && nums[i] > smax){
                smax = nums[i];
            }
        }
        return smax;
    }
    public static void main(String [] args) {
        int ans, n;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        n = sc.nextInt();

        int [] nums = new int[n];

        for(int i = 0; i < n; i++){
            System.out.println("Your " + (i + 1) + " element: ");
            nums[i] = sc.nextInt();
        }

        SecondLargest obj = new SecondLargest();

        ans = obj.secondLargest(nums);
        System.out.println("The second leargest: "+ans);
        sc.close();

        return;
    }
}