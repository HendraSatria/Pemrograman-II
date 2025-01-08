/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Konstructor;

/**
 *
 * @author LENOVO
 */
public class User {
    public String username;
    public String password;
    public User (String username,String password){
    
    this.username = username;
    this.password = password;}
    
    }
class DemonConstructor{
    public static void main(String[] args) {
        User petani = new User("petanikode","Kopi");
        System.out.println("Usename : "+ petani.username);
        System.out.println("Password :"+petani.password);
    }
}
    

