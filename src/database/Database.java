package database;
import app.*;
import java.util.ArrayList;

public class Database {
    ArrayList<Menu> dataMenu = new ArrayList<Menu>();
    ArrayList<Pegawai> dataPegawai = new ArrayList<Pegawai>();

    public Database(){

    };

    private void readPegawaiData(){
        
    };

    private void readMenuData(){

    };

    public Menu getMenuData(){
        return new Makanan();
    };

    public Pegawai getPegawaiData(){
        return new Admin();
    };
};
