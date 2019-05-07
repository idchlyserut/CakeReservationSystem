//Program Bakery 8.0
import java.util.Date;

public class Receipt extends Reservation{
	private Reservation r;
	private Customer c;
	private String reserveID;
	private java.util.Date dateCreated;
	private Cake kek;
	private double totalPrice;

	public Receipt() {}

	public void setReserveID() {
			this.reserveID = reserveID;
	}

	public String getReserveID() {
			return reserveID;
	}

	public java.util.Date getDateCreated () {
			return dateCreated;
	}

	public double getTotalPrice(){
			return totalPrice;
	}

	public void display(){
		System.out.println("    Successfully booked a cake!    \n ");
		System.out.println("              Bakery               \n");
		System.out.print("----------------CustomerInfo--------------\n");
		System.out.print("\n\tReserveID: " +getReserveID());
		System.out.print("\n\tDate Order Created: " +getDateCreated());

	}
}
