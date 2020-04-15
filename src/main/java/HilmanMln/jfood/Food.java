package HilmanMln.jfood;

/**
 * Kelas Food merupakan bagian dari JFood yang menangani data menu makan yang terdiri dari id, nama, seller, harga, kategori.
 * Class adalah “blueprint” atau “cetakan” untuk menciptakan suatu  object.
 * @author Hilman Maulana 1706985975
 * @version 27 Februari 2020
**/

public class Food
{
    /** bagian variable
     * Saya menggunakan private karena supaya hanya digunakan oleh masing-masing parameter.
     * Adapun tipe data yang digunakan yaitu int, string, dan tipe data buatan sendiri.
     * Kemudian variable yang digunakan yaitu id, name, price, category, dan seller
     */
    private int id;
    private String name;
    private int price;
    private FoodCategory category;
    private Seller seller;

    /**
     * Constructor for objects of class Food
     * Constructor ialah sebuah method yang namanya sama persis dengan nama class-nya
     * Constructor sendiri berfungsi untuk memberikan nilai awal pada sebuah class ketika class tersebut dibuat dalam bentuk objek pada class lain
     * Parameter yang  digunakan yaitu id, name, seller, price, dan category
     */
    public Food(int id, String name, int price, FoodCategory category, Seller seller)
    {
        this.id = id;
        this.name = name;
        this.seller = seller;
        this.price = price;
        this.category = category;
    }

    /** 
     * method getter Id akan menampilkan return value sesuai dengan variable yang bersangkutan
     * Getter Id untuk Food
     */
    public int getId()
    {
        return id;
    }
    
    /** 
     * method getter Name akan menampilkan return value sesuai dengan variable yang bersangkutan
     * Getter Name untuk Food
     */
    public String getName()
    {
        return name;
    }
    
    /** 
     * method getter Seller akan menampilkan return value sesuai dengan variable yang bersangkutan
     * Getter Seller untuk Food
     */
    public Seller getSeller()
    {
        return seller;
    }
    
    /** 
     * method getter Price akan menampilkan return value sesuai dengan variable yang bersangkutan
     * Getter Price untuk Food
     */
    public int getPrice()
    {
        return price;
    }
    
    /** 
     * method getter Category akan menampilkan return value sesuai dengan variable yang bersangkutan
     * Getter Category untuk Food
     */
    public FoodCategory getCategory()
    {
        return category;
    }
    
    /** 
     * method setter Id akan set sebuah nilai sesuai dengan variable
     * Setter Id untuk Food
     */
    public void setId(int id)
    {
        this.id=id;
    }
    
    /** 
     * method setter Name akan set sebuah nilai sesuai dengan variable
     * Setter Name untuk Food
     */
    public void setName(String name)
    {
        this.name=name;
    }
    
    /** 
     * method setter Seller akan set sebuah nilai sesuai dengan variable
     * Setter Seller untuk Food
     */
    public void setSeller(Seller seller)
    {
        this.seller=seller;
    }
    
    /** 
     * method setter Price akan set sebuah nilai sesuai dengan variable
     * Setter Price untuk Food
     */
    public void setPrice(int price)
    {
        this.price=price;
    }
    
    /** 
     * method setter Category akan set sebuah nilai sesuai dengan variable
     * Setter Category untuk Food
     */
    public void setCategory(FoodCategory category)
    {
        this.category=category;
    }
    
    public String toString()
    {
        return id+""+getSeller().getName()+""+ getName()+""+getSeller().getLocation().getCity()+""+price+""+category;
    }
    /*/**
     * Untuk mencetak data sesuai dengan value dalam kurung
     
    public void printData()
    {
        System.out.println("================FOOD===============");
        System.out.println("ID:" + getId());
        System.out.println("Name:" + getName());
        System.out.println("Seller:" + getSeller().getName());
        System.out.println("City:" + getSeller().getLocation().getCity());
        System.out.println("Price:" + getPrice());
        System.out.println("Category:" + getCategory());
    }*/
}
