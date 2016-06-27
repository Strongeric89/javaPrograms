package com.eric;
import java.util.Scanner;
import java.util.Random;

public class Football {
	public static void main(String [] args)
	{
		Scanner scan = new Scanner (System.in);
		System.out.println("How many Teams in the Tournament?");
		int tournament = scan.nextInt();
		String table[][] = new String [tournament][2];
		int count = 0;
		boolean isRunning = true;
		
		do{
			if(count == tournament)
			{
				isRunning = false;
				break;
			}
			System.out.println("Please enter your team:");
			String team = scan.next();
			
			System.out.println("How many matches have " + team + " played?");
			int matches = scan.nextInt();
			int teamTotal= pointCal(team, matches);
			System.out.println(team + " points have " + teamTotal + " Points!");
		
			table[count][0] = team;			
			table[count][1] =Integer.toString(teamTotal);
			
			count ++; //index for the team
			}
		
		while(isRunning);
		System.out.println("----------------------------------------");
		for(int i =0;i<tournament;i++)
		{
			for(int j =0;j<2;j++)
			{
				System.out.printf("\n%d. Team: %s\t|Points:%s",i+1,table[i][0],table[i][1]);
				break;
			}
		}
			
			
	}//end main
	public static int pointCal(String team,int matches)
	{
		String otherTeams[]={"Poland","Germany","Italy","Belgium","Denmark","Luxembourge","Spain","Portugal","England","France"};
		Scanner scan = new Scanner (System.in);
		Random r = new Random();
		int randNum = r.nextInt(10);
		int win=0;
		int draw=0;
		int lose =0;
		int teamTotal=0;
		//counting up the scores
		System.out.println(team + "\n------------------------");
		for(int i=0;i<matches;i++)
		{
			randNum = r.nextInt(8);
			System.out.println("Enter \"Win\", \"Draw\", or \"Lose\"\n");
			System.out.print(team + " V " + otherTeams[randNum] + ": Game " + (i + 1)+ "\t:");
			String status = scan.nextLine();
			if(status.equalsIgnoreCase("Win"))
			{
				win = win+3;
			}//end if
			if(status.equalsIgnoreCase("Draw"))
			{
				draw =draw+1;
			}//end if
			if(status.equalsIgnoreCase("Lose"))
			{
				lose = lose + 0;
			}//end if
			teamTotal = win + draw + lose;
		}//end for
		return teamTotal;
	}//end pointCal
}//end class
