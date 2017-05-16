package application;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import pokeObjects.Player;
import pokeObjects.Spot;

public class BoardController implements Initializable{

	
	
	@FXML
	private Rectangle spot0;
	
	@FXML
	private Circle spot1;
	
	@FXML
	private Circle spot2;
	
	@FXML
	private Circle spot3;
	
	@FXML
	private Rectangle spot4;
	
	@FXML
	private Circle spot5;
	
	@FXML
	private Circle spot6;
	
	@FXML
	private Circle spot7;
	
	@FXML
	private Circle spot8;
	
	@FXML
	private Circle spot9;
	
	@FXML
	private Circle spot10;
	
	@FXML
	private Circle spot11;
	
	@FXML
	private Rectangle spot12;
	
	@FXML
	private Circle spot13;
	
	@FXML
	private Circle spot14;
	
	@FXML
	private Circle spot15;
	
	@FXML
	private Circle spot16;
	
	@FXML
	private Circle spot17;
	
	@FXML
	private Circle spot18;
	
	@FXML
	private Circle spot19;
	
	@FXML
	private Circle spot20;
	
	@FXML
	private Circle spot21;
	
	@FXML
	private Circle spot22;

	@FXML
	private Rectangle spot23;
	
	@FXML
	private Circle spot24;
	
	@FXML
	private Circle spot25;
	
	@FXML
	private Circle spot26;
	
	@FXML
	private Circle spot27;
	
	@FXML
	private Circle spot28;
	
	@FXML
	private Circle spot29;
	
	@FXML
	private Circle spot30;
	
	@FXML
	private Rectangle spot31;
	
	@FXML
	private Circle spot32;
	
	@FXML
	private Circle spot33;
	
	@FXML
	private Circle spot34;
	
	@FXML
	private Rectangle spot35;
	
	@FXML
	private Circle spot36;
	
	@FXML
	private Circle spot37;
	
	@FXML
	private Circle spot38;
	
	@FXML
	private Circle spot39;
	
	@FXML
	private Circle spot40;
	
	@FXML
	private Circle spot41;
	
	@FXML
	private Rectangle spot42;
	
	@FXML
	private Circle spot43;
	
	@FXML
	private Circle spot44;
	
	@FXML
	private Circle spot45;
	
	@FXML
	private Circle spot46;
	
	@FXML
	private Circle spot47;
	
	@FXML
	private Circle spot48;
	
	@FXML
	private Circle spot49;
	
	@FXML
	private Circle spot50;
	
	@FXML
	private Circle spot51;
	
	@FXML
	private Circle spot52;
	
	@FXML
	private Circle spot53;
	
	@FXML
	private Circle spot54;
	
	@FXML
	private Circle spot55;
	
	@FXML
	private Circle spot56;
	
	@FXML
	private Circle spot57;
	
	@FXML
	private Rectangle spot58;
	
	@FXML
	private Circle spot59;
	
	@FXML
	private Circle spot60;
	
	@FXML
	private Circle spot61;
	
	@FXML
	private Circle spot62;
	
	@FXML
	private Circle spot63;
	
	@FXML
	private Circle spot64;
	
	@FXML
	private Circle spot65;
	
	@FXML
	private Circle spot66;
	
	@FXML
	private Rectangle spot67;
	
	@FXML
	private Circle spot68;
	
	@FXML
	private Circle spot69;
	
	@FXML
	private Circle spot70;
	
	@FXML
	private Circle spot71;
	
	@FXML
	private Circle spot72;
	
	@FXML
	private Rectangle spot73;
	
	@FXML
	private Circle spot74;
	
	@FXML
	private Circle spot75;

	static private Spot[] spots = new Spot[76];


	int none = 0, catchPokemon = 1, drawCards = 2, pokecenter = 3, finalSpot = 4;
	int pink = 0, green = 1, blue = 2, red = 3, gold = 4;
	
	

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		System.out.println("Board initialized");	
		
		spots[0] = new Spot(none, spot0);
		spots[1] = new Spot(catchPokemon,spot1,pink);
		spots[2] = new Spot(catchPokemon,spot2,pink);
		spots[3] = new Spot(catchPokemon,spot3,pink);
		spots[4] = new Spot(drawCards,spot4);
		spots[5] = new Spot(catchPokemon,spot5,pink);
		spots[6] = new Spot(catchPokemon,spot6,pink);
		spots[7] = new Spot(catchPokemon,spot7,pink);
		spots[8] = new Spot(catchPokemon,spot8,pink);
		spots[9] = new Spot(catchPokemon,spot9,pink);
		spots[10] = new Spot(catchPokemon,spot10,pink);
		spots[11] = new Spot(catchPokemon,spot11,pink);
		spots[12] = new Spot(drawCards,spot12);
		spots[13] = new Spot(catchPokemon,spot13,pink);
		spots[14] = new Spot(catchPokemon,spot14,pink);
		spots[15] = new Spot(catchPokemon,spot15,pink);
		spots[16] = new Spot(catchPokemon,spot16,pink);
		spots[17] = new Spot(catchPokemon,spot17,pink);
		spots[18] = new Spot(catchPokemon,spot18,green);
		spots[19] = new Spot(catchPokemon,spot19,green);
		spots[20] = new Spot(catchPokemon,spot20,green);
		spots[21] = new Spot(catchPokemon,spot21,green);
		spots[22] = new Spot(catchPokemon,spot22,green);
		spots[23] = new Spot(pokecenter,spot23);
		spots[24] = new Spot(catchPokemon,spot24,green);
		spots[25] = new Spot(catchPokemon,spot25,green);
		spots[26] = new Spot(catchPokemon,spot26,green);
		spots[27] = new Spot(catchPokemon,spot27,green);
		spots[28] = new Spot(catchPokemon,spot28,green);
		spots[29] = new Spot(catchPokemon,spot29,green);
		spots[30] = new Spot(catchPokemon,spot30,green);
		spots[31] = new Spot(drawCards,spot31);
		spots[32] = new Spot(catchPokemon,spot32,green);
		spots[33] = new Spot(catchPokemon,spot33,green);
		spots[34] = new Spot(catchPokemon,spot34,green);
		spots[35] = new Spot(drawCards,spot35);
		spots[36] = new Spot(catchPokemon,spot36,green);
		spots[37] = new Spot(catchPokemon,spot37,green);
		spots[38] = new Spot(catchPokemon,spot38,green);
		spots[39] = new Spot(catchPokemon,spot39,green);
		spots[40] = new Spot(catchPokemon,spot40,blue);
		spots[41] = new Spot(catchPokemon,spot41,blue);
		spots[42] = new Spot(pokecenter,spot42);
		spots[43] = new Spot(catchPokemon,spot43,blue);
		spots[44] = new Spot(catchPokemon,spot44,blue);
		spots[45] = new Spot(catchPokemon,spot45,blue);
		spots[46] = new Spot(catchPokemon,spot46,blue);
		spots[47] = new Spot(catchPokemon,spot47,blue);
		spots[48] = new Spot(catchPokemon,spot48,blue);
		spots[49] = new Spot(catchPokemon,spot49,blue);
		spots[50] = new Spot(catchPokemon,spot50,blue);
		spots[51] = new Spot(catchPokemon,spot51,blue);
		spots[52] = new Spot(catchPokemon,spot52,blue);
		spots[53] = new Spot(catchPokemon,spot53,blue);
		spots[54] = new Spot(catchPokemon,spot54,blue);
		spots[55] = new Spot(catchPokemon,spot55,blue);
		spots[56] = new Spot(catchPokemon,spot56,blue);
		spots[57] = new Spot(catchPokemon,spot57,blue);
		spots[58] = new Spot(drawCards,spot58);
		spots[59] = new Spot(catchPokemon,spot59,red);
		spots[60] = new Spot(catchPokemon,spot60,red);
		spots[61] = new Spot(catchPokemon,spot61,red);
		spots[62] = new Spot(catchPokemon,spot62,red);
		spots[63] = new Spot(catchPokemon,spot63,red);
		spots[64] = new Spot(catchPokemon,spot64,red);
		spots[65] = new Spot(catchPokemon,spot65,red);
		spots[66] = new Spot(catchPokemon,spot66,red);
		spots[67] = new Spot(drawCards,spot67);
		spots[68] = new Spot(catchPokemon,spot68,red);
		spots[69] = new Spot(catchPokemon,spot69,red);
		spots[70] = new Spot(catchPokemon,spot70,red);
		spots[71] = new Spot(catchPokemon,spot71,red);
		spots[72] = new Spot(catchPokemon,spot72,red);
		spots[73] = new Spot(finalSpot,spot73);
		spots[74] = new Spot(catchPokemon,spot74,blue);
		spots[75] = new Spot(catchPokemon,spot75,blue);
		
		
	}

	static public void sayHi() {
		System.out.println("Hello");
	}

	static public double getSpotX(int spotNumber) {
		return spots[spotNumber].getCircle().getLayoutX();
	}
	
	static public double getSpotY(int spotNumber) {
		return spots[spotNumber].getCircle().getLayoutY()-15;
	}

	static public double getCitySpotX(int spotNumber) {
		return spots[spotNumber].getRectangle().getLayoutX()+50;
		
	}
	

	static public double getCitySpotY(int spotNumber) {
		return spots[spotNumber].getRectangle().getLayoutY()+10;
		
	}
	
}
