package app;

import java.util.ArrayList;

public class Pelanggan {
    private String name;
    private int table_no;
    private ArrayList<Menu> order = new ArrayList<Menu>();
    private boolean takeaway;

    public Pelanggan(String name, int table_no) {
        this.name = name;
        this.table_no = table_no;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTableNo(int table_no) {
        this.table_no = table_no;
    }

    public String getName() {
        return name;
    }

    public int getTableName() {
        return table_no;
    }

    public void addOrder(Menu Pesan) {

    }

    public ArrayList<Menu> getOrder() {
        return this.order;
    }

    public void setTakeaway(boolean takeaway) {
        this.takeaway = takeaway;
    }

    public boolean getTakeway(){
        return this.takeaway;
    }
}