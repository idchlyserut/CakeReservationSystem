//Program Bakery 7
//Abstract class

import java.util.Date;

public abstract class ReservationInfo {
	private java.util.Date dateCreated;


	//Abstract methods
	public abstract int getReserveID();


	public ReservationInfo(){
		dateCreated = new java.util.Date();

	}

	public java.util.Date getDateCreated()
	{
		return dateCreated;
	}


}
