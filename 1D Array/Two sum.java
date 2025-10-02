import java.util.Scanner;

class Solution {
    public static int[] twoSum(int[] nums, int target) {
        int size = nums.length;
        for(int i =0; i<size ; i++){
            for(int p=i+1 ; p<size; p++){
                if (nums[i]+nums[p]==target){
                    int arry[] = new int[2];
                    return new int[]{i,p};
                }
            }

        }


        return new int[]{-1, -1};
    }

}
class arrayleetcode1{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        if (size>=2 && size<=10000){
            int nums[] = new int[size];
            for(int i = 0 ;i<size;i++){
                int element = in.nextInt();
                if(element>= Math.pow(-10,9) && element<= Math.pow(10,9) ){
                    nums[i] = element;
                }

            }
            int target = in.nextInt();
            int arr[] = Solution.twoSum(nums,target);
            System.out.print("["+arr[0]+","+arr[1]+"]");
        }

    }
}

