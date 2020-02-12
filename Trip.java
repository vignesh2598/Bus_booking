package busbooking;
import java.util.*;
public class Trip extends Seat
{
	
 
	static void ready()
	{
  System.out.println("START YOUR TRIP");
	Scanner t=new Scanner(System.in);
	
	System.out.println("From");
	System.out.println("----");
	
	String from=t.nextLine();
	
    System.out.println("To");
    System.out.println("--");
    
    String to=t.nextLine();
    System.out.println("From- "+from+" to- "+to);
    System.out.println("");
    
     System.out.println("-----------chose Bus Type-----------");
     
     Scanner in=new Scanner(System.in);
     try {
     	System.out.println("Ac press 1"); 
			Thread.sleep(100);
			System.out.println("Non Ac press 2"); 
		} catch (InterruptedException e) {
			e.printStackTrace(); 
		}
    
     int i=in.nextInt();
     if(i==1)
     {
    	 try {
    	     	System.out.println("sleeper press 1"); 
    				Thread.sleep(100);
    				System.out.println("semi sleeper press 2"); 
    			} catch (InterruptedException e) {
    				e.printStackTrace(); 
    			}
    	 int j=in.nextInt();
    	 if(j==1)
    	 {
    		 lowerSleeper();
    		 upperSleeper();
    		  book();
    	 }
    	 else if(i==2)
    	 {
    		 seat();
    		 book();    		 
    	 }
    	 else
    	 {
    		 System.out.println("enter valid key");
    		 ready();
    	 }
     
      }
     else if (i==2)
     {
    	 try {
 	     	System.out.println("sleeper press 1"); 
 				Thread.sleep(100);
 				System.out.println("semi sleeper press 2"); 
 			} catch (InterruptedException e) {
 				e.printStackTrace(); 
 			}
    	 int s=in.nextInt();
    	 if(i==1)
    	 {
    		 lowerSleeper();
    		 upperSleeper();
    	      book();
    	 }
    	 else if(i==2)
    	 {
    		 seat();
    		book();
    	 }
    	 else
    	 {
    		 System.out.println("enter valid key");
    		 ready();
    	 }
     
     }
     else 
     {
     	System.out.println("chose valid key"); 
     ready();
     }

}
}
