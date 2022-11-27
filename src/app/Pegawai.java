package app;

/**
 * Menyatakan class Pegawai yang bersifat abstract
 * untuk mendapatkan nama, nomor hp, serta password
 * 
 * @author Kelompok2_RestoranMamak
 * @version 1.0
 */
public abstract class Pegawai {
    private String name;
    private String phone;
    private String password;

    /**
     * @return Method accessor untuk mengembalikan nama kedalam pegawai.
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return Method accessor untuk mengembalikan
     *         phone kedalam pegawai.
     */
    public String getPhone() {
        return this.phone;
    }

    /**
     * @param Method mutator sebagai setter nama.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @param Method mutator sebagai setter phone.
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @param Method mutator sebagai setter password.
     */
    public void setPassword(String pass) {
        this.password = pass;
    }

    /**
     * @return Method accessor untuk mengembalikan password kedalam pegawai.
     */
    public String getPassword() {
        return this.password;
    }
}
