package ArrayProg;

public class Palindromesubstr {

	public static void main(String[] args) {
		String s = "nitin";

		for (int i = 0; i < s.length(); i++) {//01234
			for (int j = i+1 ; j <=s.length(); j++) {//12345
				String s1 = s.substring(i, j);
				if (s1.length() >= 3 && isPalindrome(s1)) {
					System.out.println(s1 + " ");
				}
			}
		}
	}

	static boolean isPalindrome(String str) {
		String rev = "";
		for (int i = 0; i < str.length(); i++) {
			rev = str.charAt(i) + rev;
		}
		if (str.equals(rev)) {
			return true;
		}

		return false;
	}
}
