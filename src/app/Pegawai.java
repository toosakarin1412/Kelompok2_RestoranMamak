package app;

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
    
    public void setPassword(String pass){
        this.password = pass;
    }
    
    public String getPassword(){
        return this.password;
    }
}