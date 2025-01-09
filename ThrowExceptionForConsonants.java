package JavaTask;

import java.util.Scanner;

public class ThrowExceptionForConsonants {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        try {
            boolean containsVowel = false;
            for (int i = 0; i < input.length(); i++) {
                char ch = Character.toLowerCase(input.charAt(i));
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    containsVowel = true;
                    break;  
                }
            }
            if (!containsVowel) {
                throw new RuntimeException("The string doesn't contain any vowels.");
            }

            System.out.println("The string contains vowels.");
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

	}

}
