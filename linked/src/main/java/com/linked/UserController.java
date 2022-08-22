package com.linked;
import java.util.*;

public class UserController {

		public static void main(String[] args) throws Exception {
			
	    Scanner sc = new Scanner(System.in );
	    UserDriver driver = new UserDriver();
	    boolean exit = true;
	    while(exit){
	    	System.out.println("press 1 is save the user");
	    	System.out.println("press 2 is update the user");
	    	System.out.println("press 3 is delete the user");
	    	System.out.println("press 4 is get all  the user");
	    	System.out.println("press 5 to exist");
	    	int Choice = sc.nextInt();
	    	switch(Choice) {
	    		case 1: {
	    			User user = new User();
	    			System.out.println("enter the id");
	    			user.setId(sc.nextInt ());
	    			System.out.println("enter the email");
	    			user.setEmail(sc.next());
	    			System.out.println("enter the password");
	    			user.setPassword(sc.next());
	    			System.out.println("enter the phonenumber");
	    			user.setPhonenumber(sc.nextLong());
	    		   System.out.println("enter the sscpercentage");
	    		   user.setSscpercentage(sc.nextDouble());
	    		   System.out.println("enter the intermedite");
	    		   user.setIntermeditepercentage(sc.nextDouble());
	    		   System.out.println("enter the Gradutionpercentage");
	    		   user.setGradutionpercentage(sc.nextDouble());
	    				   driver.saveUser(user);
	    		   
	    		}
	    	
	    	
	    		break;
	    		case 2:{
	    			User user = new User();
	    			System.out.println("enter the id ");
	    			user.setId(sc.nextInt());
	    			System.out.println("enter the email");     
	    			user.setEmail(sc.next());
	    			System.out.println("enter the password");
	    			user.setPassword(sc.next());
	    			System.out.println("enter the phonenumber");
	    			user.setPhonenumber(sc.nextLong());
	    			System.out.println("enter the sscpercentage");
	    			user.setSscpercentage(sc.nextDouble());
	    		   System.out.println("enter the phone intermedite");
	    		   user.setIntermeditepercentage(sc.nextDouble());
	    		   System.out.println("enter the gradutionpercentage");
	    		   user.setGradutionpercentage(sc.nextDouble());   		   
	    		   driver.updateUser(user);
	    			
	    			
	    		}
	    			
	    		break;
	    		case 3:{
	    			System.out.println("enter the id to delete");
	    			int  id = sc.nextInt();
	    			driver .deleteUser(id);
	    			
	    		}
	    		break;
	    		case 4:{
	    			driver.getAllUser();
	    			
	    		}
	    		case 5:{
	    			exit = false;
	    		}
	    		break;
	    		default:
	    			System.out.println("invalid choice");
	    		}
	    }
	    	
	    	
		}
	}