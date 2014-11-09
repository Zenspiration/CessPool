package cpsc112.cesspool;

import java.util.ArrayList;

public class Member {
	protected String name;
	protected boolean leader;
	protected ArrayList<Goal> goals;
	protected int dailyEarning, cycleEarning, totalPool;

	public Member(String name){
		this.leader = false;
		this.name = name;
		this.goals = new ArrayList<Goal>();
	}
	
	public boolean isLeader(){
		return leader;
	}
	
	public void setLeader(boolean b){
		leader = b;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;		
	}
	
	public void addGoal(Goal newGoal){
		this.goals.add(newGoal);
	}
	
	public void removeDoneGoals(){
		for (Goal g : goals){
			if (g.done == true){
				goals.remove(g);
			}
		}
	}
}
