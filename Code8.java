/*
 * 사용자로 부터 n개의 정수를 입력받은후 합과 최대 값을 구하여 출력하는 코드이다.
 */
package begin;

import java.util.Scanner;

public class Code8 {

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt();
	
		int[] data = new int[n];

			for (int i = 0; i < n; i++) {
			data[i] = kb.nextInt();
			kb.close();

			int sum = 0;
			int max = 0;
			
			for (int i = 0; i < n; i++) {
				sum += data[i];
				
			}
			System.out.println("The sum is " + sum + " and the maximum is " + max);
		}

	}

}
