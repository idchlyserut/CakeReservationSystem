//Program Bakery 7
//Abstract class

import java.util.Date;

public class ReservationInfo {
	private java.util.Date dateCreated;
	public int id;

	public ReservationInfo(int id) {
		this.id = id;
	}

	public ReservationInfo(){
		dateCreated = new java.util.Date();

	}

	//Abstract methods
	public int getReserveID() {
		return id = 100;
	}

	public java.util.Date getDateCreated()
	{
		return dateCreated;
	}


}
