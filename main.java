/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package latihan1;

/**
 * main.java - satu package dengan shinobi.java
 * @author RIVANDWIARHIANSYAH-18102068
 */
public class Main {
    public static void main(String[] args) {
        Shinobi[] s = new Shinobi[3];
        
        //membentuk objek1
        s[0] = new Shinobi();
        s[0].setNoregistrasi("012606");
        s[0].setNama("Uchiha Sasuke");
        s[0].setPeringkat("Genin");
        
        //membentuk objek ke-2
        s[1] = new Shinobi();
        s[1].setNoregistrasi("012607");
        s[1].setNama("Uzumaki Naruto");
        s[1].setPeringkat("Genin");
        
        //membentuk objek ke-3
        s[2] = new Shinobi();
        s[2].setNoregistrasi("012601");
        s[2].setNama("Haruno Sakura");
        s[2].setPeringkat("Genin");
        
        //menampilak ketiga objek dari array
        System.out.println("Data Diagram Shinobi \n");
        for (Shinobi x:s) {
            System.out.println("No.Registrasi : "+x.getNoregistrasi());
            System.out.println("Nama : "+x.getNama());
            System.out.println("Peringkat : "+x.getPeringkat());
            System.out.println("");
        }
    }
}
