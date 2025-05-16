package week3.home_assignments;

public class JavaConnection extends MySqlConnection implements DatabaseConnection {
	public void disconnect() {
		// TODO Auto-generated method stub
		System.out.println("Disconnect");
		
	}
	
	public void executeUpdate() {
		// TODO Auto-generated method stub
		System.out.println("Execute update");
		
	}
	
	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("Connect");
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaConnection database = new JavaConnection();
		database.connect();
		database.disconnect();
		database.executeUpdate();
		database.executeQuery();
	
}
}
