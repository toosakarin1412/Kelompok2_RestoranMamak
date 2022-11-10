package app;

import java.util.ArrayList;

public class Pelanggan{
    private String name;
    private int table_no;
    private ArrayList <Menu> Order;
    private boolean takeaway;

    public Pelanggan(){

    }

    public void setName(){
        this.name = name;
    }

    public void setTableNo(){
        this.table_no = table_no;
    }

    public String getName(){
        return name;
    }

    public int getTableName(){
        return table_no;
    }

    public void addOrder(Menu Pesan){

    }

    public ArrayList <Menu> getOrder () {
        ArrayList <Menu> getOrder = new ArrayList <Menu>();
        return getOrder;
    }

    public boolean isTakeaway() {
        return takeaway;
    }
    public void setTakeaway(boolean takeaway) {
        this.takeaway = takeaway;
    }
}