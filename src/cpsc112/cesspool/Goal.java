package cpsc112.cesspool;

import java.util.*;
import java.text.*;

public class Goal {
	//declare fields
	protected String name, details;
	protected double value;
	protected Date dueDate;
	protected DateFormat dateFormat;
	protected boolean done;
	
	//constructor for class 'Goal'
	public Goal(){
		dateFormat = new SimpleDateFormat("MMM-dd-yyyy");
	}
	
	//gets name of goal
	private String getName(){
		return name;
	}
	
	//sets name of goal
	private void setName(){
		
	}

}
