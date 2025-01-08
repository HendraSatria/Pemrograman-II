/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface;

/**
 *
 * @author LENOVO
 */
public class phoneUser {
    private phone Phone ;
    public phoneUser(phone Phone){
        this.Phone= Phone ;
        
    }
    void turnOnthePhone(){
        this.Phone.powerOn(); 
        }
    void turnoffthephone(){
        this.Phone.powerOff();
    }
    void makephonelouder(){
        this.Phone.volumeUpp();
    }
    void makephonesilent(){
        this.Phone.volumeDown(); 
    }
}
