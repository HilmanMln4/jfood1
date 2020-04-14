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
 * Write a description of class CashInvoice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CashInvoice extends Invoice
{
    // instance variables - replace the example below with your own
    private static PaymentType PAYMENT_TYPE=PaymentType.Cash;
    private int deliveryFee=0;

    /**
     * Constructor for objects of class CashInvoice
     */
    public CashInvoice(int id, ArrayList<Food> foods, Customer customer)
    {
        super(id, foods, customer);
    }

    public CashInvoice(int id, ArrayList<Food> foods, Customer customer, int deliveryFee)
    {
        super(id, foods, customer);
        this.deliveryFee=deliveryFee;
    }

    @Override
    public PaymentType getPaymentType()
    {
        return PAYMENT_TYPE;
    }
    
    public int getDeliveryFee()
    {
        return deliveryFee;
    }
    
    public void setDeliveryFee(int deliveryFee)
    {
        this.deliveryFee=deliveryFee;
    }

    @Override
    public void setTotalPrice()
    {
        super.totalPrice=0;
        for(Food foods : getFood())
        {
            super.totalPrice=super.totalPrice+foods.getPrice();
        }
        super.totalPrice=super.totalPrice+deliveryFee;
    }

    @Override
     public String toString() {
        StringBuilder foodName = new StringBuilder();
        for (Food food: getFood()){
            foodName.append(food.getName()).append(", ");
        }

        DateTimeFormatter tgl = DateTimeFormatter.ofPattern("dd MMMM yyyy");
        LocalDateTime now = LocalDateTime.now();

        if (getDeliveryFee() != 0) {
            return  "================Invoice================" + "\n" +
                    "ID          : " + getId() + "\n" +
                    "Name        : " + foodName + "\n" +
                    "Date        : " + tgl.format(now)+ "\n" +
                    "Customer    : " + getCustomer().getName() + "\n" +
                    "Total Price : " + totalPrice + "\n" +
                    "Status      : " + getInvoiceStatus() + "\n" +
                    "Payment Type: " + getPaymentType() + "\n" +
                    "Delivery Fee: " + getDeliveryFee();
        }
        else{
            return  "================Invoice================" + "\n" +
                    "ID          : " + getId() + "\n" +
                    "Name        : " + foodName + "\n" +
                    "Date        : " + tgl.format(now) + "\n" +
                    "Customer    : " + getCustomer().getName() + "\n" +
                    "Total Price : " + totalPrice + "\n" +
                    "Status      : " + getInvoiceStatus() + "\n" +
                    "Payment Type: " + getPaymentType();
        }
    }
}
