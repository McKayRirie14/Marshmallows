package marshmallow.controller;

import marshmallow.model.MarshmallowMonster;
import marshmallows.view.MarshmallowOutput;
import java.util.Scanner;

public class MonsterController
{
	private MarshmallowMonster smickMonster;
	private MarshmallowOutput myOutput; 
	private Scanner monsterScanner;
	
	public MonsterController()
	{
		int eyes = 3;
		double legs = 4.5;
		double hair = .2;
		int noses = 1;
		boolean hasBellyButton = false;
		String name = "yuck old candy";
		
		monsterScanner = new Scanner(System.in);
		myOutput = new MarshmallowOutput();
		smickMonster = new MarshmallowMonster(name, eyes, noses, hair, legs, hasBellyButton);
	}
	
	public void start () 
	{
		myOutput.displayMonsterInfo(smickMonster.toString());
		myOutput.displayMonsterGUI(smickMonster.toString());
	}
	
	private void askQuestions()
	{
		System.out.println("I want a new name for a monster, type one please!;"); 
		String newMonsterName = monsterScanner.next();
		
		System.out.println("Give me a new number of noses!!");
		int updatedNoses = monsterScanner.nextInt(); 
		
		System.out.println("Give me a new amount of legs!!");
		double updatedLegs = monsterScanner.nextDouble();
		
		System.out.println("Give me a new amoun of hair!!");
		double updatedHair = monsterScanner.nextDouble();
		
		System.out.println("Update my bellybutton status!!");
		boolean updatedBellybuttons = monsterScanner.nextboolean();
		
		smickMonster.setMonsterNoses(updatedNoses);
		smickMonster.setMonsterLegs(updatedLegs);
		smickMonster.setMonsterName(newMonsterName);
		smickMonster.setMonsterHair(updatedHair);
		smickMonster.setMonsterBellyButton(updatedBellybuttons);
	}

		/**
		 * This method will get the information to create an instance of a MarshmallowMonster.
		 */
		private void makeUserMonster()
		{
			//Step one: Get variables 
			String userName; 
			int userEyes;
			int useNoseCount;
			double userHair;
			double userLegs;
			boolean userBellyButton;
			
			//Step two: Define variables by using Scanner to get user input.
			System.out.println("Type in your name for your monster.");
			userName = monsterScanner.nextLine();
			System.out.println("Type in the number of eyes for your monster"); 
			userEyes = monsterScanner.nextInt();
			System.out.println("Type in the number of noses for theis monster.");
			userNoseCount = monsterScanner.nextInt();
			System.out.println("How much ir does your monster have? Type in a floating point or decimal number");
			userHair = monsterScanner.nextDouble();
			System.out.println("How many legs??????");
			userLegs = monsterScanner.nextDouble();
			System.out.println("Does it have a bellybutton? Type true r false");
			userBellyButton = monsterScanner.nextBoolean();
			
			//Step three: make a monster - use the Contructor!!!
			userMonster = new MarshmallowMonster(userName, userEyes, userNoseCount, userHair, userLegs, userBellyButton); 
		}
}