package Practice;

public class PalindromeSubstrings {

    public static void main(String[] args) {
        String s = "nitin";
        
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String s1 = s.substring(i, j);
                if (s1.length() >=3 && isPalindrome(s1)) 
                    System.out.println(s1 + " ");
                }
            }
        }
    

    public static boolean isPalindrome(String str) {
        String rev = "";
        for (int i=0;i<str.length();i++) {
            rev = str.charAt(i)+rev;
        }
        if(str.equals(rev)) {
        	return true;
        }
        
        return false;
    }
}


