package chap01;

import java.util.Scanner;

public class Difference_01_10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자 입력");
		System.out.print("a ");
		int a = scan.nextInt();
		int b=0;
		while(true) {
			System.out.print("b ");
			b = scan.nextInt();
			
			if(b>a) {
				break;
			}
			System.out.println("a보다 큰 값을 입력");
		}
		System.out.println("b-a="+(b-a));
	}
}
