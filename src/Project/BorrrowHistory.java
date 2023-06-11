
package Project;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BorrrowHistory {
        private Connection connection = null;
	private Statement statement = null;
	private ResultSet resultSet = null;

	private int bookID;
	private int studentID;
	private Date BorrowingDate;
	private Date ReturnDate;
        private Date ActualReturnDate;
        private int penalty;
        private boolean emailBefore2Days;
        private boolean emailBefore7Days;

    public BorrrowHistory() {
    }

    public int getBookID() {
        return bookID;
    }

    public int getStudentID() {
        return studentID;
    }

    public Date getBorrowingDate() {
        return BorrowingDate;
    }

    public Date getReturnDate() {
        return ReturnDate;
    }

    public Date getActualReturnDate() {
        return ActualReturnDate;
    }

    public int getPenalty() {
        return penalty;
    }

    public boolean isEmailBefore2Days() {
        return emailBefore2Days;
    }

    public boolean isEmailBefore7Days() {
        return emailBefore7Days;
    }
        public void connection() {
		
		try {
			connection = DriverManager.getConnection("jdbc:derby://localhost:1527/Library","user1","123");
			statement = connection.createStatement();
			resultSet = statement.executeQuery("SELECT * FROM BorrowHistory");
			while (resultSet.next()) {
				bookID = resultSet.getInt("BookID");
				studentID = resultSet.getInt("StudentID");
                                BorrowingDate = resultSet.getDate("BorrowingDate");		
                                ReturnDate = resultSet.getDate("ReturnDate");
                                ActualReturnDate = resultSet.getDate("ActualReturnDate");
                                penalty=resultSet.getInt("penalty");
                                emailBefore2Days=resultSet.getBoolean("EmailBefore2Days");
                                emailBefore7Days=resultSet.getBoolean("EmailBefore7Days");

			}
			resultSet.close();
			statement.close();
			connection.close();
		}
		catch (SQLException SQLe) {
			System.out.println("BorrowHistory.java\n" + SQLe.toString());
		}
	}
        
        
        public void update(String Query) {
		
		try {
			connection = DriverManager.getConnection("jdbc:derby://localhost:1527/Library","user1","123");
			statement = connection.createStatement();
			statement.executeUpdate(Query);
			statement.close();
			connection.close();
		}
		catch (SQLException SQLe) {
			System.out.println("BorrowHistory.java\n" + SQLe.toString());
		}
	}

}
