package guviply;

import java.util.Scanner;

public class PrimeBWTwo {

	public static void main(String[] args) {
		int s;
		int e;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the intervals :");
		s=in.nextInt();
		e=in.nextInt();

		int primeCount=0;
	
		for(int num=s;num<=e;num++){
			int count=0;
//consider 1 is neither prime nor composite
			for(int  i=num;i>=1;i--){
				
				if(num%i==0){
					
					count=count+1;
				}
			}		
			if(count==2){
			  primeCount++;
			}
	
		}System.out.println(primeCount);
		in.close();


	}

}
