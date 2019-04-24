//9.0 Main program

import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;
import java.util.Date;

public class Reservation {

public static void main(String[] args){
	ArrayList<Customer> custList = new ArrayList<Customer>();
	ArrayList<Cake> cakeList = new ArrayList<Cake>();

	Scanner user = new Scanner(System.in);
	Scanner user1 = new Scanner(System.in);
	Scanner user2 = new Scanner(System.in);
	Scanner user3 = new Scanner (System.in);
	Receipt receipt = new Receipt();
   	String  inputFileName, outputFileName;

   	//manager info
	Manager manager = new Manager("Idiey Rut","88191", "K06, KTR, UTM JOHOR");
	//baker info
	Baker baker = new Baker("Amirah Syafiqah","98172", "M21, KTDI, UTM JOHOR");

	Cake c1 = new Cake("Cheese Cake",1.5,"Sponge Cake",40,"Cheese");
	Cake c2 = new Cake ("Rainbow Cake",2, "Ice Cream Cake", 50,"Rainbow");
	Cake c3 = new Cake ("Choco Chocolate",0.5, "Original Cake",15,"Chocolate");

	cakeList.add(c1);
	cakeList.add(c2);
	cakeList.add(c3);

				 System.out.print("---||----|| Cake Shop Info ||----||---");
				System.out.print("\n\tShop owner: Azira Yusra \n\t"+ manager.toString() + "\n\t" + baker.toString() + "\n\tSince: 2011-\n\n");

				 System.out.print("---||----|| Cake Available ||----||---");
				 for(int i = 0; i<cakeList.size(); i++){
				 System.out.print("\n\t [" +(i) + "]" + cakeList.get(i).getName());
			     System.out.print("\n\t Size: "+ cakeList.get(i).getSize() + "KG");
		       	 System.out.print("\n\t type: " + cakeList.get(i).getType());
			     System.out.print("\n\t Price: "+ cakeList.get(i).getPrice());
			     System.out.print("\n\t Flavour: "+ cakeList.get(i).getFlavour()+"\n");
			      }

				System.out.print("\n\tChoose your pick, Press 0-2:");
				int a= user.nextInt();
				System.out.print("---||----|| Please Insert Your Information Here ||----||---");
				System.out.print("\n\tName: ");
				String cus1 = user1.nextLine();
				System.out.print("\n\tPhone: ");
				String phone = user2.nextLine();
				System.out.print("\n\tAddress: ");
				String ad1 = user3.nextLine();
				System.out.print("\n\tPickup time: ");
				String pickup = user2.nextLine();


				ReservationInfo reserve = new ReservationInfo(pickup, cakeList.get(a).getPrice());
				Customer cust = new Customer(cus1,phone,ad1);
				custList.add(cust);
				System.out.println(" ---||---|| Cake succsessfully booked ||---||----");
				receipt.display();


}
}