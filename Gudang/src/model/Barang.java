/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Haris
 */
public class Barang {
    private int id_barang;
    private String nama_barang;

    public int getId_barang() {
        return id_barang;
    }

    public void setId_barang(int id_barang) {
        this.id_barang = id_barang;
    }

    public String getNama_barang() {
        return nama_barang;
    }

    public void setNama_barang(String nama_barang) {
        this.nama_barang = nama_barang;
    }

    public Barang(int id_barang, String nama_barang) {
        this.id_barang = id_barang;
        this.nama_barang = nama_barang;
    }
    
    public Barang(){
}
}