/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gettersetter;

/**
 *
 * @author LENOVO
 */
public class Mainuser {
    public static void main(String[] args) {
        User user = new User();
       user.Setusername("dian");
       user.Setpassword("rahasia");
        System.out.println(" usernamnya : "+user.getusername());
   
        System.out.println("Passwordnya : "+user.getpassword());
    }
    
    
    
}
        
