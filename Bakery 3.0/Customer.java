//Program Bakery 4.0
import java.util.Date;
import java.util.ArrayList;
public class Customer extends Person{
	ReservationInfo [] reserve;
	private java.util.Date dateCreated;
	private Date delivery;
	public int numOfReservation = 0;


	public Customer(){}

	public Customer(String name,String contactNo, String address){
		super(name, contactNo, address);
		reserve= new ReservationInfo [10];
	}

	public void doReservation(ReservationInfo rs)
	{	reserve [numOfReservation] = rs;
		numOfReservation++;
	}


	public String toString(){
		return("\n\tCustomer : " + getName() + "\n\tContact No: " + getContact() + "\n\tAddress: " + getAddress());

	//	for(int i = 0; i < numOfReservation; i++){
	//		reserve[i].toString();
//}

}
}
