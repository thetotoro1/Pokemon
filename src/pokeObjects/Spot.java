package pokeObjects;

import java.util.ArrayList;

import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

public class Spot {

	private int action;
	private Circle circle;
	private Rectangle rectangle;
	private int color;
	
	public Spot(int action, Circle circle){
		this.action = action;
		this.circle = circle;
	}

	public Spot(int action, Rectangle rectangle) {
		this.action = action;
		this.rectangle = rectangle;	}

	public Spot(int action, Circle circle, int color) {
		this.action = action;
		this.circle = circle;
		this.color = color;
	}

	public int getAction() {
		return action;
	}

	public Circle getCircle() {
		return circle;
	}

	public Rectangle getRectangle() {
		return rectangle;
	}

	public int getColor() {
		return color;
	}
	
	
	
	
	
}
