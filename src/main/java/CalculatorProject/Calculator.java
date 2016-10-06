package CalculatorProject;


/**
 * Created by emilybutte on 9/13/16.
 */

public class Calculator {

    private static double savedVal;

    public double clearDisplayNum() {
        return 0;
    }

    public void saveVal(double saveVal) {
        savedVal = saveVal;
    }

    public double savedVal() {
        return savedVal;
    }

    public void resetVal() {
        savedVal = 0;
    }

    public double add(double currentDisplayNum, double valueEntered) { return currentDisplayNum + valueEntered;}

    public double subtract(double currentDisplayNum, double valueEntered) {
        return currentDisplayNum - valueEntered;
    }

    public double multiply(double currentDisplayNum, double valueEntered) { return currentDisplayNum * valueEntered; }

    public double divide(double currentDisplayNum, double valueEntered) { return currentDisplayNum / valueEntered; }


    public double squareRT(double currentDisplayNum) {
        return Math.sqrt(currentDisplayNum);
    }

    public double squareNum(double currentDisplayNum) {

        return currentDisplayNum * currentDisplayNum;
    }

    public double invNum(double currentDisplayNum) {
        return 1 / currentDisplayNum;
    }

    public double expoNum(double currentDisplayNum, double powerToEntered) { return Math.pow(currentDisplayNum, powerToEntered);}

    public double invSignOfNum(double currentDisplayNum) {
        return currentDisplayNum * -1;
    }

    public double sinNum(double currentDisplayNum) {
        if (Display.currentUnit == Units.DEGREES) {
            double radian = Math.toRadians(currentDisplayNum);
            return Math.sin(radian);
        } else {
            return Math.sin(currentDisplayNum);
        }
    }

    public double cosNum(double currentDisplayNum) {
        if (Display.currentUnit == Units.DEGREES) {
            double radian = Math.toRadians(currentDisplayNum);
            return Math.cos(radian);
        } else {
            return Math.cos(currentDisplayNum);
        }

    }
    public double tanNum(double currentDisplayNum) {
        if (Display.currentUnit == Units.DEGREES) {
            double radian = Math.toRadians(currentDisplayNum);
            return Math.tan(radian);
        } else {
            return Math.tan(currentDisplayNum);
        }
    }

    public double invSineNum(double currentDisplayNum) {
        if (Display.currentUnit == Units.RADIANS) {
            return Math.asin(currentDisplayNum);
        } else {
            return Math.toDegrees(Math.asin(currentDisplayNum));
        }
    }

    public double invCosNum(double currentDisplayNum) {
        if (Display.currentUnit == Units.RADIANS) {
            return Math.acos(currentDisplayNum);
        } else {
            return Math.toDegrees(Math.acos(currentDisplayNum));
        }
    }

    public double invTanNum(double currentDisplayNum) {
        if (Display.currentUnit == Units.RADIANS) {
            return Math.atan(currentDisplayNum);
        } else {
            return Math.toDegrees(Math.atan(currentDisplayNum));
        }
    }

    public double logNum(double currentDisplayNum) {
        return Math.log10(currentDisplayNum);
    }

    public double invLogNum(double currentDisplayNum) {
        return Math.pow(10, currentDisplayNum);
    }

    public double lnNum(double currentDisplayNum) {
        return Math.log(currentDisplayNum);
    }

    public double invLnNum(double currentDisplayNum) {
        return Math.pow(Math.E, currentDisplayNum);
    }

    public double factNum(double currentDisplayNum) {
        if (currentDisplayNum == 1) {
            return 1;
        } else {
            return factNum(currentDisplayNum - 1) * currentDisplayNum;
        }
    }

    public String convertValueToBinary(double value) {
        String doubleToString = Double.toString(value);
        String[] converterArray = doubleToString.split("\\.");
        String convertedValueOnLeft = Integer.toBinaryString(Integer.parseInt(converterArray[0]));
        String convertedValueOnRight = Integer.toBinaryString(Integer.parseInt(converterArray[1]));
        String periodSeparator = " 00101110 ";
        return convertedValueOnLeft + periodSeparator + convertedValueOnRight;

    }

    public String convertValueToHex(double value) {
        String doubleToString = Double.toString(value);
        String[] converterArray = doubleToString.split("\\.");
        String convertedValueOnLeft = Integer.toHexString((Integer.parseInt(converterArray[0])));
        String convertedValueOnRight = Integer.toHexString(Integer.parseInt(converterArray[1]));
        String periodSeparator = ".";
        return convertedValueOnLeft + periodSeparator + convertedValueOnRight;

    }

    public String convertValueToOctal(double value) {
        String doubleToString = Double.toString(value);
        String[] converterArray = doubleToString.split("\\.");
        String convertedValueOnLeft = Integer.toOctalString((Integer.parseInt(converterArray[0])));
        String convertedValueOnRight = Integer.toOctalString(Integer.parseInt(converterArray[1]));
        String periodSeparator = ".";
        return convertedValueOnLeft + periodSeparator + convertedValueOnRight;
    }
}
