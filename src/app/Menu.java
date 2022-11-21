package app;

/**
 * Abstract class Menu
 * @author Kelompok2_RestoranMamak
 */
public abstract class Menu {
    private String name;
    private int price;
    private String picture;

    /**
     * Mengatur nama dari menu
     * @param nama nama menu
     */
    public void setName(String name){
        this.name = name;
    }

    /**
     * Mengatur harga dari menu
     * @param price harga menu
     */
    public void setPrice(int price){
        this.price = price;
    }

    /**
     * Mengatur gambar dari menu
     * @param picture gambar menu
     */
    public void setPicture(String picture){
        this.picture = picture;
    }

    /**
     * Mengembalikan nama dari menu
     * @return name
     */
    public String getName(){
        return this.name;
    }

    /**
     * Mengembalikan harga dari menu
     * @return price
     */
    public int getPrice(){
        return this.price;
    }

    /**
     * Mengembalikan gambar dari menu
     * @return picture
     */
    public String getPicture(){
        return this.picture;
    }
}
