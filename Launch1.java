package com.jspiders.practice.pkg1;
import java.util.*;

class Guesser1
{
	private int gnum;
	String gname;
	Scanner scan=new Scanner(System.in);
	void guessNum()
	{
		System.out.println(gname+" guess a number ");
		gnum=scan.nextInt();
	}
	int getGnum()
	{
		return gnum;
	}
Guesser1 (String gname)
{
	this.gname=gname;
}
}

class Player1{
	private int pnum;
	String pname;
	Scanner scan=new Scanner(System.in);
	void guessNum()
	{
		System.out.println(pname+" guess a number ");
		pnum=scan.nextInt();
	}
	int getPnum()
	{
		return pnum;
	}
	Player1(String pname)
	{
		this.pname=pname;
	}
}
class Umpire1
{
	int no_from_guesser;
	int no_from_p1;
	int no_from_p2;
	int p1score,p2score;
	String gname,p1name,p2name;
	Scanner scan=new Scanner(System.in);
	void askName()
	{
		System.out.println("Guesser whats your name");
		gname=scan.nextLine();
		System.out.println("Player1 whats your name?");
		p1name=scan.nextLine();
		System.out.println("Player2 whats your name?");
		p2name=scan.nextLine();
	}
	void askGuesser()
	{
		Guesser1 g=new Guesser1(gname);
		g.guessNum();
		no_from_guesser=g.getGnum();
	}
	void askPlayer()
	{
		Player1 p1 =new Player1(p1name);
		p1.guessNum();
		no_from_p1=p1.getPnum();
		
		Player1 p2 =new Player1(p2name);
		p2.guessNum();
		no_from_p2=p2.getPnum();
		
	}
	void compare()
	{
		if(no_from_guesser==no_from_p1 &&no_from_guesser==no_from_p2)
		{
			System.out.println("DRAW");
			
		}
		
		else if(no_from_guesser==no_from_p1)
		{
			System.out.println(p1name+"has guessed correctly");
			p1score++;
		}
		else if(no_from_guesser==no_from_p2)
		{
			System.out.println(p2name+"has guessed correctly");
			p2score++;
		}
		else {
			System.out.println("please Continue");
		}
		
	}
	
	void display()
	{
		System.out.println(p1name+"score is"+p1score);
		System.out.println(p2name+"score is"+p2score);
		if(p1score==p2score)
		{
			System.out.println("DRAW");
			
		}
		else if(p1score>p2score)
		{
			System.out.println(p1name+"has won");
		}
		else {
			System.out.println(p2name+"has won");
		}
	}
	}
public class Launch1 {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Umpire1 u=new Umpire1();
		
		System.out.println("ENTER THE NO OF ROUNDS");
		int n=scan.nextInt();
		u.askName();
		for(int i=1;i<=n;i++)
		{
			u.askGuesser();
			u.askPlayer();
			u.compare();
		}
		u.display();
		
		

}

}