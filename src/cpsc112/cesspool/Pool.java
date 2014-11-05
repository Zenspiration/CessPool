package cpsc112.cesspool;

import java.util.ArrayList;

public class Pool {
	private String name;
	private ArrayList<Member> members;

	public Pool(){
		
	}
	
	//gets name of pool
	private String getName(){
		return name;
	}
	
	//sets name of pool
	private void setName(String name){
		this.name = name;
	}
	
	//adds new member to pool
	private void addMember(Member newMember){
		this.members.add(newMember);
	}
}
