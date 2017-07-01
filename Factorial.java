package player_Set2;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int f=1;
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		for(int i=n;i>=1;i--){
			f*=i;
			
		}System.out.println("Factorial of "+n+" is :"+f);
		in.close();

	}

}
