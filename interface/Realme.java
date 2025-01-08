/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface;

/**
 *
 * @author LENOVO
 */
public class Realme implements phone {

    private int volume;
    private boolean isPowerOn;

    public Realme() {
        this.volume = 50;

    }

    @Override
    public void powerOn() {
        isPowerOn = true;
        System.out.println("Hp menyala....");
        System.out.println("Selamat datang Samsung Phone");
        System.out.println("Android Version  13");
    }

    @Override
    public void powerOff() {

        isPowerOn = false;
        System.out.println("Hp Anda dimatikan");

    }

    @Override
    public void volumeUpp() {

        if (isPowerOn) {

            if (this.volume == MAX_VOLUME) {
                System.out.println("Volume FULL");
                System.out.println("Sudah  " + this.getVolume() + "%");
            } else {
                this.volume += 10;
                System.out.println("Volume sekarang : " + this.getVolume());
            }
        } else {
            System.out.println("Nyalain Hp Dulu Bro.....");

        }

    }

    @Override
    public void volumeDown() {
        if (isPowerOn) {

            if (this.volume == MIN_VOLUME) {
                System.out.println("Volume Sudah Pling Rendah");
                System.out.println("Sudah  " + this.getVolume() + "%");
            } else {
                this.volume -= 10;
                System.out.println("Volume sekarang : " + this.getVolume());
            }
        } else {
            System.out.println("Nyalain Hp Dulu Kawan.....");

        }
    }

    public int getVolume() {
        return this.volume;

    }

}
