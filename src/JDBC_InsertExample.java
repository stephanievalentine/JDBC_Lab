//STEP 1. Import required packages
import java.sql.*;

/**
 * This is a poorly organized class! Refactor to make it better!
 * @author Stephanie Valentine
 */
public class JDBC_InsertExample {
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

			// STEP 4: Execute an insert statement
			stmt = conn.createStatement();
			String insert_sql = "INSERT INTO characters (name, universe, inVersion1, inVersion4, notes) values"
					+ "(\"Tarzan\", \"Disney\", 0, 0, \"Tarzan loves Jane\");";
			stmt.executeUpdate(insert_sql, Statement.RETURN_GENERATED_KEYS);

			// STEP 5: Process the results
			ResultSet rs = stmt.getGeneratedKeys();
			int insert_id = -1;
			if (rs.next()) {
				insert_id = rs.getInt(1);
			}
			System.out.println("I just inserted a new character with an ID of: " + insert_id);

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
