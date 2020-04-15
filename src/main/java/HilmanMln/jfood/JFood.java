package HilmanMln.jfood;

import javax.xml.crypto.Data;
import java.util.Calendar;
import java.util.*;
import java.util.regex.*;
import java.text.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JFood
{
    public static void main(String[] args) throws SellerNotFoundException
    {
        SpringApplication.run(JFood.class, args);
        Location lokasi = new Location("Tangerang Selatan", "Banten", "Rumah");
        Calendar calendar = new GregorianCalendar(2020, Calendar.SEPTEMBER, 16);

        DatabaseSeller.addSeller(new Seller(DatabaseSeller.getLastId()+1, "Hilman", "hilman.maulana71@ui.ac.id", "085778772518", lokasi));
        DatabaseSeller.addSeller(new Seller(DatabaseSeller.getLastId()+1, "Maulana", "hilmanmaulana71@ui.ac.id", "085778772518", lokasi));
        DatabaseSeller.addSeller(new Seller(DatabaseSeller.getLastId()+1, "Gilang", "gilang@ui.ac.id", "085778772518", lokasi));

        try {
            DatabaseCustomer.addCustomer(new Customer(DatabaseCustomer.getLastId()+1,"Hilman Maulana", "Hilman.maulana@ui.ac.id", "8888888888"));
            DatabaseCustomer.addCustomer(new Customer(DatabaseCustomer.getLastId()+1,"Gilang", "gilang@ui.ac.id.com", "Hehehe78900"));
            DatabaseCustomer.addCustomer(new Customer(DatabaseCustomer.getLastId()+1,"Hilman M", "Hilman.m@ui.ac.id", "99999999", calendar));
            DatabaseCustomer.addCustomer(new Customer(DatabaseCustomer.getLastId()+1, "Healman", "healman@gmail.com", "healbear", 2019, 3, 26));
        } catch (EmailAlreadyExistsException x){
            System.out.println(x.getMessage());
        }

        try {
            DatabasePromo.addPromo(new Promo(DatabasePromo.getLastId()+1, "Promo Modul 7", 20000, 75000, false));
            DatabasePromo.addPromo(new Promo(DatabasePromo.getLastId()+1, "Promo Modul 7", 10000, 50000, false));
        } catch (PromoCodeAlreadyExistsException x){
            System.out.println(x.getMessage());
        }

        try{
            DatabaseCustomer.getCustomerById(10);
        } catch(CustomerNotFoundException e){
            System.out.println(e.getMessage());
        }

        try{
            DatabaseFood.getFoodById(10);
        } catch(FoodNotFoundException e){
            System.out.println(e.getMessage());
        }

        try {
            DatabaseFood.addFood(new Food(DatabaseFood.getLastId()+1,"Ayam Bucket", 75000, FoodCategory.Western, DatabaseSeller.getSellerById(DatabaseSeller.getLastId())));
            DatabaseFood.addFood(new Food(DatabaseFood.getLastId()+1,"French Fries", 20000, FoodCategory.Western, DatabaseSeller.getSellerById(DatabaseSeller.getLastId())));
            DatabaseFood.addFood(new Food(DatabaseFood.getLastId()+1,"French Fries 2000", 2000, FoodCategory.Western, DatabaseSeller.getSellerById(5)));
        } catch (SellerNotFoundException x){
            System.out.println(x.getMessage());
        }

        try{
            DatabaseSeller.removeSeller(4);
        }catch (SellerNotFoundException x){
            System.out.println(x.getMessage());
        }

        try{
            DatabasePromo.getPromoById(10);
        } catch(PromoNotFoundException e){
            System.out.println(e.getMessage());
        }

        /*ArrayList<Food> Kfc = new ArrayList<Food>();
        ArrayList<Food> Aw = new ArrayList<Food>();*/

        ArrayList<Food> food = new ArrayList<Food>();
        try
        {
            food.add(DatabaseFood.getFoodById(1));
            food.add(DatabaseFood.getFoodById(2));
        }
        catch (FoodNotFoundException f)
        {
            System.out.println(f.getMessage());
        }

        try
        {
            DatabaseInvoice.addInvoice(new CashInvoice(DatabaseInvoice.getLastId()+1, food, DatabaseCustomer.getCustomerById(1), 10000));
            DatabaseInvoice.addInvoice(new CashInvoice(DatabaseInvoice.getLastId()+1, food, DatabaseCustomer.getCustomerById(1), 10000));
            //DatabaseInvoice.addInvoice(new CashlessInvoice(DatabaseInvoice.getLastId() + 1, Kfc, DatabaseCustomer.getCustomerById(3)));
            //DatabaseInvoice.addInvoice(new CashlessInvoice(DatabaseInvoice.getLastId() + 1, Kfc, DatabaseCustomer.getCustomerById(4)));
        }
        catch (CustomerNotFoundException | OngoingInvoiceAlreadyExistsException x)
        {
            System.out.println(x.getMessage());
        }

        System.out.println("\nList invoice:");
        for(Invoice invoice : DatabaseInvoice.getInvoiceDatabase())
        {
            invoice.setTotalPrice();
            System.out.println(invoice);
            System.out.println();
        }

        try {
            DatabaseInvoice.removeInvoice(10);
        } catch (InvoiceNotFoundException i){
            System.err.println(i.getMessage());
        }
    }
}

