//Program Bakery 3.0

import java.util.Date;

public class Manager extends Person{

	public Manager(){
	}

	public Manager(String name, String contactNo, String address){
		super(name, contactNo, address);
	}

	public String toString(){
		return ("Manager : " + getName() + "\n\tContact No: " + getContact()+"\n\tAddress: " + getAddress());
	}
}
