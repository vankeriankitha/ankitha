package anki1;

public class Primenumber {

	public static void main(String[] args) {
		int count=0;
		int num=10;
		
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.println("primr number");
		}
		else
		{
			System.out.println("not a prime number");
		}
	}
}
