/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package challenge;

/**
 *
 * @author RIVAN DWI ARHIANSYAH(18102068)
 */
public class Driver {
    public static void main(String[] args) {
        //pembentukan objek mobil YANG BERPARAMETER
        Mobil m1 = new Mobil("Toyota", "B14589", 2015);        
        Mobil m2 = new Mobil("Suzuki", "R10025", 2018);
        Mobil m3 = new Mobil("Mazda", "B15469", 2016);
        Mobil m4 = new Mobil("Honda", "AA1024", 2020);
        Mobil m5 = new Mobil("Daihatsu", "D14522", 2017);
        
        //pembentukan objek data pemilik
        Pemilik p = new Pemilik("Sudarnam", "Surabaya");
        
        //PENGHUBUNG ANTARA CLASS PEMILIK DAN MOBIL
        p.setnoPlatMobil(m1.getNoPlat());
        p.setnoPlatMobil(m2.getNoPlat());
        p.setnoPlatMobil(m3.getNoPlat());
        p.setnoPlatMobil(m4.getNoPlat());
        p.setnoPlatMobil(m5.getNoPlat());
        
        //menampilkan data pemilik 
        System.out.println("Pemilik: ");
        System.out.println("Nama : "+p.getNama());
        System.out.println("Alamat : "+p.getAlamat());
        
        //MENAMPILKAN DATA MOBIL
        System.out.println("Mobil: ");
        System.out.println("");
        System.out.println(m1.getMerek()+"-"+m1.getNoPlat()+"-"+m1.getTahunKeluaran());
        System.out.println(m2.getMerek()+"-"+m2.getNoPlat()+"-"+m2.getTahunKeluaran());
        System.out.println(m3.getMerek()+"-"+m3.getNoPlat()+"-"+m3.getTahunKeluaran());
        System.out.println(m4.getMerek()+"-"+m4.getNoPlat()+"-"+m4.getTahunKeluaran());
        System.out.println(m5.getMerek()+"-"+m5.getNoPlat()+"-"+m5.getTahunKeluaran());
        
        //menampilkan jumlah mobil milik pemilik
        int jml = p.getJumlahMobil();
        System.out.println("Jumlah Mobil : "+jml);
    }
}
