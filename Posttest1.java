/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.posttest1pbo;

import java.util.ArrayList;

public class Posttest1 {

    public static void main(String[] args) {
        // ArrayList
        ArrayList<HouseAppliance> appliances = new ArrayList<>();

        // Menambahkan peralatan rumah tangga ke dalam ArrayList
        appliances.add(new HouseAppliance("Kulkas", "Panasonic", true));
        appliances.add(new HouseAppliance("Mesin Cuci", "LG", true));
        appliances.add(new HouseAppliance("TV", "Sharp", true));
        appliances.add(new HouseAppliance("Setrika", "Maspion", false));
        appliances.add(new HouseAppliance("Kipas Angin", "Cosmos", true));
        appliances.add(new HouseAppliance("Blender", "Philips", false));
        appliances.add(new HouseAppliance("Rice Cooker", "Miyako", true));

        // Loop atau perulangan untuk mencetak informasi peralatan rumah tangga
        for (HouseAppliance appliance : appliances) {
//            appliance.hidupkansemua(); 
//            appliance.matikansemua(); 
            System.out.println("**********************************");
            System.out.println("Informasi Peralatan Rumah Tangga");
            String statusHidup = appliance.hidup ? "Hidup dan sedang digunakan" : "Mati dan tidak digunakan";
            System.out.println("Nama: " + appliance.nama+"\n"+"Merek:  "+ appliance.merek+"\n"+"Status: "+statusHidup);
            System.out.println("**********************************");
            System.out.println("");
        }
    }
}
