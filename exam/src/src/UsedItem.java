package src;

public class UsedItem extends Item{


	private float discount=25;

	public UsedItem(double c,float p,float d){
		super(c,p);
	
		discount=d;
	}

	public UsedItem() {
		// TODO Auto-generated constructor stub
	}

	public float getDiscount() { return discount; }
	
	@Override
	public double sellingPrice() {
		 double amount = super.sellingPrice();
 		float d = discount-100;
		if(cost >=5000)
			amount = (d*cost)/100;
		return amount;
	}
}