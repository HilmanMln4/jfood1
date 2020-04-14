import java.util.ArrayList;
import java.lang.reflect.Array;
/**
 * Write a description of class DatabasePromo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DatabasePromo
{
    // instance variables - replace the example below with your own
    private static int lastId=0;
    private static ArrayList<Promo> PROMO_DATABASE = new ArrayList<Promo>();

    /**
     * Constructor for objects of class DatabaseCustomer
     */
    public static ArrayList<Promo> getPromoDatabase()
    {
        return PROMO_DATABASE;
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static int getLastId()
    { 
        return lastId;
    }

    public static Promo getPromoById(int id) throws PromoNotFoundException
    {
        for(Promo promo : PROMO_DATABASE)
        {
            if (promo.getId() == id)
            {
                return promo;
            }
        }
        throw new PromoNotFoundException(id);
    }
    
    public static Promo getPromoByCode(String code)
    {
        for(Promo promo : PROMO_DATABASE)
        {
                if(promo.getCode()==code)
                {
                    return promo;
                }
        }
        return null;
    }

    public static boolean addPromo(Promo promo) throws PromoCodeAlreadyExistsException
    {
        for(Promo pro : PROMO_DATABASE){
            if(pro.getCode() == promo.getCode()){
                throw new PromoCodeAlreadyExistsException(promo);
            }
        }
        PROMO_DATABASE.add(promo);
        lastId = promo.getId();
        return true;
    }
    
    public static boolean activatePromo(int id)
    {
        for (Promo promo : PROMO_DATABASE) {
            if (!promo.getActive()) {
                promo.setActive(true);
                return true;
            }
        }
        return false;
    }
    
    public boolean deactivatePromo(int id)
    {
        for (Promo promo : PROMO_DATABASE) {
            if (promo.getActive()) {
                promo.setActive(false);
                return true;
            }
        }
        return false;
    }

    public static boolean removePromo(int id) throws PromoNotFoundException
    {
        for(Promo promo : PROMO_DATABASE) {
            if(promo.getId() == id) {
                PROMO_DATABASE.remove(promo);
                return true;
            }
        }
        throw new PromoNotFoundException(id);
    }

}
