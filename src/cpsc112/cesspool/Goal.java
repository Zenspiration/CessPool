package cpsc112.cesspool;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Goal {
	//declare fields
	protected String name, details;
	protected int value; //in cents
	protected Calendar dateDue;
	protected DateFormat dateFormat;
	protected boolean done; //true when marked done
	
	//create a new goal
	public Goal(String name, String details){ //pass null if no details
		setName(name);
		setDetails(details);
		done = false;
		//Gets date goal was created and sets due date to end of that day
		dateFormat = new SimpleDateFormat("MMM-dd-yyyy");
		dateDue = new GregorianCalendar();
		
		//sets due time to 11:59
//		dateDue.set(Calendar.HOUR_OF_DAY, 23);
//		dateDue.set(Calendar.MINUTE, 59);
		
		this.value = 50; //add code to calculate goal value based on cycle length, cycle value, and number of goals for the day
	}
	
	public Goal(String goalID){
		//add code to get existing goal info from database through goal ID
	}
	
	public void printGoal(){
		System.out.println("Name: " + getName());
		System.out.println("Due: " + getDateDue());
		System.out.println("Details: " + getDetails());
		System.out.println();
	}
	
	//gets name of goal
	public String getName(){
		return name;
	}
	
	
	//sets name of goal
	public void setName(String name){
		this.name = name;
	}
	
	//gets details of goal
	public String getDetails(){
		return details;
	}
	
	//sets details of goal
	public void setDetails(String details){
		this.details = details;
	}
	
	//returns due date in string format
	public String getDateDue(){
		return dateFormat.format(dateDue.getTime());
	}
}
