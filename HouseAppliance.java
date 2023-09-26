/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.posttest1pbo;

import java.util.ArrayList;

public class HouseAppliance {
    // Property
    public String nama;          
    public String merek;         
    public boolean hidup;        

    // Constructor
    public HouseAppliance(String nama, String merek, boolean hidup) {
        this.nama = nama;        
        this.merek = merek;      
        this.hidup = hidup;      
    }
    
    // Method untuk menghidupkan semua peralatan
    public void hidupkansemua() {
        hidup = true;            
    }
    
    // Method untuk mematikan semua peralatan
    public void matikansemua() {
        hidup = false;           
    }

    public static void main(String[] args) {
        
    }
}
