package app;

import java.util.ArrayList; //import Arraylist

/**
 * Menyatakan class bernama Pelanggan
 * untuk menyimpan nama, nomor meja, pesanan,
 * serta sifat pesanan yaitu makan ditempat atau takehome.
 *
 * @author Kelompok2_RestoranMamak
 * @version 1.3
 */
public class Pelanggan {
    private String name;
    private int table_no;
    private ArrayList<Menu> order = new ArrayList<Menu>();
    private boolean takeaway;

    /**
     * Method constructor dengan parameter untuk objects dari Pelanggan
     * 
     * @param name
     * @param table_no
     */

    public Pelanggan(String name, int table_no) {
        this.name = name;
        this.table_no = table_no;
    }

    /**
     * Method mutator setName dengan paramater sebagai setter dari name.
     * 
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Method accessor setTableNo dengan parameter sebagai setter dari table_no
     * 
     * @param table_no
     */
    public void setTableNo(int table_no) {
        this.table_no = table_no;
    }

    /**
     * Method accessor getName tanpa parameter untuk mengembalikan name
     * 
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Method accessor getTableName tanpa parameter untuk mengembalikan table_no
     * Pelanggan
     * 
     * @return table_no
     */
    public int getTableName() {
        return table_no;
    }

    /**
     * Method constructor addOrder dengan parameter untuk menambahkan pesanan
     * kedalam
     * pelanggan
     * 
     * @param Pesan
     */
    public void addOrder(Menu Pesan) {
        order.add(Pesan);
    }

    /**
     * method getOrder accessor untuk mengembalikan order
     * dari arraylist menu
     * 
     * @return order
     */
    public ArrayList<Menu> getOrder() {
        return this.order;
    }

    /**
     * method mutator setTakeaway dengan parameter sebagai setter dari takeaway.
     * 
     * @param takeaway
     */
    public void setTakeaway(boolean takeaway) {
        this.takeaway = takeaway;
    }

    /**
     * method accessor getTakeaway untuk return takeaway kedalam pelanggan
     * 
     * @return takeaway
     */
    public boolean getTakeway() {
        return this.takeaway;
    }

}
