package marshmallows.view;

import java.swing.JOptionPane;

public class MarshmallowOutput implements displayMonsterConsole
{

	public void displayMonsterInfo(String info)
	{
		System.out.println("My monster info is: " + info);
	}
	
	public void displayMonsterGUI(String info)
	{
		JOptionPane.showMessageDialog(null, "My monster information is:" + info);
	}
	
}