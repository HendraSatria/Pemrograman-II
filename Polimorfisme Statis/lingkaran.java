/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polmorfsmstatis;

/**
 *
 * @author LENOVO
 */
public class lingkaran {
    
    float luas(float r) {
        return (float) (Math.PI * r * r);
        
    }

    double luas(double d) {
        return (double) (Math.PI * d * 1 / 4);
    }

    public static void main(String[] args) {
        lingkaran L = new lingkaran();
        
        float r = 10;
        double d = 20;
        
        System.out.println("Luas Lingkaran dengan jari jari = " + L.luas(r));
        System.out.println("Luas Lingkaran dengan diameter = " + L.luas(d));        
        
    }
    
}
