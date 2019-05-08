//Program Bakery 8.0
import java.util.Date;

public class Receipt {
	private Customer c; //agg
	private double totalPrice;
	private String pickupDate;
	private ReservationInfo ri;
	private Cake cake; //aggregation
	//public int id;


	public Receipt(String p, double total) {
		pickupDate = p;
		totalPrice = total;
		//ri = reserveInfo;
	}



	public void setPickupDate(String pickupDate ){
			this.pickupDate = pickupDate;
		}


		public String getPickupDate(){
			return pickupDate;
		}

		public void calcTotal() {
			totalPrice = cake.getPrice();
		}

		public double getTotalPrice(){
			return totalPrice;
		}


	public void display(){
		System.out.println("      Successfully booked a cake!    \n ");
		System.out.println("              Bakery               \n");
		System.out.print("----------------CustomerInfo--------------\n");
		System.out.println("\nReserveID: " + ri.getReserveID());
		System.out.println("\nDate Order Created: " + ri.getDateCreated());
		System.out.println("\nTotalPrice: " + getTotalPrice());
		System.out.println("\nPickup Date: " + getPickupDate() + "\n");


	}
}
