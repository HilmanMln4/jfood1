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
        Location lokasi = new Location("Tangerang Selatan", "Banten", "Rumah");
        Location lokasi1 = new Location("Jakarta Selatan", "Jakarta", "SMA");
        Location lokasi2 = new Location("Depok", "Jawa Barat", "Kuliah");
        DatabaseSeller.addSeller(new Seller(DatabaseSeller.getLastId()+1, "Hilman", "hilman.maulana71@ui.ac.id", "085778772518", lokasi));
        DatabaseSeller.addSeller(new Seller(DatabaseSeller.getLastId()+1, "HilmanMaulana", "hilman.maulana@ui.ac.id", "085778772518", lokasi));
        DatabaseSeller.addSeller(new Seller(DatabaseSeller.getLastId()+1, "Maulana", "hilmanmaulana71@ui.ac.id", "085778772518", lokasi1));
        DatabaseSeller.addSeller(new Seller(DatabaseSeller.getLastId()+1, "Gilang", "gilang@ui.ac.id", "085778772518", lokasi2));
            DatabaseFood.addFood(new Food(DatabaseFood.getLastId()+1,"Ayam Bucket", 75000, FoodCategory.Western, DatabaseSeller.getSellerById(DatabaseSeller.getLastId())));
            DatabaseFood.addFood(new Food(DatabaseFood.getLastId()+1,"French Fries", 20000, FoodCategory.Western, DatabaseSeller.getSellerById(DatabaseSeller.getLastId())));
            DatabaseFood.addFood(new Food(DatabaseFood.getLastId()+1,"Ice Cream", 5000, FoodCategory.Western, DatabaseSeller.getSellerById(DatabaseSeller.getLastId())));
        DatabaseFood.addFood(new Food(DatabaseFood.getLastId()+1,"Choco Pie", 10000, FoodCategory.Western, DatabaseSeller.getSellerById(DatabaseSeller.getLastId())));
        SpringApplication.run(JFood.class, args);
    }
}

