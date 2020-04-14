/**
 * Kelas Seller merupakan bagian dari JFood yang menangani data penjual yang terdiri dari id, nama, email, nomor telpon, lokasi
 * Class adalah “blueprint” atau “cetakan” untuk menciptakan suatu  object.
 * @author Hilman Maulana 1706985975
 * @version 27 Februari 2020
**/

public class Seller
{
    // instance variables - replace the example below with your own
    /** bagian variable
     * Saya menggunakan private karena supaya hanya digunakan oleh masing-masing parameter.
     * Adapun tipe data yang digunakan yaitu int, string, dan
     * tipe data buatan sendiri. Kemudian variable yang digunakan yaitu id, name,
     * email, phoneNumber, dan location
     */
    private int id;
    private String name;
    private String email;
    private String phoneNumber;
    private Location location;

    /**
     * Constructor for objects of class Seller
     * Constructor ialah sebuah method yang namanya sama persis dengan nama class-nya
     * Constructor sendiri berfungsi untuk memberikan nilai awal pada sebuah class ketika class tersebut dibuat dalam bentuk objek pada class lain
     * Parameter yang  digunakan yaitu id, name, email, phoneNumber, dan location
     */
    public Seller(int id, String name, String email, String phoneNumber, Location location)
    {
        this.id=id;
        this.name=name;
        this.email=email;
        this.phoneNumber=phoneNumber;
        this.location=location;
    }
    /** 
     * method getter Id akan menampilkan return value sesuai dengan variable yang bersangkutan
     * Getter Id untuk Seller
     */
    public int getId()
    {
        return id;
    }
    /**
     * method getter Name akan menampilkan return value sesuai dengan variable yang bersangkutan
     * Getter Name untuk Seller
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * method getter Email akan menampilkan return value sesuai dengan variable yang bersangkutan
     * Getter Email untuk Seller
     */
    public String getEmail()
    {
        return email;
    }
    
    /**
     * method getter phoneNumber akan menampilkan return value sesuai dengan variable yang bersangkutan
     * Getter phoneNumber untuk Seller
     */
    public String getPhoneNumber()
    {
        return phoneNumber;
    }
    
    /**
     * method getter location akan menampilkan return value sesuai dengan variable yang bersangkutan
     * Getter location untuk Seller
     */
    public Location getLocation()
    {
        return location;
    }
    
    /**
     * method setter Id akan set sebuah nilai sesuai dengan variable
     * Setter Id untuk Seller
     */
    public  void setId(int id)
    {
        this.id=id;
    }
    
    /**
     * method setter Name akan set sebuah nilai sesuai dengan variable
     * Setter Name untuk Seller
     */
    public  void setName(String name)
    {
        this.name=name;
    }
    
    /**
     * method setter Email akan set sebuah nilai sesuai dengan variable
     * Setter Email untuk Seller
     */
    public  void setEmail(String email)
    {
        this.email=email;
    }
    
    /**
     * method setter PhoneNumber akan set sebuah nilai sesuai dengan variable
     * Setter PhoneNumber untuk Seller
     */
    public  void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber=phoneNumber;
    }
    
    /**
     * method setter Location akan set sebuah nilai sesuai dengan variable
     * Setter Location untuk Seller
     */
    public void setLocation(Location location)
    {
        this.location=location;
    }
    
    public String toString()
    {
        return id+""+name+""+phoneNumber+""+location;
    }
    
    /*/**
     * Untuk mencetak data sesuai dengan value dalam kurung
     *
    public void printData()
    {
        System.out.println(getName());
    }*/
}
