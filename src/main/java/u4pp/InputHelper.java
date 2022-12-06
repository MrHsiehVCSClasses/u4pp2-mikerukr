package u4pp;

import java.util.Scanner;
//input helper from u4pp1 which ensures input is correct
public class InputHelper {
    static Scanner myScanner = new Scanner(System.in);
    public static boolean getYesNoInput(String prompt){
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
    public static int getIntegerInput(String prompt, int min, int max){
        System.out.println(prompt);
        String deez = myScanner.nextLine();
        int num = Integer.valueOf(deez); 
        while (num < min || num > max){
            System.out.println(prompt);
            deez = myScanner.nextLine();
            num = Integer.valueOf(deez);
        }
        System.out.println("Your number is ");
        return num;
    }
}