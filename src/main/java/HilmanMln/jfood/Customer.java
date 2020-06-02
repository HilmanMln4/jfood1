package HilmanMln.jfood;
/**
 * Write a description of class Customer here.
 *
 * @author Hilman
 * @version
 * 
 */

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.*;
import java.text.*;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.regex.*;

public class Customer//create class Customer
{
    /** bagian variable
     * Saya menggunakan private karena supaya hanya digunakan oleh masing-masing parameter.
     * Adapun tipe data yang digunakan yaitu int, dan string,
     * Kemudian variable yang digunakan yaitu id, name, email, password, dan joindata
     */
    private int id;
    private String name;
    private String email;
    private String password;
    private Calendar joinDate;

    /**
     * Constructor for objects of class Seller
     * Constructor ialah sebuah method yang namanya sama persis dengan nama class-nya
     * Constructor sendiri berfungsi untuk memberikan nilai awal pada sebuah class ketika class tersebut dibuat dalam bentuk objek pada class lain
     * Parameter yang  digunakan yaitu id, name, email, password, dan joindate.
     */
    public Customer(int id, String name, String email, String password, Calendar joinDate)
    {
        this.id = id;
        this.name = name;
        String emailRegex = "^[\\w&*_~]+(?:\\.[\\w&*_~]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
       Pattern emailPattern = Pattern.compile(emailRegex);
       Matcher emailMatcher = emailPattern.matcher(email);
       
       if(emailMatcher.matches())
       {
           this.email=email;
       }
       else 
       {
           this.email="";
       }
       
       String passwordRegex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{6,}$";
       Pattern passwordPattern = Pattern.compile(passwordRegex);
       Matcher passwordMatcher = passwordPattern.matcher(password);
       
       if(passwordMatcher.matches())
       {
           this.password=password;
       }
       else 
       {
           this.password="";
       }
       
       this.joinDate = joinDate;
 
    }
    
    public Customer(int id, String name, String email, String password, int year, int month, int dayOfMonth)
    {
        this.id = id;
        this.name = name;
        String emailRegex = "^[\\w&*_~]+(?:\\.[\\w&*_~]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
       Pattern emailPattern = Pattern.compile(emailRegex);
       Matcher emailMatcher = emailPattern.matcher(email);
       
       if(emailMatcher.matches())
       {
           this.email=email;
       }
       else 
       {
           this.email="";
       }
       
       String passwordRegex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{6,}$";
       Pattern passwordPattern = Pattern.compile(passwordRegex);
       Matcher passwordMatcher = passwordPattern.matcher(password);
       
       if(passwordMatcher.matches())
       {
           this.password=password;
       }
       else 
       {
           this.password="";
       }
       
       this.joinDate= new GregorianCalendar(year,month,dayOfMonth);
 
    }
    
    public Customer(int id, String name, String email, String password)
    {
       this.id = id;
       this.name = name;
       String emailRegex = "^[\\w&*_~]+(?:\\.[\\w&*_~]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
       Pattern emailPattern = Pattern.compile(emailRegex);
       Matcher emailMatcher = emailPattern.matcher(email);
       
       if(emailMatcher.matches())
       {
           this.email=email;
       }
       else 
       {
           this.email="";
       }
       
       String passwordRegex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{6,}$";
       Pattern passwordPattern = Pattern.compile(passwordRegex);
       Matcher passwordMatcher = passwordPattern.matcher(password);
       
       if(passwordMatcher.matches())
       {
           this.password=password;
       }
       else 
       {
           this.password="";
       }
       
       this.joinDate= Calendar.getInstance();
    }

    /**
     * method getter Id akan menampilkan return value sesuai dengan variable yang bersangkutan
     * Getter Id untuk Customer
     */
    public int getId()
    {
        return id;
    }
    /**
     * method getter Name akan menampilkan return value sesuai dengan variable yang bersangkutan
     * Getter Name untuk Customer
     */
     public String getName()
    {
        return name;
    }

    /**
     * method getter Email akan menampilkan return value sesuai dengan variable yang bersangkutan
     * Getter Email untuk Customer
     */
    public String getEmail()
    {
        return email;
    }

    /**
     * method getter Password akan menampilkan return value sesuai dengan variable yang bersangkutan
     * Getter Password untuk Customer
     */
    public String getPassword()
    {
        return password;
    }

    /**
     * method getter JoinDate akan menampilkan return value sesuai dengan variable yang bersangkutan
     * Getter JoinDate untuk Customer
     */
    public Calendar getJoinDate()
    {
        return joinDate;
    }

    /**
     * method setter Id akan set sebuah nilai sesuai dengan variable
     * Setter Id untuk Customer
     */
    public void setId(int id)
    {
        this.id =id;
    }

    /**
     * method setter Name akan set sebuah nilai sesuai dengan variable
     * Setter Name untuk Customer
     */
    public void setName(String name)
    {
        this.name = name;
    }

    /**
     * method setter Email akan set sebuah nilai sesuai dengan variable
     * Setter Email untuk Customer
     */
    public void setEmail(String email)
    {
        if (java.util.regex.Pattern.matches("(([a-zA-Z0-9&\\*_~]+(\\.?))+)[@]((\\w+)([\\.\\-]?))+", email))
        {
            this.email = email;
        }
        else{
            this.email = null;
            this.email = "";
        }
    }

    /**
     * method setter Password akan set sebuah nilai sesuai dengan variable
     * Setter Password untuk Customer
     */
    public void setPassword(String password)
    {
        String pattern = ".{6,}";
        String pattern1 = "(.*)[a-z]{1,}(.*)";
        String pattern2 = "(.*)[A-Z]{1,}(.*)";
        String pattern3 = "(.*)[0-9]{1,}(.*)";
        
        if (Pattern.matches(pattern, password)&& 
        Pattern.matches(pattern1, password))
        {
            this.password = password;
            System.out.println("You have changed your password successfully");
        }
        else
        {
            this.password = null;
            System.out.println("Invalid password!");
        }
    }

    /**
     * method setter JoinDate akan set sebuah nilai sesuai dengan variable
     * Setter JoinDate untuk Customer
     */
    public void setJoinDate(int year, int month, int dayOfMonth)
    {
        joinDate = new GregorianCalendar (year, month-1, dayOfMonth);
    }
   
    
    public String toString()
    {
       if(joinDate != null)
       {
           return "=========Customer========\n" +
                   "Id              : " +getId() + "\n" +
                   "Name            : " +getName() + "\n"+
                   "Email           : " +getEmail() + "\n"+
                   "Password        : "  +getPassword() + "\n"+
                   "Date            : "  + joinDate.get(Calendar.DAY_OF_MONTH)+"/"+
                   joinDate.get(Calendar.MONTH)+"/"+
                   joinDate.get(Calendar.YEAR);
        }
       else
       {    
           return"ID:  "+id+"\nName: "+name+"\nEmail: "+email+"\nPassword: "+password+"\n";

        }
    }
    
  

}
