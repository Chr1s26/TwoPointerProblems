package TwoPointersProblem;

import java.util.Arrays;

public class MaxNumOfKSumPair {

    public static void main(String[] args){
        int[] array = {3,1,3,4,3};
        int k = 6;
        System.out.println(maxOperations(array,k));
//        System.out.println(maxOperations1(array,k));
        System.out.println(maxOperations2(array,k));
    }

    public static int maxOperations2(int[] nums,int k){
        Arrays.sort(nums);
        int count = 0;
        int left = 0;
        int right = nums.length-1;

        while(left < right){
            if(nums[left]+nums[right] == k){
                count++;
                left++;
                right--;
            }else if(nums[left]+nums[right] > k){
                right--;
            }else{
                left++;
            }
        }
        return count;
    }

    public static int maxOperations1(int[] nums,int k){
        boolean[] visited = new boolean[nums.length];
        Arrays.sort(nums);
        int count = 0;
        int i = 0;
        int j = 1;

        while(i < nums.length-1){
            if(nums[i]+nums[j] == k && !visited[i] && !visited[j]){
                count++;
                visited[i] = true;
                visited[j] = true;
                i++;
                j = i + 1;
            }else if(visited[i]){
                i++;
                j = i + 1;
            } else if((nums[i]+nums[j] <= k && j < nums.length-1)){
                j++;
            }else{
                i++;
                j = i + 1;
            }
        }
        return count;
    }


    public static int maxOperations(int[] nums,int k){
        int count = 0;
        int b = 0;

        for(int i = 0; i < nums.length-b; i++){
            int j = nums.length-1-b;
            while(j > i ){
                if(nums[i] + nums[j] == k){
                    count++;
                    int temp = nums[nums.length-b-1];
                    nums[nums.length-b-1] = nums[j];
                    nums[j] = temp;
                    b++;
                    break;
                }
                j--;
            }
        }
        return count;
    }
}
