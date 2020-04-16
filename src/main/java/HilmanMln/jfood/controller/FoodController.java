package HilmanMln.jfood.controller;

import HilmanMln.jfood.*;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RequestMapping("/food")
@RestController
public class FoodController {
    @RequestMapping(value = "", method = RequestMethod.GET)
    public ArrayList<Food> getAllFood() {
        return DatabaseFood.getFoodDatabase();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Food getFoodById(@PathVariable int id) throws FoodNotFoundException {
        Food food = DatabaseFood.getFoodById(id);
        return food;
    }

    @RequestMapping(value = "/seller/{sellerId}", method = RequestMethod.GET)
    public ArrayList<Food> getFoodBySeller (@PathVariable int sellerId) throws FoodNotFoundException {
        return DatabaseFood.getFoodBySeller(sellerId);
    }

    @RequestMapping(value = "/category/{category}", method = RequestMethod.GET)
    public ArrayList<Food> getFoodByCategory (@PathVariable FoodCategory category) throws FoodNotFoundException {
        return DatabaseFood.getFoodByCategory(category);
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public Food addFood(@RequestParam(value="name") String name,
                        @RequestParam(value="sellerID") int sellerId,
                        @RequestParam(value="price") int price,
                        @RequestParam(value="category") FoodCategory category) throws SellerNotFoundException {
        Food food = new Food(DatabaseFood.getLastId()+1, name, price, category, DatabaseSeller.getSellerById(sellerId));
        DatabaseFood.addFood(food);
        return food;
    }
}

