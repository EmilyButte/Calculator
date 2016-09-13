package CalculatorProject;


import org.junit.Before;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by emilybutte on 9/13/16.
 */


public class CalculatorTest {

    Calculator calculator;
    Display display;

    @Before
    public void Setup() {
        calculator = new Calculator();
        display = new Display();
    }

    @Test
    public void add() {
        double expectedValue = 15;
        double actualValue = calculator.add(10, 5);
        Assert.assertEquals("10+5=15", expectedValue, actualValue, Math.ulp(1E-9));
    }

    @Test
    public void subtract() {
        double expectedValue = 10;
        double actualValue = calculator.subtract(20, 10);
        Assert.assertEquals("20-10=10", expectedValue, actualValue, Math.ulp(1E-9));
    }

    @Test
    public void multiple() {
        double expectedValue = 12;
        double actualValue = calculator.multiply(4, 3);
        Assert.assertEquals("4*3=12", expectedValue, actualValue, Math.ulp(1E-9));
    }

    @Test
    public void divide() {
        double expectedValue = 10;
        double actualValue = calculator.divide(100,10);
        Assert.assertEquals("100/10=10", expectedValue, actualValue, Math.ulp(1E-9));

    }


}
//public double add(double currentDisplayNum, double valueEntered) { return currentDisplayNum + valueEntered;}
// ColorfulThing colorfulThing = new ColorfulThing(ColorfulThing.Color.RED);
//@Test
//public void getColorTest(){
//    ColorfulThing.Color expectedValue = ColorfulThing.Color.RED;
//    ColorfulThing.Color actualValue = colorfulThing.getColor();
//    Assert.assertEquals("color message", expectedValue, actualValue);
//}