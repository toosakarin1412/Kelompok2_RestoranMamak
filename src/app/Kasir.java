package app;

public class Kasir extends Pegawai{
    private int income = 0;

    public Kasir(){

    };

    public void addIncome(int total){
        this.income+=total;
    };

    public int getIncome(){
        return this.income;
    };

    public int countTotal(Menu order){
        return 0;
    }
    
};