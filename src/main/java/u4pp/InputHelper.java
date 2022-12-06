package u4pp;

import java.util.Scanner;
//input helper from u4pp1 which ensures input is what i wanted
public class InputHelper {
        Scanner myScanner;
//creates constructor for scanner
    InputHelper(Scanner scanner){
        myScanner = scanner;
    }
    //gets y or no input, nothing else
    public boolean getYesNoInput(String prompt){
        System.out.println(prompt);
        String deez = myScanner.nextLine();
        while ((!deez.equals("y")) && (!deez.equals("Y")) && (!deez.equals("n")) && (!deez.equals("N"))){
            System.out.println("enter input: " + deez);
            System.out.println(prompt);
            deez = myScanner.nextLine();
        }
        if ((deez.equals("y")) || (deez.equals("Y"))){
            return true;
        }
        else{
            return false;
        } 
    }
    //input helper ensuring input is within the parameters desired
    public int getIntegerInput(String prompt, int min, int max){
        System.out.println(prompt);
        String deez = myScanner.nextLine();
        int num = Integer.valueOf(deez); 
        while (num < min || num > max){
            System.out.println(prompt);
            deez = myScanner.nextLine();
            num = Integer.valueOf(deez);
        }
        return num;
    }
}