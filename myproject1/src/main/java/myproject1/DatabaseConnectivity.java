package myproject1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DatabaseConnectivity {
   private  Connection con;
   private  Statement st;
   
   public  void connectivity() throws Exception  {
	  
	   try {
	   con =DriverManager.getConnection("jdbc:mysql://localhost:3306/organization?user=root","root","root");
	   st = con.createStatement();
	   ResultSet result = st.executeQuery("select * from Employee");
	   System.out.println("The fetched Result from table is :");
	   System.out.println();
	   while(result.next())
	   {
		   System.out.print(result.getInt(1)+" ");
		 //  System.out.println();
		   System.out.print(result.getString(2)+" ");
		  // System.out.println();
		   System.out.print(result.getString(3)+" ");
		  // System.out.println();
		   System.out.print(result.getDouble(4));
		   System.out.println(" ");
	   }
} catch(Exception e){
	e.printStackTrace();
	
}finally {
	if(con != null) {
		con.close();
		
	}
}
}
}