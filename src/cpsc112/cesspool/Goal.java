package cpsc112.cesspool;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Goal {
	//declare fields
	protected String name, details;
	protected int value;
	protected Calendar dateDue;
	protected DateFormat dateFormat;
	protected boolean done;
	
	//constructor for class 'Goal'
	public Goal(String name){
		setName(name);
		setDetails(null);
		//Gets date goal was created and sets due date to end of that day
		dateFormat = new SimpleDateFormat("MMM-dd-yyyy");
		dateDue = new GregorianCalendar();
//		dateDue.set(Calendar.HOUR_OF_DAY, 23);
//		dateDue.set(Calendar.MINUTE, 59);
		
	}
	
	//alternate constructor if details are provided
	public Goal(String name, String details){
		this(name);
		setDetails(details);
	}
	
	public static void main(String[] args){
		Goal g1 = new Goal("New Goal", "just a random goal");
		g1.printGoal();
		
		Goal g2 = new Goal("New Goal, no description");
		g2.printGoal();
		
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
	
	public String getDateDue(){
		return dateFormat.format(dateDue.getTime());
	}
}
