/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SplashScreen;

import AirTicketing.AirTicket;
import java.awt.event.ActionEvent;

/**
 *
 * @author Dell
 */
public class ChangeScreen {
    
    public static void main(String[]args){
        
    //Creating Instance of SplashScreen class    
    SplashScreen Splash=new SplashScreen();
    Splash.setVisible(true); //Setting the class as visible
    
    //Try and catch for Thread error handling
    try{
        for(int i=0;i<=100;i++){
            /**Thread is path followed while executing a code
               Thread.sleep allows the current thread or currently executing method to sleep after each execution
               In this case, the for loop sleeps every 35 milliseconds
            */
             Thread.sleep(30);
             Splash.lblLoadingSplash.setText(i+"%");
            //Inceasing the progressBar
             Splash.progressBar.setValue(i);
            if(i==100){          
                //Calling VisibilityLogins() method of SplashScreen on reaching 100
                Splash.visibilityLogins();              
            }
        }
    }catch(Exception e){
        //Catches error and displays in the console
        e.printStackTrace();
    }
    
    }
}
