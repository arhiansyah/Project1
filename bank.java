/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bank;
/**
 *
 * @author Rivan Dwi Arhiansyah(18102068)
 */
public class Bank {
   int saldo;   //deklarasi variabel

  //construktor dari bank dengan parameter variabel saldo
   Bank(int saldo) {
    this.saldo = saldo;
  }

  void simpanUang(int uang) {   //method simpan uang
    // nambahin uang ke saldo
    this.saldo += uang;

    // cetak informasi
    System.out.println("Simpan uang: Rp." + uang);
    System.out.println("Saldo saat ini: Rp." + this.saldo);
  }

  //method untuk menarik uang
  void ambilUang(int uang) {
    // ngurangin uang dari saldo
    this.saldo -= uang;

    // cetak informasi
    System.out.println("Ambil uang: Rp." + uang);
    System.out.println("Saldo saat ini: Rp." + this.saldo);
  }

  //method mencetak saldo awal
  void getSaldo() {
    System.out.println("Saldo saat ini: Rp." + this.saldo);
  }
}
