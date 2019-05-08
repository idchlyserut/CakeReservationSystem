//9.0 Main program

import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;
import java.util.Date;

public class Reservation {

public static void main(String[] args){




	ArrayList<Customer> custList = new ArrayList<Customer>();
	ArrayList<Cake> cakeList = new ArrayList<Cake>();
	ArrayList<Worker> workerList = new ArrayList<Worker>();
	//ArrayList<Baker> bakerList = new ArrayList<Baker>();

	Scanner user = new Scanner(System.in);
	Scanner user1 = new Scanner(System.in);
	Scanner user2 = new Scanner(System.in);
	Scanner user3 = new Scanner (System.in);


   	//manager info
	Worker w1 = new Worker("Idiey Rut","88191", "Manager");
	//baker info
	Worker w2 = new Worker("Amirah Sya","98172", "Cashier");

	workerList.add(w1);
	workerList.add(w2);

	Cake c1 = new Cake("Cheese Cake",1.5,"Sponge Cake",40,"Cheese");
	Cake c2 = new Cake ("Rainbow Cake",2, "Ice Cream Cake", 50,"Rainbow");
	Cake c3 = new Cake ("Choco Chocolate",0.5, "Original Cake",15,"Chocolate");

	cakeList.add(c1);
	cakeList.add(c2);
	cakeList.add(c3);

	//Baker b1 = new Baker ("Aina Mardhiah", c1);
	//Baker b2 = new Baker ("Mardhiah Aina", c2);
	//Baker b3 = new Baker ("Ain Amar", c3);

	//bakerList.add(b1);
	//bakerList.add(b2);
	//bakerList.add(b3);

					// Shop Info
					System.out.print(".*.*.*.*.*|| Cake Shop Info ||.*.*.*.*.*");
					System.out.print("\nShop owner: Azira Yus ");
					for (int j=0; j<workerList.size(); j++) {
					System.out.print("\n" + workerList.get(j).toString());}
					System.out.print ("\n\nSince: (2011-)\n\n");

					//Baker Info
			    	/* System.out.println("\n\n.*.*.*.*.*|| Baker Info ||.*.*.*.*.*");
			    	 System.out.println("\t" + b1);
			    	 System.out.println("\t" + b2);
			    	 System.out.println("\t" + b3);
			    	 */

					//Cake Info
				 	 System.out.print("\n\n.*.*.*.*.*|| Cake Available ||.*.*.*.*.*");
					 for(int i = 0; i<cakeList.size(); i++){
					 System.out.print("\n\t [" +(i) + "]" + cakeList.get(i).getName());
			    	 System.out.print("\n\t Size: "+ cakeList.get(i).getSize() + "KG");
		       		 System.out.print("\n\t type: " + cakeList.get(i).getType());
			    	 System.out.print("\n\t Price: "+ cakeList.get(i).getPrice());
			    	 System.out.print("\n\t Flavour: "+ cakeList.get(i).getFlavour()+"\n\n");
			    	  }



				System.out.print("\n\n\t+++++++++++Start Order+++++++++++");
				System.out.print("\n\tChoose your pick, Press 0-2:");
				//Error handling
				int a= user.nextInt();
				System.out.print(".*.*.*.*.*|| Please Insert Your Information Here ||.*.*.*.*.*");
				System.out.print("\n\tName: ");
				String cus1 = user1.nextLine();
				System.out.print("\n\tPhone: ");
				String phone = user2.nextLine();
				System.out.print("\n\tAddress: ");
				String ad1 = user3.nextLine();
				System.out.print("\n\tPickup time & date: ");
				String pickup = user2.nextLine();


				Customer cust = new Customer(cus1,phone,ad1);
				custList.add(cust);
				Receipt r1 = new Receipt(pickup, cakeList.get(a).getPrice());
				System.out.println(" ---||---|| Cake succsessfully booked ||---||----");
				r1.display();
				cust.display();
				cakeList.get(a).display();
				System.out.print(".*.*.*.*.*Thank you for purchasing!.*.*.*.*.*\n");

}
}