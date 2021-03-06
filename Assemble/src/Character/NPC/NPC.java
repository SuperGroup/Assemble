package Character.NPC;

import java.awt.Shape;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;

import AnimationDemo.GameImage;
import Character.Character;
import Character.NPC.Enemy.Enemy;

public abstract class NPC extends Character {
	
	public NPC(String filename, int x, int y, int w, int h, double maxHealth,
			double power, double jumpStrength, boolean right) {
		super(filename, x, y, w, h, maxHealth, power, jumpStrength);
		isRight = right;
	}

	public abstract void attack();

	public void act(ArrayList<Shape> obstacles) {
		if (isRight)
			this.walk(1);
		else
			this.walk(-1);
		attack();
		double xCoord = x;
		super.act(obstacles);
		if (xCoord == x) {
			isRight = !isRight;
		}
	}
	
	

}
