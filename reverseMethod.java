package reverseQuiz;

import java.util.Scanner;

public class reverseMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str;
		String str2;
		System.out.println("Enter a string: ");
		Scanner scan = new Scanner(System.in);
		
		 str = scan.nextLine();
		scan.close();
		
		String reversed = reverseString(str);
		
		System.out.println("Reverse of a String is :" +reversed);
	
		
	}
	
	public static String reverseString(String s) {
		Scanner scanner = new Scanner(System.in);
		
		if (s.isEmpty())
			return s;
		return reverseString(s.substring(1))+ s.charAt(0);
		
		
		
		
	}
	
	
	}
