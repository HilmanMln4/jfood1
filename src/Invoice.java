import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.*;
import java.text.*;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.regex.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.lang.reflect.Array;

/**
 * Kelas Invoice merupakan bagian dari JFood yang menangani data pembelian yang terdiri dari id, idfood, date, totalPrice, custsomer
 * Class adalah “blueprint” atau “cetakan” untuk menciptakan suatu  object.
 * @author Hilman Maulana 1706985975
 * @version 27 Februari 2020
**/
public abstract class Invoice
{
    // instance variables - replace the example below with your own
    /** bagian variable
     * Saya menggunakan private karena supaya hanya digunakan oleh masing-masing parameter.
     * Adapun tipe data yang digunakan yaitu int, string, dan tipe data buatan sendiri
     * Kemudian variable yang digunakan yaitu id, idfood, date, totalPrice, custsomer
     */
    private int id;
    private ArrayList<Food> foods;
    private Calendar date;
    protected int totalPrice;
    private Customer customer;
    private InvoiceStatus invoiceStatus;

    /**
     * Constructor for objects of class Invoice
     * Constructor ialah sebuah method yang namanya sama persis dengan nama class-nya
     * Constructor sendiri berfungsi untuk memberikan nilai awal pada sebuah class ketika class tersebut dibuat dalam bentuk objek pada class lain
     * Parameter yang  digunakan yaitu id, idfood, date, customer, dan totalprice.
     */
    public Invoice(int id, ArrayList<Food> foods, Customer customer)
    {
        //this.date=Calendar.getInstance();
        this.id=id;
        this.foods=foods;
        //this.date=date;
        this.customer=customer;
        this.invoiceStatus=invoiceStatus.Ongoing;
        //private PaymentType PAYMENT_TYPE=PaymentType.Cashless
    }
    
    /** 
     * method getter Id akan menampilkan return value sesuai dengan variable yang bersangkutan
     * Getter Id untuk Invoice
     */
    public int getId()
    {
        return id;
    }
    
    /** 
     * method getter IdFood akan menampilkan return value sesuai dengan variable yang bersangkutan
     * Getter IdFood untuk Invoice
     */
    public ArrayList<Food> getFood()
    {
        return foods;
    }
    
    /** 
     * method getter Date akan menampilkan return value sesuai dengan variable yang bersangkutan
     * Getter Date untuk Invoice
     */
    public Calendar getDate()
    {
        return date;
    }
    
    /** 
     * method getter TotalPrice akan menampilkan return value sesuai dengan variable yang bersangkutan
     * Getter TotalPrice untuk Invoice
     */
    public int getTotalPrice()
    {
        return totalPrice;
    }
    
    /** 
     * method getter Customer akan menampilkan return value sesuai dengan variable yang bersangkutan
     * Getter Customer untuk Invoice
     */
    public Customer getCustomer()
    {
        return customer;
    }
    
    public abstract PaymentType getPaymentType();
    
    public InvoiceStatus getInvoiceStatus()
    {
        return invoiceStatus;
    }
    
    /**
     * method setter Id akan set sebuah nilai sesuai dengan variable
     * Setter Id untuk Invoice
     */
    public void setId(int id)
    {
        this.id=id;
    }
    
    /**
     * method setter IdFoods akan set sebuah nilai sesuai dengan variable
     * Setter IdFoods untuk Invoice
     */
    public void setFoods(ArrayList<Food> foods)
    {
        this.foods=foods;
    }
    
    /**
     * method setter Date akan set sebuah nilai sesuai dengan variable
     * Setter Date untuk Invoice
     */
    public void setDate(Calendar date)
    {
        this.date=date;
    }
    
    public void setDate(int year, int month, int dayOfMonth)
    {
        this.date=new GregorianCalendar(year, month-1, dayOfMonth);
    }
    
    /**
     * method setter TotalPrice akan set sebuah nilai sesuai dengan variable
     * Setter TotalPrice untuk Invoice
     */
    public abstract void setTotalPrice();
    
    /**
     * method setter Customer akan set sebuah nilai sesuai dengan variable
     * Setter Customer untuk Invoice
     */
    public void setCustomer(Customer customer)
    {
        this.customer=customer;
    }
      
    public void setInvoiceStatus(InvoiceStatus invoiceStatus)
    {
        this.invoiceStatus=invoiceStatus;
    }
    
    public abstract String toString();
 }

