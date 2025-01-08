/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polimorfsmdinamis;

/**
 *
 * @author LENOVO
 */
public class mainclass {

    public static void main(String[] args) {
        Bangundatar Bd = new Bangundatar();
        persegi persgi = new persegi(6);
        segitiga sgtg = new segitiga(3, 5);
        lingkaran ln = new lingkaran(2);

        Bd.luas();
        Bd.Keliling();

        System.out.println("Luas Persegi     " + persgi.luas());
        System.out.println("keliling persegi " + persgi.keliling());
        System.out.println("Luas segitiga     " + sgtg.luas());
        System.out.println("Luaslingkaran     " + ln.luas());
        System.out.println("keliling lingkaran   " + ln.keliling());

    }
}
