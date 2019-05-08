//Program Bakery 5.0
import java.util.*;
public class Cake {
	private String name;
	private double size;
	private String type;
	private String flavour;
	private double price;
	//private Ingredient[] ing;
	public int count;

	public Cake(){
	}

	public Cake(String n, double s, String t, double p, String f){
		name=n;
		size = s;
		type = t;
		price = p;
		flavour = f;}
	public void setName(String name){ name=name;}
	public void setSize(double size){this.size = size;}
	public void setType(String type){this.type = type;}
	public void setPrice(double price){this.price = price;}
	public void setFlavour(String flavour){this.flavour = flavour;}

	public String getName(){return name;}
	public double getSize(){return size;}
	public String getType(){return type;}
	public double getPrice(){return price;}
	public String getFlavour(){return flavour;}

	public void display(){
		System.out.println("\n.*.*.*.*.*Cake information.*.*.*.*.*\nCake Type: " + getType() + "\nCake Size (KG): " + getSize()+ "\nCake Flavour: " + getFlavour()+ "\nPrice: RM" + getPrice());

	}
}
