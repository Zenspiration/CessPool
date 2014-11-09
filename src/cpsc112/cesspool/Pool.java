package cpsc112.cesspool;

import java.util.ArrayList;

public class Pool {
	private String name;
	private ArrayList<Member> members;

	public Pool(){
		members = new ArrayList<Member>();
	}
	
	//gets name of pool
	public String getName(){
		return name;
	}
	
	//sets name of pool
	public void setName(String name){
		this.name = name;
	}
	
	//adds new member to pool
	public void addMember(Member newMember){
		this.members.add(newMember);
	}
	
	public boolean isMember(String name){
		for (Member m: members){
			if (m.getName().equals(name)){
				return true;
			}
		}
		return false;
	}
}
