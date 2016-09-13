package CalculatorProject;

/**
 * Created by emilybutte on 9/13/16.
 */

// Scientific math features sourced from Kyle Jackson

import javax.swing.JOptionPane;
import static java.lang.Double.NaN;
import static java.lang.Double.isInfinite;

public class Display {

    // Message showing calculator is on
    public Display() {
        System.out.println("Calculator running");
    }


    Calculator calculator = new Calculator();
    User user = new User();

    private static double currentNum;
    private boolean on = true;
    public static Units currentUnit = Units.DEGREES;
    public static DisplayMode currentDisplayMode = DisplayMode.DECIMAL;
    private String commandEntered;
    private String binaryNum;
    private String octalNum;
    private String hexNum;


    public void CalcRun() {

        showCommandMenu();
        while (on) {
            checkNum();
            showDisplayNum();
            commandEntered = user.getCommand().toUpperCase();
            Operations operation = Operations.valueOf(commandEntered);
            switch (operation) {
                case DISPLAY:
                    System.out.println("Choose one: DECIMAL, HEXADECIMAL, OCTAL, BINARY, or ROTATE");
                    String mode = user.getCommand().toUpperCase();
                    switchDisplayMode(mode);
                    break;
                case OFF:
                    on = false;
                    break;
                case MENU:
                    showCommandMenu();
                    break;
                case CLEAR:
                    currentNum = calculator.cleardisplayNum();
                    break;
                case SAVE:
                    System.out.println("Enter a number to save");
                    calculator.saveVal(user.inputFromUser());
                    break;
                case RETRIEVE:
                    System.out.println("Displaying saved number");
                    System.out.println(calculator.savedVal());
                    break;
                case UNITS:
                    System.out.print("Choose one: ROTATE, DEGREES, or RADIANS");
                    String unitMode = user.getCommand().toUpperCase();
                    switchUnitsMode(unitMode);
                    break;
                case MRESET:
                    calculator.resetVal();
                    break;
                case ADD:
                    currentNum = calculator.add(currentNum, user.inputFromUser());
                    break;
                case SUB:
                    currentNum = calculator.subtract(currentNum, user.inputFromUser());
                    break;
                case MULTIPLY:
                    currentNum = calculator.multiply(currentNum, user.inputFromUser());
                    break;
                case DIVIDE:
                    currentNum = calculator.divide(currentNum, user.inputFromUser());
                    break;
                case SQUAREROOT:
                    currentNum = calculator.squareRT(currentNum);
                    break;
                case SQUARE:
                    currentNum = calculator.squareNum(currentNum);
                    break;
                case INVERSE:
                    currentNum = calculator.invNum(currentNum);
                    break;
                case SIN:
                    currentNum = calculator.sinNum(currentNum);
                    break;
                case COS:
                    currentNum = calculator.cosNum(currentNum);
                    break;
                case TAN:
                    currentNum = calculator.tanNum(currentNum);
                    break;
                case LOG:
                    currentNum = calculator.logNum(currentNum);
                    break;
                case INVLOG:
                    currentNum = calculator.invLogNum(currentNum);
                    break;
                case INVTAN:
                    currentNum = calculator.invTanNum(currentNum);
                    break;
                case EXPONENTIAL:
                    currentNum = calculator.expoNum(currentNum, user.inputFromUser());
                    break;
                case INV:
                    currentNum = calculator.invSignOfNum(currentNum);
                    break;
                case INVSINE:
                    currentNum = calculator.invSineNum(currentNum);
                    break;
                case INVCOS:
                    currentNum = calculator.invCosNum(currentNum);
                    break;
                case LN:
                    currentNum = calculator.lnNum(currentNum);
                    break;
                case EX:
                    currentNum = calculator.invLnNum(currentNum);
                    break;
                case FACT:
                    currentNum = calculator.factNum(currentNum);
                    break;
                default:
                    System.out.println("Please enter a valid command");
            }
        }
    }

    public void switchDisplayMode() {
        if (currentDisplayMode == DisplayMode.DECIMAL) {
            currentDisplayMode = DisplayMode.HEXDECIMAL;
        }
        if (currentDisplayMode == DisplayMode.HEXDECIMAL) {
            currentDisplayMode = DisplayMode.BINARY;
        }
        if (currentDisplayMode == DisplayMode.BINARY) {
            currentDisplayMode = DisplayMode.OCTAL;
        }
        if (currentDisplayMode == DisplayMode.OCTAL) {
            currentDisplayMode = DisplayMode.DECIMAL;
        }
    }

    public void showDisplayNum() {
        System.out.println("Current Number On Display: " + currentNum);
    }

    // checkNum Method sourced from Kyle Jackson
    public void checkNum() {
        if (isInfinite(currentNum) || currentNum == NaN) {
            System.out.println("Err");
            currentNum = calculator.cleardisplayNum();
        }
    }

    public void switchDisplayMode(String mode) {
        DisplayMode displayMode = DisplayMode.valueOf(mode);
        switch (displayMode) {
            case BINARY:
                binaryNum = calculator.convertValueToBinary(currentNum);
                System.out.println(binaryNum);
                break;
            case OCTAL:
                octalNum = calculator.convertValueToOctal(currentNum);
                System.out.println(octalNum);
                break;
            case DECIMAL:
                break;
            case HEXDECIMAL:
                hexNum = calculator.convertValueToHex(currentNum);
                System.out.println(hexNum);
                break;
            case ROTATE:
                switchDisplayMode();
                break;
            default:
                System.out.println("The entry was not DECIMAL, BINARY, HEXDECIMAL, OCTAL, or ROTATE");
                break;
        }
    }

    public void switchUnitsMode() {
        if (currentUnit == Units.RADIANS) {
            currentUnit = Units.DEGREES;
        }
        if (currentUnit == Units.DEGREES) {
            currentUnit = Units.RADIANS;
        }
    }

    public void switchUnitsMode(String changeUnit) {
        Units units = Units.valueOf(changeUnit);
        switch (units) {
            case RADIANS:
                currentUnit = Units.RADIANS;
                break;
            case DEGREES:
                currentUnit = Units.DEGREES;
                break;
            case ROTATE:
                switchUnitsMode();
            default:
                System.out.println("Please enter ROTATE, DEGREES, OR RADIANS");
        }
    }

    // Command Menu sourced from Kyle Jackson
    public void showCommandMenu() {

        JOptionPane.showMessageDialog(null, "----------------COMMAND MENU--------------------------\n" +
                "ADD - Add number to current number on display\n" +
                "SUBTRACT - Subtract number from current number on display\n" +
                "MULTIPLY - Multiply number to current number on display\n" +
                "DIVIDE - Divide number by current number on display\n" +
                "SQUAREROOT - Find the square root of the curent number on display\n" +
                "SQUARE - Square the current number on the display\n" +
                "INVERSE - Find the inverse of the current number\n" +
                "EXPONENTIAL - Find the varaible exponentiation of current number on display\n" +
                "CLEAR - Clear the current number on display\n" +
                "INVERT - Invert the sign of the current number on display\n" +
                "SAVE - Store a value in memory for later\n" +
                "RETRIEVE - Retrieve the number in memory\n" +
                "RESETMEM - Reset the current number in memory to 0\n" +
                "SIN - Calculate the Sine of the current number on display\n" +
                "COS - Calculate the Cosine of the current number on display \n" +
                "TAN - Calculate the Tangent of the current number on display\n" +
                "ISINE - Calculate the Inverse Sine of number on display\n" +
                "ICOS - Calculate the Inverse Cosine of the number on display\n" +
                "ITAN - Calculate the Inverse Tangent of the number on display\n" +
                "LOG - Calculate the logarithm of the number on display\n" +
                "ILOG - Calculate the Inverse Logarithm of the number on display\n" +
                "LN - Calculate the Natural Logarithm of the number on dispaly\n" +
                "EX - Calculate the Inverse Natural Logarithm\n" +
                "FACT - Calcualte the factorial of the number on display\n" +
                "DISPLAY - Switch Display Mode to BINARY, OCTAL, DECIMAL, HEXADECIMAL or ROTATE\n" +
                "UNITS - Switch Unit Mode to DEGREES, RADIANS, or ROTATE\n" +
                "OFF - Turn the Calculator Off\n" +
                "MENU - Display the Menu");
    }
}