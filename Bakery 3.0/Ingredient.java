//Program Bakery 6.0

public class Ingredient{
	private String type;
	private int amount;

	public Ingredient(){
	}

	public Ingredient(String t, int a){
		type = t;
		amount = a;
	}

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return type;
	}

	public void setAmount(int amount){
		this.amount = amount;
	}

	public int getAmount(){
		return amount;
	}

	public void display()
	{	System.out.println("Type: " + type + '\n' + "Amount: " + amount + '\n');
	}
}
