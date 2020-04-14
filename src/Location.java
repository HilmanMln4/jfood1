
/**
 * Kelas Location merupakan bagian dari JFood yang menangani data lokasi yang terdiri dari province, description, city.
 * Class adalah “blueprint” atau “cetakan” untuk menciptakan suatu  object.
 * @author Hilman Maulana 1706985975
 * @version 27 Februari 2020
**/
public class Location
{
    // instance variables - replace the example below with your own
    /** bagian variable
     * Saya menggunakan private karena supaya hanya digunakan oleh masing-masing parameter.
     * Adapun tipe data yang digunakan yaitu string
     * Kemudian variable yang digunakan yaitu province, description, city
     */
    private String province;
    private String description;
    private String city;

    /**
     * Constructor for objects of class Location
     * Constructor ialah sebuah method yang namanya sama persis dengan nama class-nya
     * Constructor sendiri berfungsi untuk memberikan nilai awal pada sebuah class ketika class tersebut dibuat dalam bentuk objek pada class lain
     * Parameter yang  digunakan yaitu province, description, dan city.
     */
    public Location(String city, String province, String description)
    {
        // initialise instance variable
        this.province=province;
        this.city=city;
        this.description=description;
    }

    /** 
     * method getter Province akan menampilkan return value sesuai dengan variable yang bersangkutan
     * Getter Province untuk Location
     */
    public String getProvince()
    {
        // put your code here
        return province;
    }
    
    /** 
     * method getter City akan menampilkan return value sesuai dengan variable yang bersangkutan
     * Getter City untuk Location
     */
    public String getCity()
    {
        return city;
    }
    
    /** 
     * method getter Description akan menampilkan return value sesuai dengan variable yang bersangkutan
     * Getter Description untuk Location
     */
    public String getDescription()
    {
        return description;
    }
    
    /**
     * method setter Province akan set sebuah nilai sesuai dengan variable
     * Setter Province untuk Location
     */
    public void setProvince(String province)
    {
        this.province=province;
    }
    
    /**
     * method setter City akan set sebuah nilai sesuai dengan variable
     * Setter City untuk Location
     */
    public void setCity(String city)
    {
        this.city=city;
    }
    
    /**
     * method setter Description akan set sebuah nilai sesuai dengan variable
     * Setter Description untuk Location
     */
    public void setDescription(String description)
    {
        this.description=description;
    }
    
    public String toString()
    {
        return province+""+city+""+description;
    }
    
    /*/**
     * Untuk mencetak data sesuai dengan value dalam kurung
     *
    public void printData()
    {
        System.out.println(getProvince());
    }*/
}
