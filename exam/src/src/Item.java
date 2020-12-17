package src;

public class Item {



	private int itemId;
	public double cost;
	private float profit;
	static int count;

	public Item(double c,float p){
	itemId = 101 + count++;
	cost = c;
	profit = p;
	}

	public Item(){
	this (0,0);
	}

	public int getId(){ return itemId; }
		
	public double getCost() { return cost; }
	public void setCost(double value) { cost = value; } 

	public float getProfit() { return profit; }
	public void setProfit(float value) { profit = value; }

	public double sellingPrice(){
		//int sp = cost > 1500 ? cost-300 : 0;
		return cost * (1 + profit / 100);
		
	}

	public static int active() {
 		return count;
	}

}
	
	
	
