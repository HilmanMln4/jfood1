
/**
 * Write a description of class Promo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Promo
{
    // instance variables - replace the example below with your own
    private int id;
    private String code;
    private int discount;
    private int minPrice;
    private boolean active;

    /**
     * Constructor for objects of class Promo
     */
    public Promo(int id, String code, int discount, int minPrice, boolean active)
    {
        // initialise instance variables
        this.id=id;
        this.code=code;
        this.discount=discount;
        this.minPrice=minPrice;
        this.active=active;
    }

        /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int getId()
    {
        return id;
    }
    
    public String getCode()
    {
        return code;
    }
    
    public int getDiscount()
    {
        return discount;
    }
    
    public int getMinPrice()
    {
        return minPrice;
    }
    
    public boolean getActive()
    {
        return active;
    }
    
    public void setId(int id)
    {
        this.id=id;
    }
    
    public void setCode(String code)
    {
        this.code=code;
    }
    
    public void setDiscount(int discount)
    {
        this.discount=discount;
    }
    
    public void setMinPrice(int minPrice)
    {
        this.minPrice=minPrice;
    }
    
    public void setActive(boolean active)
    {
        this.id=id;
    }

    public String toString(){
        return String.format("Id=" + getId() + "\n" +
                "Code=" + getCode() + "\n" +
                "Discount=" + getDiscount() + "\n" +
                "MinPrice=" + getMinPrice() + "\n" +
                "Status=" + getActive());
    }
    
    /*
    public void printData()
    {
        /*System.out.println("=====Promo=====");
        System.out.println("Id:" + getId());
        System.out.println("Code:" + getCode());
        System.out.println("Discount:" + getDiscount());
        System.out.println("Minimal Price:" + getMinPrice());
        System.out.println("Active:" + getActive());
    }*/
}
