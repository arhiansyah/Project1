/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bank;

/**
 *
 * @author rivandwiarhiansyah(18102068)
 */
public class BankBeraksi {
    public static void main(String[] args) {
        Bank bank;  //inisialisasi object
        
        bank = new Bank(100000);    //,e,amggil onject demgam jumlah saldo yg sudah ditentukan
        System.out.println("\n");
        
        System.out.println("Sealamat datang di Bank ABC \n");
        
        //print saldo
        bank.getSaldo();
        System.out.println();
        
        //Save money/saldo
        bank.simpanUang(500000);
        System.out.println();
        
        //withdraw money
        bank.ambilUang(150000);
        System.out.println();
        
    }
}
