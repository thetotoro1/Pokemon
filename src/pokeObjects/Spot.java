package pokeObjects;

import java.util.ArrayList;

import javafx.scene.shape.Circle;

public class Spot {

	private String action;
	private ArrayList <Players> playersHere;
	private Circle circle;
	
	public Spot(String action, Circle circle){
		this.action = action;
		this.playersHere = new ArrayList<Players>();
		this.circle = circle;
	}
	
}
