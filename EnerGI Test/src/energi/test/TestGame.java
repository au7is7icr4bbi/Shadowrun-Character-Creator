/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package energi.test;
import energi.System.Core.Game;
import org.lwjgl.input.Keyboard;

/**
 * Core game class for integration test
 * @author andrew
 */
public class TestGame extends Game
{
	public TestGame()
	{
		// create and add all starting game objects here
		Character newCharacter = new Character();
		addObject(newCharacter);
	}
	
	@Override
	public void init()
	{
		// initialise the game
		super.init();
	}
	
	@Override
	public void update()
	{
		while (Keyboard.next())
		{
			if (Keyboard.getEventKeyState())
			{
				if (Keyboard.getEventKey() == Keyboard.KEY_ESCAPE)
				{
					System.exit(0);
				}
			}
		}
		super.update();
	}
	
	@Override
	public void Draw()
	{
		super.Draw();
	}
}
