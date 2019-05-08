//Program Bakery 4.0

public class Customer extends Person{
	private int customerID;

	public Customer(){}

	public Customer(String name,String contactNo, String address){
		super(name, contactNo, address);
	}

	public int getCustomerID() {

			return customerID=1112;
	}

	public void display(){
		System.out.println("\n .*.*.*.*.*Customer Information.*.*.*.*.* \nCustomerID :" + getCustomerID());
	}

	public String toString() //abstract method override
	{
		return ("\nName: " + getName()+ "  Phone: " + getContact() + "  Address: " + getAddress());
	}
}
