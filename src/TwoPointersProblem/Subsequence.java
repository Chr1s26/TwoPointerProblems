package TwoPointersProblem;

public class Subsequence {

    public static void main(String[] args){
        System.out.println(isSubsequence("a","b"));
    }
    public static boolean isSubsequence(String s, String t) {
        int i = 0;
        int j = 0;

        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }

        return i == s.length();
    }

}

//    public static boolean isSubsequence(String s,String t){
//        int j = 0;
//        if(!s.isEmpty()) {
//            for (int i = 0; i < t.length(); i++) {
//                if (t.charAt(i) == s.charAt(j)) {
//                    if (j+1 == s.length()) {
//                        j++;
//                        break;
//                    }
//                    j++;
//                }
//            }
//        }
//        return j == s.length();
//    }