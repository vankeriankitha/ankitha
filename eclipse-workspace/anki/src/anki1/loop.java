package anki1;

import java.util.Scanner;

public class loop {

	public loop() {
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int arr[]=new int[5];
		
		for(int i=0;i<=arr.length-1;i++)
		{
		System.out.println("Enter a number");
		arr[i]=sc.nextInt();
		System.out.print(arr[i]);
		}

	}

}
