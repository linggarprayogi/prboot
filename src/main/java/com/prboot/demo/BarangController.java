/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prboot.demo;

import java.util.Hashtable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author prayogi
 */
@RestController
@RequestMapping("/barang")
public class BarangController {
    
    @Autowired
    BarangService barangService;
    
    @RequestMapping("/all")
    public Hashtable<String, Barang> getAll(){
        return barangService.getAll();
    }
    
    @RequestMapping("{id}")
    public Barang getBarang(@PathVariable("id") String id){
        return barangService.getBarang(id);
    }
    
}
