import java.util.ArrayList;
import java.util.List;
import java.util.Collection;



import src.*;
public class Shop {
	
	public static void main(String[] args) {
	List<Item> item = new ArrayList<>();
	Item item1 =new Item();
	UsedItem usedItem1 =new UsedItem();
	System.out.println("Product details");
	
	//System.out.println("Enter Item Cost");
	//double itemcost = Double.parseDouble(args[0]);
	item1.setCost(1200);
	usedItem1.setCost(1000);
	//System.out.println("Enter Item Cost");
	//float itemprofit = Float.parseFloat(args[1]);
	item1.setProfit(10);
	usedItem1.setProfit(20);
	
	
	item.add(item1);
	item.add(usedItem1);
	
	for(int i = 0; i<item.size();i++){
		System.out.println("**********************************************************");
		System.out.println(item.get(i).getId());
		System.out.println(item.get(i).getCost());
		System.out.println(item.get(i).getProfit());
		System.out.println(item.get(i).sellingPrice());
	}
	
	

}


	
}
	

