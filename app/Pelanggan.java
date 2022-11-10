package app;

import java.util.ArrayList; //import Arraylist

public class Pelanggan {
    private String name;
    private int table_no;
    private ArrayList<Menu> order = new ArrayList<Menu>();
    private boolean takeaway;

    /**
     * Constructor for objects of Pelanggan dengan parameter
     * 
     * @param name
     * @param table_no
     */
    public Pelanggan(String name, int table_no) {
        this.name = name;
        this.table_no = table_no;
    }

    /**
     * Method setName untuk mengatur/mengubah name
     * 
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * method setTableNo untuk mengatur/mengubah table_no pelanggan
     * 
     * @param table_no
     */
    public void setTableNo(int table_no) {
        this.table_no = table_no;
    }

    /**
     * Method getname untuk mengembalikan name
     * 
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * method getTableName untuk mengembalikan table_no Pelanggan
     * 
     * @return table_no
     */
    public int getTableName() {
        return table_no;
    }

    /**
     * addOrder menu pesanan pelanggan
     * 
     * @param Pesan 
     */
    public void addOrder(Menu Pesan) {
        order.add(Pesan);
    }

    /**
     * method getOrder untuk mengembalikan order 
     * dari arraylist menu
     * 
     * @return order
     */
    public ArrayList <Menu> getOrder() {
        return this.order;
    }

    /**
     * method setTakeaway untuk mengatur/mengubah Takeaway
     * 
     * @param takeaway
     */
    public void setTakeaway(boolean takeaway) {
        this.takeaway = takeaway;
    }

    /**
     * method getTakeaway untuk mengembalikan takeaway
     * 
     * @return takeaway
     */
    public boolean getTakeway(){
        return this.takeaway;
    }
    
}
