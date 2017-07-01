package player_Set2;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner in=new Scanner (System.in);
		System.out.println("Enter the String :");
		String s=in.nextLine();
		StringBuffer str=new StringBuffer(s);
		str=str.reverse();
		s=str.toString();
		System.out.println("Reversed String :"+s);
		in.close();

	}

}
