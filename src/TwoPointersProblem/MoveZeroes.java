package TwoPointersProblem;


public class MoveZeroes {

    public static void main(String[] args){
        int[] nums = {0,1,0,3,12};
        int[] solution = moveZeros(nums);

        for (int s : solution){
            System.out.print(s);
        }
    }


    public static int[] moveZeros(int[] nums){

        int j = 0;

        for (int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }

        return nums;
    }
}

//    First Try


//    public static int[] moveZeros(int[] nums){
//
//        int j = 0;
//
//        for(int i = 1; i < nums.length; i++){
//            if(nums[j] == 0 && nums[i] != 0){
//                int temp = nums[i];
//                nums[i] = nums[j];
//                nums[j] = temp;
//                j++;
//            }
//            else if(nums[j] != 0){
//                j++;
//            }
//        }
//
//        return nums;
//    }
