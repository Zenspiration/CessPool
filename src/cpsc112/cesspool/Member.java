package cpsc112.cesspool;

import java.util.ArrayList;

public class Member {
	//variables that belong to each 'member'
	protected String userName, userID; //username, unique ID
	protected boolean maker; //is leader (true/false)
	protected ArrayList<Goal> goals; //collection of goals for the user
	protected int dailyEarning, cycleEarning; //money earned that day, money earned during cycle

	public Member(String userID){
		this.goals = new ArrayList<Goal>();
		//add code here to set values of above fields based on properties of the circle
		
		//add code here to create database entry for member
		//i.e. store the above variables in the database
	}
	
	public boolean isMaker(){
		return maker; //change to return true/false based on query with database
	}
	
	public void setMaker(boolean b){
		maker = b; //set whether or not this member is the maker of the circle
		//add code to set database value also equal to parameter
	}
	
	public String getName(){
		return userName; //change to return userName based on query with database
	}
	
	public void setName(String name){
		this.userName = name;		
	}
	
	public void addGoal(Goal newGoal){
		this.goals.add(newGoal); //add goal to collection of goals
		//add code to also add the goal to database
	}
	
	public void removeDoneGoals(){
		//goes through collection of goals to remove goals marked as 'done'
		for (Goal g : goals){
			if (g.done == true){
				goals.remove(g);
				//add code to also remove from database
			}
		}
	}
}
