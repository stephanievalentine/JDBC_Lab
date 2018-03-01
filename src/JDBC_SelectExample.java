//STEP 1. Import required packages
import java.sql.*;

/**
 * This is a poorly organized class! Refactor to make it better!
 * @author Stephanie Valentine
 */
public class JDBC_SelectExample {
	// STEP 2. Define string constants for database URL and credentials
	static final String DB_URL = "jdbc:mysql://localhost/smash_bros?useSSL=false";
	static final String USER = "root";
	static final String PASS = "myPassword";

	/**
	 * Main function that connects to the database
	 */
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		try {
			// STEP 3: Open a connection
			System.out.println("Connecting to database...");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);

			// STEP 4: Execute a query
			System.out.println("Creating statement...");
			stmt = conn.createStatement();
			String sql = "SELECT * FROM characters;";
			ResultSet rs = stmt.executeQuery(sql);

			// STEP 5: Extract data from result set & display values
			while (rs.next()) {

				// Retrieve by column name
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String universe = rs.getString("universe");
				boolean inVersion1 = rs.getBoolean("inVersion1");
				boolean inVersion4 = rs.getBoolean("inVersion4");
				String notes = rs.getString("notes");

				// create character object
				Character c = new Character(id,name,universe,inVersion1,inVersion4,notes);
				
				// Display values
				System.out.println(c);
			}
			// STEP 6: Clean-up environment
			rs.close();
			stmt.close();
			conn.close();
		} catch (SQLException se) {
			// Handle errors for JDBC
			se.printStackTrace();
		} catch (Exception e) {
			// Handle errors for Class.forName
			e.printStackTrace();
		} finally {
			//finally block used to close resources
		      try{
		         if(stmt!=null)
		            conn.close();
		      }catch(SQLException se){
		      }// do nothing
		      try{
		         if(conn!=null)
		            conn.close();
		      }catch(SQLException se){
		         se.printStackTrace();
		      }//end finally try
		}

		System.out.println("Goodbye!");
	}// end main
}// end class