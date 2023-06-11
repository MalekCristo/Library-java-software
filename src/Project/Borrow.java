
package Project;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import javax.mail.MessagingException;
import Project.Javamail;

public class Borrow {
        private Connection connection = null;
	private Statement statement = null;
	private ResultSet resultSet = null;

	private int bookID;
	private int studentID;
	private Date BorrowingDate;
	private Date ReturnDate;
    

  
        
	public Borrow() {
	}

	public int getBookID() {
		return bookID;
	}

	public int getStudentID() {
		return studentID;
	}

	public Date getBorrowedDates() {
		return BorrowingDate;
	}

	public Date getReturnDate() {
		return ReturnDate;
	}

	public void connection(String SQL) {
		
		try {
			connection = DriverManager.getConnection("jdbc:derby://localhost:1527/Library","user1","123");
			statement = connection.createStatement();
			resultSet = statement.executeQuery(SQL);
			while (resultSet.next()) {
				bookID = resultSet.getInt("BookID");
				studentID = resultSet.getInt("StudentID");
                                BorrowingDate = resultSet.getDate("BorrowingDate");		
                                ReturnDate = resultSet.getDate("ReturnDate");
                               
			}
			resultSet.close();
			statement.close();
			connection.close();
		}
		catch (SQLException SQLe) {
			System.out.println("Borrow.java\n" + SQLe.toString());
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
			System.out.println("Borrow.java\n" + SQLe.toString());
		}
	}
        
        
    public void Emails() throws MessagingException {

        try {
            connection = DriverManager.getConnection("jdbc:derby://localhost:1527/Library", "user1", "123");
            statement = connection.createStatement();
            String SQL = "SELECT * FROM BORROW ";
            resultSet = statement.executeQuery(SQL);
            while (resultSet.next()) {
                int sid =resultSet.getInt("StudentID");
                int bid = resultSet.getInt("BookID");
                BorrowingDate = resultSet.getDate("BorrowingDate");
                int daysleft = daysdue(BorrowingDate);
                if (daysleft == 2) {
                    String SQL2 = "SELECT * FROM Student WHERE Stud_ID =  " + sid;
                    ResultSet resultSet2 = statement.executeQuery(SQL2);
                    String email = resultSet2.getString("EMAIL");
                    Javamail.sendMail(email, 2);
                    
                    String SQL3 = "UPDATE BORROWHISTORY SET EMAILBEFORE2DAYS = true WHERE STUDENTID = " + sid 
                            + " AND BOOKID = " + bid ;
                    ResultSet res= statement.executeQuery(SQL3);

                } else if (daysleft == 7) {
                    String SQL2 = "SELECT * FROM Student WHERE Stud_ID =  " + sid;
                    ResultSet resultSet2 = statement.executeQuery(SQL2);
                    String email = resultSet2.getString("EMAIL");
                    Javamail.sendMail(email, 7);
                    
                    String SQL3 = "UPDATE BORROWHISTORY SET EMAILBEFORE7DAYS = true WHERE STUDENTID = " + sid 
                            + " AND BOOKID = " + bid ;
                    ResultSet res= statement.executeQuery(SQL3);
                }
            }
            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException SQLe) {
            System.out.println("Borrow.java\n" + SQLe.toString());
        }
    }

    public static int daysdue(java.sql.Date datedue) {
        int penalty = 0;
        LocalDate dateBefore = LocalDate.now();

        //calculating number of days in between
        long noOfDaysBetween = ChronoUnit.DAYS.between(dateBefore, datedue.toLocalDate());
        return (int) noOfDaysBetween;
    }

}
