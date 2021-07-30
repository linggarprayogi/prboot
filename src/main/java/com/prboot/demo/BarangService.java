/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prboot.demo;

import java.util.Hashtable;
import org.springframework.stereotype.Service;

/**
 *
 * @author prayogi
 */
@Service
public class BarangService {
    
    Hashtable<String, Barang> tbBarang = new Hashtable<>();
    
    public BarangService(){
        Barang barang = new Barang();
        barang.setIdBarang("1");
        barang.setNamaBarang("Laptop");
        barang.setStock(10);
        tbBarang.put("1", barang);
        
        barang = new Barang();
        barang.setIdBarang("2");
        barang.setNamaBarang("Handphone");
        barang.setStock(7);
        tbBarang.put("2", barang);
    }
    
    public Barang getBarang(String idBarang){
        if(tbBarang.containsKey(idBarang)){
            return tbBarang.get(idBarang);
        }
        return null;
    }
    
    public Hashtable<String, Barang> getAll(){
        return tbBarang;
    }
}
