package pokeObjects;

import java.util.ArrayList;

import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

public class Spot {

	private int action;
	private ArrayList <Players> playersHere;
	private Circle circle;
	private Rectangle rectangle;
	private int color;
	
	public Spot(int action, Circle circle){
		this.action = action;
		this.playersHere = new ArrayList<Players>();
		this.circle = circle;
	}

	public Spot(int action, Rectangle rectangle) {
		this.action = action;
		this.playersHere = new ArrayList<Players>();
		this.rectangle = rectangle;	}

	public Spot(int action, Circle circle, int color) {
		this.action = action;
		this.playersHere = new ArrayList<Players>();
		this.circle = circle;
		this.color = color;
	}
	
}
