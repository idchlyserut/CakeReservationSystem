//Program Bakery 8.0
import java.util.Date;

public class Receipt extends ReservationInfo{
	private Customer c;
	private double totalPrice;
	private  String pickupDate;
	private Cake cake; //aggregation
	public int id;


	public Receipt(String p, double total) {
		pickupDate = p;
		totalPrice = total;}

	public int getReserveID() {

		return id=100;
	}

	public void setPickupDate(String pickupDate ){
			this.pickupDate = pickupDate;
		}


		public String getPickupDate(){
			return pickupDate;
		}

		public double getTotalPrice(){
			return totalPrice;
		}


	public void display(){
		System.out.println("      Successfully booked a cake!    \n ");
		System.out.println("              Bakery               \n");
		System.out.print("----------------CustomerInfo--------------\n");
		System.out.print("\nReserveID: " + getReserveID());
		System.out.print("\nDate Order Created: " + getDateCreated());
		System.out.print("\nTotalPrice: " + getTotalPrice());
		System.out.print("\nPickup Date: " + getPickupDate() + "\n");

	}
}
