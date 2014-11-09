package cpsc112.cesspool;

import java.util.ArrayList;
import java.util.GregorianCalendar;

public class Pool {
	private String name, poolID;
	private GregorianCalendar startDate, endDate;
	private ArrayList<Member> members; //list of members

	public Pool(String name, GregorianCalendar startDate, GregorianCalendar endDate){
		//initializes fields
		this.name = name;
		this.poolID = "000001"; //change to create unique ID for each new pool
		this.members = new ArrayList<Member>();
		this.startDate = startDate;
		this.endDate = endDate;
		
		//add code to set database values to those from above
		
	}
	
	public Pool(String poolID){
		//get values from database from existing pool using it's ID
	}
	
	//gets name of pool
	public String getName(){
		return name;
	}
	
	//sets name of pool
	public void setName(String name){
		this.name = name;
	}
	
	public ArrayList<Member> getMembers(){
		return new ArrayList<Member>(); //change to create arraylist of members from database query (for loop through each member entry?)
	}
	
	//adds new member to pool
	public void addMember(Member newMember){ //e.g. addMember(new Member(00002)); will add userID 00002 as a member of the pool
		this.members.add(newMember);
		//add code to add the member to the pool database
	}
}
