package jdbcproj;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Test {

	private final  static String INSERT_QUERY = "insert into test.product(id,name,price,description,quantity) values(?,?,?,?,?)";
	 
	private final static String DB_URL = "jdbc:mysql://localhost:3306";
	
	public static void add(Product product) {
		
		try {
			
			// step 1 establish the connection
		Connection connection =	DriverManager.getConnection(DB_URL, "root", "Amit@4510");
			
		
		// step 2 create a prepared statement
		
		PreparedStatement preparedStatement = connection.prepareStatement(INSERT_QUERY);
		
		preparedStatement.setInt(1, product.getId());
		preparedStatement.setString(2, product.getName());
		preparedStatement.setFloat(3, product.getPrice());
		preparedStatement.setString(4, product.getDescription());
		preparedStatement.setInt(5, product.getQuantity());
		
	//step 3 execute the query
		int noOfRows = preparedStatement.executeUpdate();
		if(noOfRows == 1)
		{
			System.out.println("record is added successfully");
		}
		
		// step 4 close the connection 
		     
		         connection.close();
		
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         add(new Product(24,"oneplus buds" , 150, "ear buds" , 40));   
         add(new Product(25,"oneplus buds" , 150, "ear buds" , 40));   
	}

}
