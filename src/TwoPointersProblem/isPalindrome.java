package TwoPointersProblem;

public class isPalindrome {

    public static void main(String[] args){
        System.out.println(isPalindrome("0P"));
    }

    public static boolean isPalindrome(String s){
        s = s.toLowerCase();
        s = s.trim();
        s = s.replaceAll("\\s+", "");
        s = s.replaceAll("[^a-z0-9]", "");
        int left = 0;
        int right = s.length()-1;


        while(left < right){
            char a = s.charAt(left);
            char b = s.charAt(right);
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }else{
                left++;
                right--;
            }
        }
        return true;
    }

    public boolean isPalindrome1(String s) {
        if (s.isEmpty()) {
            return true;
        }
        int start = 0;
        int last = s.length() - 1;
        while(start <= last) {
            char currFirst = s.charAt(start);
            char currLast = s.charAt(last);
            if (!Character.isLetterOrDigit(currFirst )) {
                start++;
            } else if(!Character.isLetterOrDigit(currLast)) {
                last--;
            } else {
                if (Character.toLowerCase(currFirst) != Character.toLowerCase(currLast)) {
                    return false;
                }
                start++;
                last--;
            }
        }
        return true;
    }
}
