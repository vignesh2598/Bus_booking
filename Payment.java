package busbooking;

import java.util.Random;
import java.util.Scanner;

public class Payment {
	
	  static void card()
	  {
		  
		try{  
			System.out.println("Enter your card details");
			Scanner b=new Scanner(System.in);
		    System.out.println("Name");
		  
			String o=b.nextLine();
			  
			System.out.println("Card number");
			  
		    String c=b.nextLine();
		    
		    System.out.println("Expire data");
			  
		    String m=b.nextLine();
			    
		    System.out.println("cvv");
			  
		    int e=b.nextInt();
			    
		   
		  
		}
		catch(Exception e)
		{
			System.out.println("Invalid card");
			card();
		}
	  }
		static void otp()
		{    
		  
		int i,len=5,c1=0;
			System.out.println("You OTP is : ");
	        String numbers = "0123456789"; 
	        Random rndm_method = new Random(); 
	  
	        char[] otp = new char[len]; 
	  
	        for ( i = 0; i < len; i++) 
	        { 
	            otp[i] = 
	             numbers.charAt(rndm_method.nextInt(numbers.length())); 
	            System.out.print(otp[i]);
	        }
			Scanner l=new Scanner(System.in);
		    System.out.println("Enter otp");
		    
		    String y=l.nextLine();
		    char c[]=y.toCharArray();
		    for(i=0;i<otp.length;i++)
		    {
		    if(c[i]==otp[i])
		    {	
		    	c1++;
		    }
		    }
		    if(c1==otp.length)
		    {	System.out.println("Transction is succesful!your ticket is booked");
		    }
		    else
		    {
		    	System.out.println("Transction is failed!Try again");
		    	otp();
		    	
		    	
		    }
		    }
		}
	  


