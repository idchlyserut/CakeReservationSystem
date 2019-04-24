//Program Bakery 1.0

public abstract class Person {
	private String name;
	private String contactNo;
	private String address;

	public Person(){
	}

	public Person(String n, String c, String ad){
		name = n;
		contactNo = c;
		address = ad;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setContact(String contactNo){
		this.contactNo = contactNo;
	}

	public String getContact(){
		return contactNo;
	}

	public void setAddress(String address){
		this.address = address;
	}

	public String getAddress(){
		return address;
	}

	public String toString()
	{
		return ("Name: " + getName()+ "\nPhone: " + getContact() + "\nAddress: " + getAddress());
	}
}

