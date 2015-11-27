package tank;

import java.util.Random;


public class BattleField {
	
	private int bfWidth = 576;
	private int bfHeigth = 576;
	
	
	private String[][] battleField = {
			{"B", "B", "B", "B", "B", "B", "B", "B", "B" },
			{"B", "B", " ", " ", "B", " ", " ", "B", "B" },
			{"B", "B", "B", " ", "B", "B", "B", " ", "B" },
			{"B", "B", " ", " ", "B", " ", " ", "B", "B" },
			{"B", "B", "B", "B", "B", "B", "B", "B", "B" },
			{"B", " ", " ", " ", "B", " ", " ", " ", "B" },
			{"B", "B", "B", " ", "B", "B", "B", " ", "B" },
			{"B", "B", " ", " ", "B", " ", " ", "B", "B" },
			{"B", "B", "B", "B", "B", "B", "B", "B", "B" }
};
	
	public BattleField(){
	}
	
	public String getAggressorLocation(){
		String [] locations = {"0_0", "128_128", "320_320"};
		Random r = new Random();
		String str = locations[r.nextInt(2)];
		return str;
	}
	
	public BattleField(String[][] battleField){
		this.battleField = battleField;
	}
	
	public void updateQuadrant (int v, int h, String object){
		battleField[v][h] = object;
	}
	
	public String scanQuadrant (int v, int h){
		return battleField[v][h];
	}
	
	public int getDimentionX (){
		return battleField.length;
	}
	
	public int getDimentionY (){
		return battleField.length;
	}
	
	public int getBfWidth(){
		return bfWidth;
	}
	
	public int getBfHeigth(){
		return bfHeigth;
	}


	
	

	
	

}
