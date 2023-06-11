
package Project;

import java.sql.*;



public class Books {
    

	private Connection connection = null;
	private Statement statement = null;
	private ResultSet resultSet = null;

	private int bookID;
	private String title;
	private String author;
	private String publisher;
	private String edition;
	private String category;
	private String subcategory;
	private int pages;
	private int quantity;
	private int numberOfBorrowedBooks;
        private Date pub_date;
	private boolean availble;

	public Books() {
	}

	public int getBookID() {
		return bookID;
	}

	

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public String getPublisher() {
		return publisher;
	}
	public String getCategory() {
		return category;
	}

	public String getSubCategory() {
		return subcategory;
	}

	public String getEdition() {
		return edition;
	}

	public int getPages() {
		return pages;
	}

	
	public int getQuantity() {
		return quantity;
	}
        
         public Date getPubDate() {
		return pub_date;
	}

	public int getNumberOfBorrowedBooks() {
		return numberOfBorrowedBooks;
	}
       

	public boolean getAvailble() {
		return availble;
	}

	public void connection(String Query) {
		
		try {
			connection = DriverManager.getConnection("jdbc:derby://localhost:1527/Library","user1","123");
			statement = connection.createStatement();
			resultSet = statement.executeQuery(Query);
			while (resultSet.next()) {
				bookID = resultSet.getInt(1);
				title = resultSet.getString(2);
				author = resultSet.getString(3);
				publisher = resultSet.getString(4);
				edition = resultSet.getString(5);
                                category = resultSet.getString(6);
                                subcategory = resultSet.getString(7);
				pages = resultSet.getInt(8);
				quantity = resultSet.getInt(9);
                                pub_date =resultSet.getDate(10);
				numberOfBorrowedBooks = resultSet.getInt(11);
				availble = resultSet.getBoolean(12);
			}
			resultSet.close();
			statement.close();
			connection.close();
		}
		catch (SQLException SQLe) {
			System.out.println("Books.java\n" + SQLe.toString());
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
			System.out.println("Books.java\nError:" + SQLe.toString());
		}
	}
}
    
    
    

