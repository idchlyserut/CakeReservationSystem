//Program Bakery 8.0

public class Receipt {
	private ReservationInfo r;
	private Customer c;

	public Receipt() {}
	public void display(){
		System.out.println("    Successfully booked a cake!    \n ");
		System.out.println("              Bakery               \n");
		System.out.print("----------------CustomerInfo--------------");
		System.out.print(r.toString()+super.toString());
		System.out.print(c.toString()+super.toString());
	}
}
