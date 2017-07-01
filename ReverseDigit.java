package player_Set2;

import java.util.Scanner;

public class ReverseDigit {

	public static void main(String[] args) {
		int n;
		int r=0;
		Scanner in=new Scanner(System.in);
		n=in.nextInt();
		int t=n;
		while(t!=0){
			r=(r*10)+(t%10);
			t/=10;
		}System.out.println("Reversed Digit :"+r);
		in.close();

	}

}
