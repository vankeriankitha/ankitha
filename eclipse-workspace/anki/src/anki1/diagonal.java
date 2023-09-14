package anki1;

import java.util.Scanner;

public class diagonal {

	public static void main(String[] args) {
		int sum=0;
		int arr[][] = new int[3][3];
		 Scanner sc = new Scanner(System.in);
		 
		 for(int i=0; i<=2; i++)
		 {
			 for(int j=0; j<=2; j++)
			 { 
				 System.out.println("Enter a number");
				 arr[i][j] = sc.nextInt();
			 }
		 }
		 for(int i=0; i<=2; i++)
		 {
			 for(int j=0; j<=2; j++)
			 {
				 System.out.print(arr[i][j]+" ");
			 }
			 System.out.println();
		 }
         for(int i=0;i<=2;i++)
         {
        	 for(int j=0;j<=2;j++)
        	 {
        		if(i==j);
        		{
        			sum = sum+arr[i][j];
        		}
        	 }
        	 System.out.println(sum);
         }
	}

}
