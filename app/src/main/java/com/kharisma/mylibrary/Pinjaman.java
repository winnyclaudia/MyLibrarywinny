package com.kharisma.mylibrary;

/**
 * Created by 207-1 on 11/12/2017.
 */

public class Pinjaman {

    private String tanggalpinjam;
    private String tanggalkembali;
    private String id_members;
    private String idm;
    private Buku buku;

    private String[][] data = new String[][]{
            {"000001","01 Desember 2017","08 Desember 2017","55101"},
            {"000002","02 Desember 2017","09 Desember 2017","55102"},
            {"000003","03 Desember 2017","10 Desember 2017","55103"},
            {"000004","04 Desember 2017","11 Desember 2017","55104"}
    };


    public String getTanggalpinjam() {
        return tanggalpinjam;
    }

    public void setTanggalpinjam(String tanggalpinjam) {
        this.tanggalpinjam = tanggalpinjam;
    }

    public String getTanggalkembali() {
        return tanggalkembali;
    }

    public void setTanggalkembali(String tanggalkembali) {
        this.tanggalkembali = tanggalkembali;
    }

    public String getId_members() {
        return id_members;
    }

    public void setId_members(String id_members) {
        this.id_members = id_members;
    }

    public Buku getBuku() {
        return buku;
    }

    public void setBuku(Buku buku) {
        this.buku = buku;
    }

    public String getIdm() {
        return idm;
    }

    public void setIdm(String idm) {
        this.idm = idm;
    }


    public Pinjaman(String tv_idmember) {
        this.id_members = tv_idmember;
        this.cariPinjaman();

    }

    private void cariPinjaman() {
        for(int i=0; i<this.data.length; i++){
            if (this.id_members.equals(this.data[i][0])){
                this.tanggalpinjam = this.data[i][1];
                this.tanggalkembali = this.data[i][2];
                this.buku = new Buku(data[i][3]);
                this.idm = "1";
                break;
            }else {
                this.idm="0";
            }
        }
    }
}
