package app;

/**
 * Class Minuman
 * @author Kelompok2_RestoranMamak
 */
public class Minuman extends Menu {
    private boolean dingin;
    
    /**
     * Set minuman menjadi dingin atau panas
     * @param dingin boolean 
     */
    public void setDingin(boolean value){
        this.dingin = value;
    }

    /**
     * mengembalikan nilai dingin atau panas
     * @return dingin
     */
    public boolean getDingin(){
        return this.dingin;
    }
}
