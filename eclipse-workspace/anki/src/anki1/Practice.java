package anki1;

public class Practice {

	public static void main(String[] args) {
		int count = 0;
		int num=12346793;
		while(num>0)
		{
			num=num/10;
			count++;
		}
		System.out.println(count);
	}

}
