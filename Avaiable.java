package busbooking;
import java.util.*;
public class Avaiable extends Payment {
	 
	 static void book()
	 {
		 System.out.print("Enter the Seat No");
		 Scanner b=new Scanner(System.in);
		 int i=b.nextInt();
		 if(i>0 && i<=30)
		 {
			 if(i==8||i==9||i==11||i==12)
			 {
				System.out.println("Female seat"); 
				 System.out.print("Try again!,");
				book();
			 }
			 else if(i==4||i==16)
				 {
				 System.out.println(" The Seat is Booked select another seat");  
				 System.out.print("Try again!,");
				 book();
				 
				 }
			 else
			 {
				 System.out.println("your seat-"+i+" is blocked,"); 
				 System.out.println(" ");
				 System.out.println("Make a payment within 7 minutes otherwise you lose your seat."); 
			     card();
			     otp();
			     
				 
			 }
			 }
		 }
		

}
