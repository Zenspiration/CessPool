package cpsc112.cesspool;

import java.util.ArrayList;

public class Member {
	protected String name;
	protected boolean isLeader;
	protected ArrayList<Goal> goals;
	protected int dailyEarning, cycleEarning, totalPool;

	public Member(){
		this.isLeader = false;
		this.name = new String();
		this.goals = new ArrayList<Goal>();
	}
	
	protected String getName(){
		return name;
	}
	
	protected void setName(String name){
		this.name = name;		
	}
	
	protected void addGoal(Goal newGoal){
		this.goals.add(newGoal);
	}
}
