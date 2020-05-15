package HilmanMln.jfood;

import java.util.ArrayList;
import java.lang.reflect.Array;
/**
 * Kelas DatabaseFood merupakan bagian dari JFood yang menangani pusat data makanan.
 * Class adalah “blueprint” atau “cetakan” untuk menciptakan suatu  object.
 * @author Hilman Maulana 1706985975
 * @version 27 Februari 2020
**/
public class DatabaseFood //Create the class DatabaseFood
{
    /* Below is used to
     * declare the variables
     * of the DatabaseFood
     */
    private static ArrayList<Food> FOOD_DATABASE=new ArrayList<Food>();
    public static int lastId = 0;

    public static ArrayList<Food> getFoodDatabase()
    {
        return FOOD_DATABASE;
    }
    public static int getLastId()
    {
        return lastId;
    }

    public static Food getFoodById(int id) throws FoodNotFoundException
    {
        for (Food food : FOOD_DATABASE){
            if(food.getId() == id){
                return food;
            }
        }
        throw new FoodNotFoundException(id);
    }

    public static ArrayList<Food> getFoodBySeller(int sellerId){
        ArrayList<Food> LIST_FOOD_BY_SELLER = new ArrayList<>();
        for(Food food : FOOD_DATABASE){
            if(food.getSeller().getId() == sellerId){
                LIST_FOOD_BY_SELLER.add(food);
            }
        }
        return LIST_FOOD_BY_SELLER;
    }

    public static ArrayList<Food> getFoodByCategory(FoodCategory category)
    {
        ArrayList<Food> list = new ArrayList<>();
        for(Food foods: FOOD_DATABASE)
        {
            if (foods.getCategory() == category)
            {
                list.add(foods);
            }
        }
        return list;
    }
    public static boolean addFood(Food food)
    {
        FOOD_DATABASE.add(food);
        lastId = food.getId();
        return true;
    }

    public static boolean removeFood(int id) throws FoodNotFoundException {
        for(int i = 0; i < FOOD_DATABASE.size(); i++){
            Food food = FOOD_DATABASE.get(i);
            if (food.getId() == id){
                FOOD_DATABASE.remove(i);
                return true;
            }
        }
        throw new FoodNotFoundException(id);
    }
}
