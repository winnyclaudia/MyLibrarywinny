package com.kharisma.mylibrary;

/**
 * Created by 207-1 on 11/12/2017.
 */

public class Buku {

    private String id_buku;
    private String judul;
    private String author;
    private String publisher;

    private String[][] data = new String[][]{
            {"55101","Program Berorientasi Objek","Sofyan Thayf","Kharisma01"},
            {"55102","Analisis Sistem Informasi","Ahyar","Kharisma02"},
            {"55103","Kewirausahaan","Renny","Kharisma03"},
            {"55104","Manajemen SDM","Afifah","Kharisma04"}
    };

    public Buku(String id_buku) {
        this.id_buku = id_buku;
        this.cariBuku();

    }

    private void cariBuku() {
        for(int i=0; i<this.data.length; i++){
            if (this.id_buku.equals(this.data[i][0])){
                this.judul = this.data[i][1];
                this.author = this.data[i][2];
                this.publisher = this.data[i][3];
            }
        }
    }


    public String getId_buku() {
        return id_buku;
    }

    public void setId_buku(String id_buku) {
        this.id_buku = id_buku;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

}
