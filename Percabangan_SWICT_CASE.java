/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertumuan2;

/**
 *
 * @author x260
 */

public class Percabangan_SWICT_CASE {
    public static void main(String[] args) {        
        
        char menu = '2';
        System.out.println("Menu Restoran: ");
        System.out.println("1. Pizza");
        System.out.println("2. Hamburger");
        System.out.println("3. Pecel Lele");
        System.out.println("4. Rawon");
        System.out.println("terimakasih anda memilih menu no : " + menu);
        
        switch(menu){
            case '1':
            System.out.println("Pilihan Anda : " + menu + ". Pizza (Rp.8.000)");
            break;
            case '2':
            System.out.println("Pilihan Anda : " + menu + ". Hamburger (Rp.9.000)");
            break;
            case '3':
            System.out.println("Pilihan Anda : " + menu + ". Pecel Lele (Rp.12.000)");
            break;
            case '4':
            System.out.println("Pilihan Anda : " + menu + ". Rawon (Rp.6.000)");
            break;
        }
    }
}
