/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pbo2.latihan42.tabungan;

import java.util.Scanner;

/**
 *
 * @author asus
 * NAMA     : Muhamad Rizqi Ramdani
 * KELAS    : IF-2
 * NIM      : 10118069
 * Deskripsi Program : Program untuk menghitung Massa Jenis
 */
public class PBO2_10118069_Latihan42_Tabungan {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("==== Program Penarikan Uang ====");
        System.out.print("Masukan saldo awal : ");
        Tabungan tabungan = new Tabungan(scanner.nextInt());
        System.out.print("Jumlah uang yang diambil : ");
        System.out.println("Saldo Anda Sekarang : "
                + tabungan.ambilUang(scanner.nextInt()));
    }
}
