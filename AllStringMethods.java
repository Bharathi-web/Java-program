package JavaTask;

public class AllStringMethods {

	public static void main(String[] args) {
		String s="Hello I am Bharathi";
		
		//find lenght
		System.out.println(s.length());
		
		//To convert the string into UpperCase
		System.out.println(s.toUpperCase());
		
		//To convert the string into LowerCase
		System.out.println(s.toLowerCase());
		
		//To find the Index of the Bharathi
		System.out.println(s.indexOf("B"));  //it print -1 if their is no such string present in the text or user provide string in different case
		
		//Concat two string
		String s1="Bharathi";
		String s2="Mohanaperumal";
		System.out.println(s1.concat(s2)); //Using concat()
		System.out.println(s1+" "+s2);     //Using + operator
		
		//To avoid empty space
		String s3=" Hello World ";
		System.out.println(s3.length());
		s3=s3.trim();
		System.out.println(s3.length());
		
		//return the Character at specific index
		System.out.println(s.charAt(0));
		
		//To replace e into o in s3
		System.out.println(s3.replace("e", "o"));
		System.out.println(s.replaceAll("a", "o"));
		
		// Check if a string contains another string
        System.out.println("Contains 'Bharathi': " + s.contains("Bharathi"));

        // Check if a string starts with a specific substring
        System.out.println("Starts with 'Hello': " + s.startsWith("Hello"));

        // Check if a string ends with a specific substring
        System.out.println("Ends with 'Bharathi': " + s.endsWith("Bharathi"));

        // Check if a string is empty
        System.out.println("Is empty: " + s.isEmpty());

        // Check if a string is equal to another string (case-sensitive)
        String s4 = "Hello I am Bharathi";
        System.out.println("Is equal (case-sensitive): " + s.equals(s4));

        // Check if a string equals another string, ignoring case
        String s5 = "hello i am bharathi";
        System.out.println("Is equal (ignore case): " + s.equalsIgnoreCase(s5));

        // Split a string into an array of substrings
        String[] words = s.split(" ");
        System.out.println("Words after split:");
        for (String word : words) {
            System.out.println(word);
        }

        // Substring of a string from a specific index
        System.out.println("Substring from index 6: " + s.substring(6));

        // Substring of a string between specific indices
        System.out.println("Substring from index 6 to 14: " + s.substring(6, 14));

        // Replace first occurrence of a substring
        System.out.println("Replace first occurrence of 'a' with 'o': " + s.replaceFirst("a", "o"));

        // Check if the string is a number (only digits)
        String s6 = "12345";
        System.out.println("Is numeric (only digits): " + s6.matches("[0-9]+"));

        // String to character array
        char[] chars = s.toCharArray();
        System.out.println("String as char array:");
        for (char c : chars) {
            System.out.println(c);
        }

        // String to byte array
        byte[] byteArray = s.getBytes();
        System.out.println("String as byte array:");
        for (byte b : byteArray) {
            System.out.println(b);
        }

        // Check if a string contains only whitespace
        String s7 = "   ";
        System.out.println("Is only whitespace: " + s7.trim().isEmpty());

        // Repeat the string N times
        System.out.println("Repeat 'Hi' 3 times: " + "Hi".repeat(3));
	

	}

}
