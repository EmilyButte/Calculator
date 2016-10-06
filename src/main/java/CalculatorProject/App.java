package CalculatorProject;

/**
 * Created by emilybutte on 9/13/16.
 */

public class App {
    public static void main(String[] args) {

        Display display = new Display();

        try {
            display.CalcRun();
        } catch (Exception e) {
            System.out.println("Enter valid command");
            display.CalcRun();
        }
    }
}
