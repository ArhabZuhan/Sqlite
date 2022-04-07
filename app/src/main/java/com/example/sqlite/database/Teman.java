package com.example.sqlite.database;

public class Teman {
    String id;
    String nama;
    String telphone;

    public Teman() {
    }

    public Teman(String id, String nama, String telphone) {
        this.id = id;
        this.nama = nama;
        this.telphone = telphone;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTelphone() {
        return telphone;
    }

    public void setTelphone(String telphone) {
        this.telphone = telphone;
    }
}
