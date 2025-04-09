package TwoPointersProblem;

public class ContainerWithMostWater {

    public static void main(String[] args){
        int[] height = {8,7,2,1};
        System.out.println(maxArea(height));
        System.out.println(maxAreaWater(height));
    }

// second try
    public static int maxAreaWater(int[] height){
        int i = 0;
        int j = height.length-1;
        int max = 0;
        int answer = 0;

        while(j > i){

            if(height[i] < height[j]){
                answer = (j - i) * height[i];
                i++;
            }else{
                answer = (j - i) * height[j];
                j--;
            }

            if(answer > max){
                max = answer;
            }

        }
        return max;
    }


    //first try but time exceeded cause two for loop
    public static int maxArea(int[] height){
        int max = 0;
        for(int i = 0; i < height.length-1;i++){
            for (int j = i+1; j < height.length;j++){
                if(height[i] < height[j]){
                    if(height[i] * (j-i) > max){
                        max = height[i] * (j-i);
                    }
                }else{
                    if(height[j] * (j-i) > max){
                        max = height[j] * (j-i);
                    }
                }
            }
        }
        return max;
    }

}
