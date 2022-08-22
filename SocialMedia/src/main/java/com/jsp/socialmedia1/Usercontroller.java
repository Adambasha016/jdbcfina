package com.jsp.socialmedia1;
import com.jsp.socialmedia.*;

import java.util.Scanner;

import com.jsp.socialmedia.User;
import com.jsp.socialmedia.UserDriver;

public class Usercontroller {

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
    			System.out.println("enter the name");
    			user.setName(sc.next());
    			System.out.println("enter the email");
    			user.setEmail(sc.next());
    			System.out.println("enter the password");
    			user.setPassword(sc.next());
    			System.out.println("enter the Mediatype");
    			user.setMediaType(sc.next());
    		   System.out.println("enter the phone number");
    		   user.setPhonenumber(sc.next());
    		   driver.saveUser(user);
    		   
    		}
    	
    	
    		break;
    		case 2:{
    			User user = new User();
    			System.out.println("enter the id ");
    			user.setId(sc.nextInt());
    			System.out.println("enter the name");     
    			user.setName(sc.next());
    			System.out.println("enter the email");
    			user.setEmail(sc.next());
    			System.out.println("enter the password");
    			user.setPassword(sc.next());
    			System.out.println("enter the Mediatype");
    			user.setMediaType(sc.next());
    		   System.out.println("enter the phone number");
    		   user.setPhonenumber(sc.next());
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
    	
    	
