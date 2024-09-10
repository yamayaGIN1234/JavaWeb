package bach.dev;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MainApp {
	static final String DB_URL = "jdbc:mysql://localhost/shop";
    static final String DB_USER = "root";
    static final String DB_PASS = "";

    public static void main(String[] args) {
        // Kết nối đến cơ sở dữ liệu MySQL
        try {
            // Nạp driver JDBC của MySQL
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Tạo kết nối đến cơ sở dữ liệu
            try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS)) {
                System.out.println("Kết nối thành công");
            }
        } catch (ClassNotFoundException e) {
            System.out.println("Không tìm thấy driver JDBC.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Kết nối không thành công.");
            e.printStackTrace();
        }// TODO Auto-generated method stub
		final String DB_URL = "JDBC:mysql://localhost:3306/shop";
		final String USER = "root";
		final String PASS = "";
		// Kết nối đến cơ sở dữ liệu MySQL
		 try {
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            DriverManager.getConnection(DB_URL, USER, PASS);
	            System.out.println("Xampp");
	        } catch (Exception e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }
    }
}
