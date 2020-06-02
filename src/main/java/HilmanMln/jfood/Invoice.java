package HilmanMln.jfood;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.text.*;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.regex.*;
import java.util.*;

/**
 * Kelas Invoice merupakan bagian dari JFood yang menangani data pembelian yang terdiri dari id, idfood, date, totalPrice, custsomer
 * Class adalah “blueprint” atau “cetakan” untuk menciptakan suatu  object.
 * @author Hilman Maulana 1706985975
 * @version 27 Februari 2020
 **/
public abstract class Invoice
{
    //variable yang digunakan pada class Invoice
    private int id;
    //private int idFood;
    private ArrayList<Food> foods;
    private Calendar date;
    protected int totalPrice;
    private Customer customer;
    //private PaymentType paymentType;
    private InvoiceStatus invoiceStatus;

    private SimpleDateFormat tanggal = new SimpleDateFormat("dd MMMM yyyy");

    public Invoice(int id, ArrayList<Food> foods, Customer customer)
    {
        this.id = id;
        this.foods = foods;
        Calendar now = Calendar.getInstance();
        this.date = now;
        this.customer = customer;
        this.invoiceStatus = InvoiceStatus.Ongoing;
    }

    /**
     * @return nilai yang dikembalikan yaitu id
     */
    public int getId()
    {
        return id;
    }

    /**
     * @return nilai yang dikembalikan yaitu idFood
     */
    public ArrayList<Food> getFoods()
    {
        return foods;
    }

    /**
     * @return nilai yang dikembalikan yaitu date
     */
    public Calendar getDate()
    {
        return date;
    }

    /**
     * @return nilai yang dikembalikan yaitu totalPrice
     */
    public int getTotalPrice()
    {
        return totalPrice;
    }

    /**
     * @return nilai yang dikembalikan yaitu customer
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

    public void setId(int id)
    {
        this.id = id;
    }

    public void setFoods(ArrayList<Food> foods)
    {
        this.foods = foods;
    }

    public void setDate(Calendar date)
    {
        this.date = date;
    }

    public void setDate(int year, int month, int dayOfMonth)
    {
        date = new GregorianCalendar (year, month, dayOfMonth);
    }

    public abstract void setTotalPrice();

    public void setCustomer(Customer customer)
    {
        this.customer = customer;
    }

    // public abstract void setPaymentType();

    public void setInvoiceStatus(InvoiceStatus status)
    {
        this.invoiceStatus = status;
    }

    public abstract String toString();
}