package anki1;

import java.util.Scanner;

public class siet2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Hey! give any name");
        String s1=sc.next();
        
		String rev = "";
		
		for(int i=0; i<s1.length();i++)
		{
			rev = s1.charAt(i)+rev;
		}
		System.out.println("The reverse of given String is "+rev);
	}

}
