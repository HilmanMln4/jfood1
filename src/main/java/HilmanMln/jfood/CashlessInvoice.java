package HilmanMln.jfood;

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
/**
 * Write a description of class CashlessInvoice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CashlessInvoice extends Invoice
{
    // instance variables - replace the example below with your own
    private static final PaymentType PAYMENT_TYPE=PaymentType.Cashless;
    private Promo promo;

    /**
     * Constructor for objects of class CashlessInvoice
     */
    public CashlessInvoice(int id, ArrayList<Food> foods, Customer customer)
    {
        // initialise instance variables
        super(id, foods, customer);
    }

    public CashlessInvoice(int id, ArrayList<Food> foods, Customer customer ,Promo promo)
    {
        super(id, foods, customer /*invoiceStatus*/);
        this.promo=promo;
    }

    @Override
    public PaymentType getPaymentType()
    {
        return PAYMENT_TYPE;
    }
    
    public Promo getPromo()
    {
        return promo;
    } 
       
    public void setPromo(Promo promo)
    {
        this.promo=promo;
    }
    
     public void setTotalPrice() {
         super.totalPrice=0;
         for(Food foods : getFoods())
         {
             super.totalPrice=super.totalPrice+foods.getPrice();
         }
         if(super.totalPrice>=promo.getMinPrice() && promo.getActive()) {
             super.totalPrice = super.totalPrice - promo.getDiscount();
         }
     }

     @Override
     public String toString() {
         StringBuilder foodName = new StringBuilder();
         for (Food food: getFoods()){
             foodName.append(food.getName()).append(", ");
         }

         SimpleDateFormat format1 = new SimpleDateFormat("dd MMMM yyyy");
         String date = format1.format(getDate().getTime());
         if (getPromo() != null && getPromo().getActive() && totalPrice > getPromo().getMinPrice())
         {
             return "================Invoice================" + "\n" +
                     "ID          : " + getId() + "\n" +
                     "Name        : " + foodName + "\n" +
                     "Date        : " + date + "\n" +
                     "Customer    : " + getCustomer().getName() + "\n" +
                     "Promo       : " + getPromo().getCode() + "\n" +
                     "Total Price : " + totalPrice + "\n" +
                     "Status      : " + getInvoiceStatus() + "\n" +
                     "Payment Type: " + getPaymentType();
         }
         else{
             return "================Invoice================" + "\n" +
                     "ID          : " + getId() + "\n" +
                     "Name        : " + foodName + "\n" +
                     "Date        : " + date + "\n" +
                     "Customer    : " + getCustomer().getName() + "\n" +
                     "Total Price : " + totalPrice + "\n" +
                     "Status      : " + getInvoiceStatus() + "\n" +
                     "Payment Type: " + getPaymentType();
         }
     }
}
