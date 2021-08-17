package begin;

import java.util.Scanner;

public class Code8 {

	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		int n =kb.nextInt();
		int []data = new int[n];
		
		for (int i= 0;i <n ; i++ ) {
			data[i]= kb.nextInt();
			kb.close();
			
		int sum =0, max = data[0];
		for (int i1 =0; i1<n; i1++) {
			sum +=data[i1];
			if(data[i1]>max) max=data[i1];
			
		}
		System.out.println("The sum is "+sum+" and the maximum is "+ max);
		}
				
		
	}

}
