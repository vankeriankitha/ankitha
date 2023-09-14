package anki1;

import java.util.Scanner;

class Guesser
{
	int gnum;
	int Guessernum()
	{
		System.out.println("Guesser guess the number between 1 to 30");
		Scanner sc = new Scanner(System.in);
		gnum = sc.nextInt();
		return gnum;
	}
}
class Player
{
	int pnum;
	int playernum()
	{
		System.out.println("player guess the number between 1 to 30");
		Scanner sc = new Scanner(System.in);
		pnum = sc.nextInt();
		return pnum;
	}
}
class Umpire
{
	int ugnum;
	int up1num;
	int up2num;
	int up3num;
	
	void collectGnum()
	{
		Guesser g = new Guesser();
		ugnum = g.Guessernum();
	}
	void collectPnum()
	{
		Player p1 = new Player();
		System.out.println("Player 1");
		up1num = p1.playernum();
		Player p2 = new Player();
		System.out.println("Player 2");
		up2num = p2.playernum();
		Player p3 = new Player();
		System.out.println("Player 3");
		up3num = p3.playernum();
	}
	void Compare()
	{
		if(ugnum==up1num)
		{
			System.out.println("Player 1 wins");
		}
		else if(ugnum==up2num)
		{
			System.out.println("Player 2 wins");
		}
		else if(ugnum==up3num)
		{
			System.out.println("Player 3 wins");
		}
		else
		{
			System.out.println("Game Over");
		}
	}
}
public class Demo {

	public static void main(String[] args) {
		Umpire u = new Umpire();
		u.collectGnum();
		u.collectPnum();
		u.Compare();
	}
}
