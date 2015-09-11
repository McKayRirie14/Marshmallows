package marshmallow.controller;

import marshmallow.model.MarshmallowMonster;
import marshmallows.view.MarshmallowOutput; 

public class MonsterController
{
	private MarshmallowMonster smickMonster;
	private MarshmallowOutput myOutput; 
	
	public MonsterController()
	{
		int eyes = 3;
		double legs = 4.5;
		double hair = .2;
		int noses = 1;
		boolean hasBellyButton = false;
		String name = "Ickle Diddykins";
		
		myOutput = new MarshmallowOutput();
		smickMonster = new MarshmallowMonster(name, eyes, noses, hair, legs, hasBellyButton);
	}
	
	public void start () 
	{
		myOutput.displayMonsterInfo(codyMonster.toString());
	}
	
	
}