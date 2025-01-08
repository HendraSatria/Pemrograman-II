/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polimorfsmdinamis;

/**
 *
 * @author LENOVO
 */
public class lingkaran extends Bangundatar {

    int r;

    public lingkaran(int r) {
        this.r = r;
    }

    @Override
    public float luas() {
        return (float) Math.PI * r * r;
    }

    public float keliling() {
        return (float) (2 * Math.PI * r);
    }
}
