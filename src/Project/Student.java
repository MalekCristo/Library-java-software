
package Project;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Student {
    
        private Connection connection = null;
	private Statement statement = null;
	private ResultSet resultSet = null;

	private int studentID;
	private int ID;
	private String name;
	private String email;
        private String phone;
	private String university;
	private int age;
        private int nbooks;
        private int penalty;
	private Date expired;

	public Student() {
	}
	

	public int getStudentID() {
		return studentID;
	}

	public int getID() {
		return ID;
	}

        
	public int getPenalty() {
		return penalty;
	}
        public int getNbooks() {
		return nbooks;
	}
        
        public int getAge() {
		return age;
	}
	
        public String getPhone() {
		return phone;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public String getUniversity() {
		return university;
	}

	
	public Date getExpired() {
		return expired;
	}

	public void connection(String Query) {
		
		try {
			connection = DriverManager.getConnection("jdbc:derby://localhost:1527/Library","user1","123");
			statement = connection.createStatement();
			resultSet = statement.executeQuery(Query);
			while (resultSet.next()) {
				studentID = resultSet.getInt(1);
				name = resultSet.getString(2);
				email = resultSet.getString(3);
                                phone= resultSet.getString(4);
				age = resultSet.getInt(5);
                                university = resultSet.getString(6);
                                nbooks = resultSet.getInt(7);
				

			}
			resultSet.close();
			statement.close();
			connection.close();
		}
		catch (SQLException SQLe) {
			System.out.println("Students.java\n" + SQLe.toString());
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
			System.out.println("Students.java\n" + SQLe.toString());
		}
	}
        
        
            public void setEmail(String email) {
        boolean validation = false;
        validation = validateEmail(email);
        if (validation = true) {
            this.email = email;
        }
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
}
    

