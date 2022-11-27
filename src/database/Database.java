package database;
import app.*;
import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Database {
    private ArrayList<Menu> dataMenu = new ArrayList<Menu>();
    private ArrayList<Pegawai> dataPegawai = new ArrayList<Pegawai>();

    public Database(){
        this.readMenuData();
        this.readPegawaiData();
    };

    private void readPegawaiData(){
        StringTokenizer tokenizer;
        try{
            File myFile = new File("src/database/pegawai.txt");
            Scanner myReader = new Scanner(myFile);
            while(myReader.hasNextLine()){
                String data = myReader.nextLine();
                tokenizer = new StringTokenizer(data, "%");
                
                ArrayList<String> token = new ArrayList<String>();
                while(tokenizer.hasMoreTokens()){
                    token.add(tokenizer.nextToken());
                }
                
                if(token.get(0).equals("Admin")){
                    Admin pgw = new Admin();
                    pgw.setName(token.get(1));
                    pgw.setPassword(token.get(2));
                    dataPegawai.add(pgw);
                }else if(token.get(0).equals("Kasir")){
                    Kasir pgw = new Kasir();
                    pgw.setName(token.get(1));
                    pgw.setPassword(token.get(2));
                    dataPegawai.add(pgw);
                }
            }
        }catch(FileNotFoundException e){
            e.printStackTrace();
        };
    };

    private void readMenuData(){
        StringTokenizer tokenizer;
        try{
            File myFile = new File("src/database/menu.txt");
            Scanner myReader = new Scanner(myFile);
            while(myReader.hasNextLine()){
                String data = myReader.nextLine();
                tokenizer = new StringTokenizer(data, "%");
                
                ArrayList<String> token = new ArrayList<String>();
                while(tokenizer.hasMoreTokens()){
                    token.add(tokenizer.nextToken());
                }
                if(token.get(0).equals("Makanan")){
                    Makanan mkn = new Makanan();
                    mkn.setName(token.get(1));
                    mkn.setPrice(Integer.parseInt(token.get(2)));
                    dataMenu.add(mkn);
                }else if(token.get(0).equals("Minuman")){
                    Minuman mnm = new Minuman();
                    mnm.setName(token.get(1));
                    mnm.setPrice(Integer.parseInt(token.get(2)));
                    dataMenu.add(mnm);
                }
            }
            myReader.close();
        }catch(FileNotFoundException e){
            e.printStackTrace();
        };
    };
    
    public ArrayList<Menu> getMenu(){
            return this.dataMenu;
    };
    
    public ArrayList<Pegawai> getPegawai(){
        return this.dataPegawai;
    };

};
