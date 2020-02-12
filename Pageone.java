package busbooking;
import java.sql.*;
import java.util.*;                                                               
public class Pageone  {                                              
                                                                             
 Login obj=new Login();                                                      
                                                                             
     void login1() throws ClassNotFoundException, SQLException                                                     
  {    

      
System.out.println("-----------LoginOpen----------");                     
Scanner e=new Scanner(System.in); 
	 Connection con = null;
     PreparedStatement pstmt = null;
     ResultSet rs = null;
     Class.forName("com.mysql.jdbc.Driver");
    con = DriverManager.getConnection("jdbc:mysql://localhost/bus?useSSL=true","root","surya");
                                                                       
    System.out.println("enter the EmailId");                                  
                                                                               
    String a=e.nextLine();                                                    
                                                                                 
    System.out.println("enter the password");                                 
                                                                                 
    String b=e.nextLine();                                                    
    String query = "SELECT * FROM bus";
    pstmt = con.prepareStatement(query);
    rs = pstmt.executeQuery();                                                                         
    String a1=null,b1=null,a2=null;;  
    while(rs.next()) {
    a1= rs.getString("emailid");
    b1 =rs.getString("password");
	 
      if(a.equals(a1)  && b.equals(b1)) {     
    	  
      System.out.println("Access Granted! Welcome !");    
 	       Trip.ready();
 	       break;
       }                                                                      
 	   else                                                                      
 	   {                                                                         
 	   System.out.println("invalid email & password");  
 	   login1();
 	   break;
 	   }                                                                         
     
    }
    rs.close();
	pstmt.close();
	con.close();
    }                                                                        
                                                                                
                                                                             
   void signup() throws SQLException, ClassNotFoundException                                                             
  {                                                                          
   System.out.println("----------SignUp-------------");                    
                                                                             
     Scanner f=new Scanner(System.in);                                       
     	                                                                         
     System.out.println("Enter the username");                               
                                                                             
     obj.setUsername(f.nextLine());                                          
                                                                                                                  
     
     System.out.println("enter the Phonenumber");                            
                                                                                  
     obj.setPhonenumber(f.nextLine());                                       
                                                   
 	 Scanner e=new Scanner(System.in);
  	
     System.out.println("enter the EmailId");
       
      obj.setEmail(e.nextLine()); 
	
      System.out.println("enter the password");
    
      obj.setPassword(e.nextLine()); 
      Connection con = null;
      PreparedStatement pstmt = null;
      ResultSet rs = null;
      Class.forName("com.mysql.jdbc.Driver");
          con = DriverManager.getConnection("jdbc:mysql://localhost/bus?useSSL=true","root","surya");
          String query = "insert into bus(username,phonenumber,emailid,password)values (?,?,?,?)";
          pstmt = con.prepareStatement(query,Statement.RETURN_GENERATED_KEYS);
          pstmt.setString(1, obj.getUsername());
          pstmt.setString(2, obj.getPhonenumber());
          pstmt.setString(3, obj.getEmail());
          pstmt.setString(4, obj.getPassword());
          pstmt.executeUpdate();
          rs = pstmt.getGeneratedKeys();
   
        rs.close();
        pstmt.close();
        con.close();       
       login1();   
        	  
          

  }
                                        
       	                                                                         
                                                               
                                                                             
                                                                                  
                                                                                  
public static void main(String[] args) throws SQLException, ClassNotFoundException {                                      
                                                                         
                                                                                  
Scanner in=new Scanner(System.in);                                                                                                          
 System.out.println("login press (1)|| create account press (2)");                                                                                     
 
        Pageone start=new Pageone();                                              
        int i=in.nextInt();                                                       
        if(i==1)                                                                  
        {                                                                         
        start.login1();                                                        
                                                                                  
         }                                                                        
        else if (i==2)                                                            
        {                                                                         
        start.signup();                                                       
        }                                                                         
        else                                                                      
        {                                                                         
        System.out.println("chose valid key");                                
        }                                                                         
                                                                                  
                                                                                  
                                                                     
}                                                                                 
                                                                                  
}   