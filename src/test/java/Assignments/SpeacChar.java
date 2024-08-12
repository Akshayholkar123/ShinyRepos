package Assignments;

public class SpeacChar {

	public static void main(String[] args) {
        String s = "h&e1$1%o9"; // 

        // Remove non-alphanumeric characters and reverse the remaining alphanumeric characters
        String s1 = s.replaceAll("[^A-Za-z0-9]", ""); // Extract alphanumeric characters
        System.out.println(s1); // he11o9

        int c = s1.length() - 1;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetterOrDigit(s.charAt(i))) {
                System.out.print(s1.charAt(c--)); // Print characters in reverse order
            } else {
                System.out.print(s.charAt(i)); // Print special characters in original order
            }
        }
	}

}
