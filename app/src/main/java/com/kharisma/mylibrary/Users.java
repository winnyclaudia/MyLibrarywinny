package com.kharisma.mylibrary;

/**
 * Created by 207-1 on 11/12/2017.
 */

public class Users {

    private String email;
    private String password;
    private String namalengkap;
    private String telepon;
    private String id_members;

    private String[][] data = new String[][]{
            {"winnyclaudia_16@kharisma.ac.id","winnycw","Winny Claudia","000001","867984"},
            {"billy_16@kharisma.ac.id","billytanyawan","Billy Tanyawan","000002","867902"},
            {"ivan_16@kharisma.ac.id","ivan","Ivan Darmawan","000003","867945"},
            {"yanoris_16@kharisma.ac.id","yanorisarnold","Yanoris Arnold","000004","867999"}
    };

    public Users(String tv_emailmember) {
        this.email = tv_emailmember;
        this.cariUsers();

    }

    private void cariUsers() {
        for(int i=0; i<this.data.length; i++){
            if (this.email.equals(this.data[i][0])){
                this.password = this.data[i][1];
                this.namalengkap = this.data[i][2];
                this.id_members = this.data[i][3];
                this.telepon = this.data[i][4];
            }
        }
    }



    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNamalengkap() {
        return namalengkap;
    }

    public void setNamalengkap(String namalengkap) {
        this.namalengkap = namalengkap;
    }

    public String getTelepon() {
        return telepon;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }

    public String getId_members() {
        return id_members;
    }

    public void setId_members(String id_members) {
        this.id_members = id_members;
    }

}
