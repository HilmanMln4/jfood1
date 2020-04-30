package HilmanMln.jfood;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JFood
{
    public static void main(String[] args) throws SellerNotFoundException
    {
        Location lokasi = new Location("Tangerang Selatan", "Banten", "Rumah");
        DatabaseSeller.addSeller(new Seller(DatabaseSeller.getLastId()+1, "Hilman", "hilman.maulana71@ui.ac.id", "085778772518", lokasi));
            DatabaseFood.addFood(new Food(DatabaseFood.getLastId()+1,"Ayam Bucket", DatabaseSeller.getSellerById(DatabaseSeller.getLastId()), 75000, FoodCategory.Western));
            DatabaseFood.addFood(new Food(DatabaseFood.getLastId()+1,"French Fries", DatabaseSeller.getSellerById(DatabaseSeller.getLastId()), 20000, FoodCategory.Western));
        SpringApplication.run(JFood.class, args);
    }
}

