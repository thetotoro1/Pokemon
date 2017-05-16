package pokeObjects;

import java.util.ArrayList;

import javafx.scene.shape.Rectangle;

public class Player extends Rectangle{

	private int playerNumber;
	private ArrayList <card> cards;
	private double x,y;
	
	public Player(int playerNum, int x, int y) {
		super(x, y, 5, 20);
		playerNumber = playerNum;
		cards = new ArrayList<card>();

	}
	
	
}
