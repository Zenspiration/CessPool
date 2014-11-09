package cpsc112.cesspool;

import java.util.Scanner;

public class CodeTest {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		Pool testPool = new Pool();
		String command = new String();
		
		System.out.println("Welcome to your cesspool");
		
		do{
		
			System.out.println("Enter a command");
			command = in.nextLine();
			
			if (command.equalsIgnoreCase("add member")){
				System.out.println("Enter name of new member");
				testPool.addMember(new Member(in.nextLine()));	
			}
			
			if (command.equalsIgnoreCase("find member")){
				System.out.println("Enter name of existing member");
				String input = in.nextLine();
				if (testPool.isMember(input)){
					System.out.println("This person is a member of your cesspool");
				} else {
					System.out.println("This person is not a member of your cesspool");
				}
			}
			
		
		} while (!command.equals("exit"));
	}

}
