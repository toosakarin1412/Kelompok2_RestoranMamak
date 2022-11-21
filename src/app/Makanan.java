package app;

/**
 * Class Makanan
 * @author Kelompok2_RestoranMamak
 */
public class Makanan extends Menu{
    private int level;

    /**
     * Set kepedasan makanan berdasarkan levelnya
     * @param level tingkat kepedasan 
     */
    public void setLevel(int level){
        this.level = level;
    }

    /**
     * mengembalikan nilai level pedas
     * @return level
     */
    public int getLevel(){
        return this.level;
    }
}
