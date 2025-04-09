package TwoPointersProblem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class ThreeSum {

    public static void main(String[] args){
        int[] nums = {-1,0,1,2,-1,-4};
        List<List<Integer>> answer = threeSum(nums);

        for (List<Integer> innerList : answer) {
            for (Integer num : innerList) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

    }

    public static List<List<Integer>> threeSum(int[] nums) {
        int current = 0;
        int left = current+1;
        int right = nums.length-1;
        HashSet<List<Integer>> temp = new HashSet<>();

        Arrays.sort(nums);

        while(current < nums.length-2){
            if(nums[current]+nums[left]+nums[right] == 0 && left < right){
                List<Integer> insideList = new ArrayList<>();
                insideList.add(nums[current]);
                insideList.add(nums[left]);
                insideList.add(nums[right]);
                temp.add(insideList);
                left++;
                right--;
            }else if(nums[current]+nums[left]+nums[right] > 0 && left < right){
                right--;
            }else if(nums[current]+nums[left]+nums[right] < 0 && left < right){
                left++;
            }else{
                current++;
                left = current+1;
                right = nums.length-1;
            }
        }

        return new ArrayList<>(temp);
    }
}
