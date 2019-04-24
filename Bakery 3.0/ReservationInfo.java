//Program Bakery 7
import java.util.Date;

class ReservationInfo {
	private String reserveID;
	private String pickupDate;
	private java.util.Date dateCreated;
	private double totalPrice;
	Cake cake;

	public ReservationInfo(){
	}

	public ReservationInfo(String p, double total){
		pickupDate = p;
		this.totalPrice = totalPrice;
	}

	public void setReserveID(){
		reserveID = "A11239";
	}


	public void setPickupDate(Date bookDate ){
		this.pickupDate = pickupDate;
	}

	public String getReserveID(){
		return reserveID;
	}

	public java.util.Date getDateCreated () {
			return dateCreated;
	}

	public String getPickupDate(){
		return pickupDate;
	}

	public double getTotalPrice(){
		return totalPrice;
	}

	public String toString(){
		return("\n\tReserveID: "+ getReserveID() +"\n\tBook Date: "+ getDateCreated() + "\n\tPickup Date: "+ getPickupDate()+"\n\tTotal Price: "+ getTotalPrice()+super.toString());

}	}
