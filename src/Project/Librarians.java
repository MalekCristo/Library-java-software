
package Project;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class Librarians {
    
    private Connection connection = null;
	private Statement statement = null;
	private ResultSet resultSet = null;

	private int Lib_ID;
	private String name;
        private String password;
        private String phone;
	private String email;
	private int age;
        private String year;
        private double salary;

    public int getLib_ID() {
        return Lib_ID;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }


    public int getAge() {
        return age;
    }

    public String getYear() {
        return year;
    }

    public double getSalary() {
        return salary;
    }
 public void connection(String Query) {
		
		try {
			connection = DriverManager.getConnection("jdbc:derby://localhost:1527/Library","user1","123");
			statement = connection.createStatement();
			resultSet = statement.executeQuery(Query);
			while (resultSet.next()) {
				Lib_ID = resultSet.getInt(1);
                                name = resultSet.getString(2);
                                email = resultSet.getString(3);  
                                password = resultSet.getString(4);
				age = resultSet.getInt(5);
                                 year = resultSet.getString(6);
                                salary = resultSet.getInt(7);


			}
			resultSet.close();
			statement.close();
			connection.close();
		}
		catch (SQLException SQLe) {
			System.out.println("Librarian.java\n" + SQLe.toString());
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
			System.out.println("Librarian.java\n" + SQLe.toString());
		}
	}
    
        public void setEmail(String email) {
        boolean validation = false;
        validation = validateEmail(email);
        if (validation = true) {
            this.email = email;
            
        }
    }
        

    
    public boolean validateEmail(String email) {
        boolean res = false;
        Pattern pattern = Pattern.compile("(\\S.*\\S)(@)(\\S.*\\S)(.\\S[a-z]{2,3})");
        Matcher matcher = pattern.matcher(email);
        if (email.matches("(\\S.*\\S)(@)(\\S.*\\S)(.\\S[a-z]{2,3})")) {
            res = true;
        } else {
            System.out.print("Wrong email");
        }
        return res;
    }
       public void setPhone(String phone) {
        boolean validation = false;
        if (isValidMobileNo(phone)) {
            this.phone = phone;
        } else {
            System.out.println("Entered mobile number is invalid.");
        }
    }
       public static boolean isValidMobileNo(String phone) {

        Pattern ptrn = Pattern.compile("(0/91)?[7-9][0-9]{9}");
        Matcher match = ptrn.matcher(phone);
        return (match.find() && match.group().equals(phone));
    }
       
       

        public static boolean isStrongPass(String password){
            if( password.length() >= 8) {
             //if it contains one digit
             if( password.matches("(?=.*[0-9]).*") ){
             
             //if it contains one lower case letter
             if( password.matches("(?=.*[a-z]).*") ){
 		//if it contains one upper case letter
                  if( password.matches("(?=.*[A-Z]).*") ){
		//if it contains one special c
                      if( password.matches("(?=.*[~!@#$%^&*()_-]).*") ){
                          return true;
                      }
                }
              }
            }}
            
            return false;
        }
       
       
    
}
