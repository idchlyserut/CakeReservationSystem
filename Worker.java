//Program Bakery 3.0

import java.util.Date;
import java.util.ArrayList;
import java.util.*;

public class Worker extends Person // Superclass method
{
	private String prof;
	public Worker(){
		prof="";}

	public Worker(String name, String contactNo, String prof){
		super(name, contactNo);
		this.prof=prof;

	}
	public String getProf()
	{return prof;}

	public void setProf(String prof_) { prof=prof_;}

	public String toString(){
		return ("Name: " + getName() +"\tContact Num: " +getContact()+ "\t Profession: " + getProf() ); //Overriding toString method
	}
}
