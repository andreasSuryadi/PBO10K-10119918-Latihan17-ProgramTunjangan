/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10k10119918latihan17programtunjangan;

import java.util.Scanner;

/**
 *
 * @author
 * NAMA     : Andreas Suryadi
 * KELAS    : IF-10K
 * NIM      : 10119918
 * Deskripsi Program : Menghitung Tunjangan
 *
 */
public class PBO10K10119918Latihan17ProgramTunjangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double gajiPokok = 0, tunjangan = 0, totalGaji = 0;
        String status;

        System.out.println("============Program Tunjangan===========");
        System.out.print("Berapa gaji pokok anda perbulan?: Rp. ");
        gajiPokok = scanner.nextInt();
        System.out.print("Status Anda? (Menikah/Belum)    : ");
        status = scanner.next();
        status = status.toLowerCase();

        if (status.equals("menikah")) {
            tunjangan = gajiPokok * 35 / 100;
        }

        totalGaji = gajiPokok + tunjangan;

        System.out.println("=======Hasil Penghitungan Gaji Anda========");
        System.out.printf("Gaji Pokok              : Rp %.1f%n", gajiPokok);
        System.out.printf("Tunjangan               : Rp %.1f%n", tunjangan);
        System.out.printf("Total Gaji              : Rp %.1f%n", totalGaji);
        System.out.println("(Developed by : Andreas Suryadi)");
    }
    
}
