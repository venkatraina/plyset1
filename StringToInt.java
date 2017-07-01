package player_Set2;

import java.util.Scanner;

public class StringToInt {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the String :");
		String s=in.next();
		int n=Integer.parseInt(s);
		System.out.println(n);
		in.close();
	}

}
