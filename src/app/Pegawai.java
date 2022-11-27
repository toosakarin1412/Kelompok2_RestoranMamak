package app;

/**
 * Menyatakan class Pegawai yang bersifat abstract
 * 
 * author Kelompok2_RestoranMamak
 * version 1.0
 */
public abstract class Pegawai {
    private String name;
    private String phone;
    private String password;

    public String getName() {
        return this.name;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setPassword(String pass) {
        this.password = pass;
    }

    public String getPassword() {
        return this.password;
    }
}