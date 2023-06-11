/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Administrator
 */
public class Person {

    int ID;
    String phone;
    String email;
    String name;

    public Person(int ID, String phone, String email, String name) {
        this.ID = ID;
        this.phone = phone;
        this.email = email;
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        boolean validation = false;
        if (isValidMobileNo(phone)) {
            this.phone = phone;
        } else {
            System.out.println("Entered mobile number is invalid.");
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        boolean validation = false;
        validation = validateEmail(email);
        if (validation = true) {
            this.email = email;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
