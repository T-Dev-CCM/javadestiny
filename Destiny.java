// create a simulation of Destiny's Chosen classes
// import class libraries 
// To get input, use scanner 
import java.util.Scanner;
// Create Heroes class 
public class Heroes{
    public static void main(String[] args){
        // Create an object from sim manager
        SimManager objSimManager = new SimManager();
        // call display title method 
        objSimManager.DisplayTitle();

        objSimManager.displayExitMessage(); 
    }
}