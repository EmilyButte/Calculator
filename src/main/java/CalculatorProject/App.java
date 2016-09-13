package CalculatorProject;

/**
 * Created by emilybutte on 9/13/16.
 */

// ALL CREDIT DUE TO KYLE JACKSON WHO WALKED ME THROUGH THIS!!!
// WHEN HE STARTED WORKING WITH ME, I ONLY HAD A COUPLE BASIC MATH METHODS
// BUT NOW I UNDERSTAND WHAT EVERYTHING DOES AND WHY IT'S NEEDED AND HOW TO MAKE IT
// HE ALSO TAUGHT ME ABOUT CATCH BLOCKS

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
