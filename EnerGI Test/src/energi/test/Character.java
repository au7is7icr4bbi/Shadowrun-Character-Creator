/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package energi.test;
import energi.System.Core.GameObject;
import energi.System.Graphics.Sprite;
import energi.System.Collisions.BoundingBox;
//import org.lwjgl.input.Keyboard;

/**
 * Represents a playable character in the game created for the integration test
 * @author andrew
 * @version 1.0
 */
public class Character implements GameObject
{
	private Sprite image;
	private BoundingBox box;
	
	@Override
	public void init()
	{
		image = new Sprite("/home/andrew/Downloads/pic.jpg");
		box = new BoundingBox();
	}
	
	@Override
	public void update()
	{
		// use the motion calculations to move the bounding box accordingly, and update the sprite properties
		box.move(0.5, 0);
		
		image.setTopCorner((float)box.getVertices()[2].getX(), (float)box.getVertices()[2].getY());
	}
	
	@Override
	public void Draw()
	{
		image.Draw();
	}
}
