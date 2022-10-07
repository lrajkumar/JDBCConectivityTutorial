import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JBConnect2 {
	public static void main(String[] args) throws SQLException {
		  
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/databaseconnection", "root", "root");//Establishing connection
		System.out.println("Connected With the database successfully");
		
		  }{
		  System.out.println("Error while connecting to the database"); }
		 
		//Creating PreparedStatement object
		PreparedStatement preparedStatement=connection.prepareStatement("insert into Student values(?,?,?)");
		//Setting values for Each Parameter
		preparedStatement.setString(1,"1");
		         preparedStatement.setString(2,"Mehtab");
		         preparedStatement.setString(3, "Computer");
		        
		         //Executing Query
		         preparedStatement.executeUpdate();
		         System.out.println("data inserted successfully");
		} 
       {
			
		System.out.println("Error while connecting to the database");
		}
		}

