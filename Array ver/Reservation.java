//9.0 Main program

import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;
import java.util.Date;

public class Reservation {

public static void main(String[] args) {

	Customer[] custArray = new Customer[4];
	Cake[] cakeArray = new Cake[3];
	Worker[] workerArray = new Worker[3];

	Scanner user = new Scanner(System.in);
	Scanner user1 = new Scanner(System.in);
	Scanner user2 = new Scanner(System.in);
	Scanner user3 = new Scanner (System.in);


   	//manager info
	Worker w1 = new Worker("Idiey Rut","88191", "Manager");
	//baker info
	Worker w2 = new Worker("Amirah Sya","98172", "Baker ");

	workerArray[0] = w1;
	workerArray[1] = w2;

	Cake c1 = new Cake("Cheese Cake",1.5,"Sponge Cake",40,"Cheese");
	Cake c2 = new Cake ("Rainbow Cake",2, "Ice Cream Cake", 50,"Rainbow");
	Cake c3 = new Cake ("Choco Chocolate",0.5, "Original Cake",15,"Chocolate");

	cakeArray[0] = c1;
	cakeArray[1] = c2;
	cakeArray[2] = c3;

					// Shop Info
					System.out.print(".*.*.*.*.*|| Cake Shop Info ||.*.*.*.*.*");
					System.out.print("\nShop owner: Azira Yus ");
					for (int j=0; j<workerArray.length; j++) {
					System.out.print("\n" + workerArray[j].toString());}
					System.out.print("\n\nSince: (2011-)\n\n");

					//Cake Info
				 	 System.out.print(".*.*.*.*.*|| Cake Available ||.*.*.*.*.*");
					 for(int i = 0; i<cakeArray.length; i++){
					 System.out.print("\n\t [" +(i) + "]" + cakeArray[i].getName());
			    	 System.out.print("\n\t Size: "+ cakeArray[i].getSize() + "KG");
		       		 System.out.print("\n\t type: " + cakeArray[i].getType());
			    	 System.out.print("\n\t Price: "+ cakeArray[i].getPrice());
			    	 System.out.print("\n\t Flavour: "+ cakeArray[i].getFlavour()+"\n");
			    	  }

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


				Receipt r1 = new Receipt(pickup, cakeArray[a].getPrice());
				Customer cust = new Customer(cus1,phone,ad1);
				custArray[0] = cust;
				System.out.println(" ---||---|| Cake succsessfully booked ||---||----");
				r1.display();
				cust.display();
				cakeArray[a].display();
				System.out.print(".*.*.*.*.*Thank you for purchasing!.*.*.*.*.*\n");

}
}