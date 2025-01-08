/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class main {

    public static void main(String[] args) {
        phone RealmeC21Y = new Realme();

        phoneUser Yaya = new phoneUser(RealmeC21Y);
        Yaya.turnOnthePhone();

        Scanner input = new Scanner(System.in);
        String Aksi = null;

        while (true) {
            System.out.println("==========  APLIKASI INTERFACE  ==========");
            System.out.println("[1] Nyalakan Hp");
            System.out.println("[2] Matikan Hp");
            System.out.println("[3] Perbesar Volume Hp");
            System.out.println("[4] Kecilkan Volume Hp");
            System.out.println("[0] keluar");
            System.out.println("Pilih aksi");
            Aksi = input.nextLine();

            if (Aksi.equals("1")) {
                Yaya.turnOnthePhone();
            } else if (Aksi.equals("2")) {
                Yaya.turnoffthephone();
            } else if (Aksi.equals("3")) {
                Yaya.makephonelouder();
            } else if (Aksi.equals("4")) {
                Yaya.makephonesilent();

            } else if (Aksi.equals("0")) {
                System.exit(0);

            } else {
                System.out.println("Anda tidak membaca perintaah....");
            }

        }

    }

}
