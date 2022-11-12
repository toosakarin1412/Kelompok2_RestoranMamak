package app;

/**
 * Menyatakan class bernama Pegawai untuk
 * mendapatkan nama, dan nomor hp pegawai.
 * 
 * @author Kelompok2_RestoranMamak
 * @version 1.0
 */
public abstract class Pegawai {
    private String name;
    private String phone;

    /**
     * @return Method accessor untuk mengembalikan
     *         nama kedalam pegawai.
     */
    public String getName() {
        return this.name;
    }

    /**
     * 
     * @return Method accessor untuk mengembalikan
     *         phone kedalam pegawai.
     */

    public String getPhone() {
        return this.phone;
    }

    /**
     * @param method mutator untuk setter nama.
     */
    public void setName() {
        this.name = name;
    }

    /**
     * @param method mutator untuk setter phone.
     */

    public void setPhone() {
        this.phone = phone;
    }
}