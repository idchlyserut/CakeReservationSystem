//Program Bakery 2.0
import java.util.Date;

public class Baker extends Person{

	public Baker(){
	}

	public Baker(String name, String contactNo, String address){
		super(name, contactNo, address);

	}

	public String toString(){
		return ("Baker : " + getName() + "\n\tContact No: " + getContact() + "\n\tAddress: " + getAddress());

	}
}
