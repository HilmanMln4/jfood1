import java.util.Calendar;
import java.util.GregorianCalendar;
import java.text.*;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.regex.*;

/**
 * Kelas Customer merupakan bagian dari JFood yang menangani data pembeli yang terdiri dari id, nama, email, password, joindate
 * Class adalah “blueprint” atau “cetakan” untuk menciptakan suatu  object.
 * @author Hilman Maulana 1706985975
 * @version 27 Februari 2020
**/

public class Customer
{
    // instance variables - replace the example below with your own
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
        this.id=id;
        this.name=name;
        setPassword(password);
        setEmail(email);
        this.joinDate=joinDate;
    }

    public Customer(int id, String name, String email, String password, int year, int month, int dayOfMonth)
    {
        this.id=id;
        this.name=name;
        setPassword(password);
        setEmail(email);
        joinDate=new GregorianCalendar(year, month, dayOfMonth);
    }
    
    public Customer(int id, String name, String email, String password)
    {
        this.id=id;
        this.name=name;
        setPassword(password);
        setEmail(email);
        this.joinDate=Calendar.getInstance();
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
        this.id=id;
    }
    
    /**
     * method setter Name akan set sebuah nilai sesuai dengan variable
     * Setter Name untuk Customer
     */
    public void setName(String name)
    {
        this.name=name;
    }
    
    /**
     * method setter Email akan set sebuah nilai sesuai dengan variable
     * Setter Email untuk Customer
     */
    public void setEmail(String email)
    {
        String regex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        if(matcher.matches())
        {
            this.email=email;
        }
        else 
        {
            this.email="";
        }
    }
    
    /**
     * method setter Password akan set sebuah nilai sesuai dengan variable
     * Setter Password untuk Customer
     */
    public void setPassword(String password)
    {
        String passwordRegex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{8,}$";
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
    }
    
    /**
     * method setter JoinDate akan set sebuah nilai sesuai dengan variable
     * Setter JoinDate untuk Customer
     */
    public void setJoinDate(Calendar joinDate)
    {
        this.joinDate=joinDate;
    }  
    
    public void setJoinDate(int year, int month, int dayOfMonth)
    {
         joinDate = new GregorianCalendar (year, month, dayOfMonth);
    }
    
    public String toString()
    {
       String hasil = "";
       if(joinDate != null)
       {
           Date tanggal = joinDate.getTime();
           SimpleDateFormat format1= new SimpleDateFormat("dd-MM-yyyy");
           String tanggal1=format1.format(tanggal);
           hasil= "ID:"+id+"\nName: "+name+"\nEmail: "+email+"\nPassword: "+password+"\nJoin Date: "+tanggal1+"\n";;
           
       }
       else
       {    
           hasil="ID:"+id+"\nName: "+name+"\nEmail: "+email+"\nPassword: "+password+"\n";
       }
       
       return hasil;
    }

    /* /**
     * Untuk mencetak data sesuai dengan value dalam kurung
     
    public void printData()
    {
        System.out.println(getName());
    }*/
}
