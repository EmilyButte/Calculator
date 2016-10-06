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
    public void addTest() {
        double expected = 15;
        double actual = calculator.add(10, 5);
        Assert.assertEquals("10+5=15", expected, actual, Math.ulp(1E-9));
    }

    @Test
    public void subtractTest() {
        double expected = 10;
        double actual = calculator.subtract(20, 10);
        Assert.assertEquals("20-10=10", expected, actual, Math.ulp(1E-9));
    }

    @Test
    public void multipleTest() {
        double expected = 12;
        double actual = calculator.multiply(4, 3);
        Assert.assertEquals("4*3=12", expected, actual, Math.ulp(1E-9));
    }

    @Test
    public void divideTest() {
        double expected = 10;
        double actual = calculator.divide(100, 10);
        Assert.assertEquals("100/10=10", expected, actual, Math.ulp(1E-9));

    }

    @Test
    public void squareRTTest() {
        double expected = 8;
        double actual = calculator.squareRT(64);
        Assert.assertEquals("square root of 64 =8", expected, actual, Math.ulp(1E-9));
    }

    @Test
    public void squareNumTest() {
        double expected = 4;
        double actual = calculator.squareNum(2);
        Assert.assertEquals("2 squared = 4", expected, actual, Math.ulp(1E-9));
    }

    @Test
    public void invNumTest() {
        double expected = 0.5;
        double actual = calculator.invNum(2);
        Assert.assertEquals("2 inverted = 1/2", expected, actual, Math.ulp(1E-9));
    }

    @Test
    public void expoNumTest() {
        double expected = 4;
        double actual = calculator.expoNum(2, 2);
        Assert.assertEquals("2 raised to the power of 2 = 4", expected, actual, Math.ulp(1E-9));

    }

    @Test
    public void invSignOfNumTest() {
        double expected = -1;
        double actual = calculator.invSignOfNum(1);
        Assert.assertEquals("inverse sign of 1 is -1", expected, actual, Math.ulp(1E-9));
    }

    @Test
    public void sinNumTest() {
        double radian = Math.toRadians(3);
        double expected = 0.14112000806;
        double actual = calculator.sinNum(radian);
        Assert.assertEquals("sin(3) = 0.14112000806", expected, actual, Math.ulp(1E-9));
    }

    @Test
    public void cosNumTest() {
        double radian = Math.toRadians(3);
        double expected = 0.9999995824370531;
        double actual = calculator.cosNum(radian);
        Assert.assertEquals("cos(3) = 0.9999995824370531", expected, actual, Math.ulp(1E-9));
    }

    @Test
    public void tanNumTest() {
        double radian = Math.toRadians(3);
        double expected = 9.138525137541234E-4;
        double actual = calculator.tanNum(radian);
        Assert.assertEquals("tan(3) = 9.138525137541234E-4", expected, actual, Math.ulp(1E-9));
    }

    @Test
    public void invSineNumTest() {
        double radian = Math.toRadians(3);
        double expected = 3.0013724722839714;
        double actual = calculator.invSineNum(radian);
        Assert.assertEquals("invSine(3) = 3.0013724722839714", expected, actual, Math.ulp(1E-9));
    }

    @Test
    public void invCosNumTest() {
        double radian = Math.toRadians(3);
        double expected = 86.99862752771604;
        double actual = calculator.invCosNum(radian);
        Assert.assertEquals("invCos(3) = 86.99862752771604", expected, actual, Math.ulp(1E-9));
    }

    @Test
    public void invTanNumTest() {
        double radian = Math.toRadians(3);
        double expected = 2.997262944089746;
        double actual = calculator.invTanNum(radian);
        Assert.assertEquals("invTan(3) = 2.997262944089746", expected, actual, Math.ulp(1E-9));
    }

    @Test
    public void logNumTest() {
        double expected = 0.6020599913279624;
        double actual = calculator.logNum(4);
        Assert.assertEquals("log(4) = 0.6020599913279624", expected, actual, Math.ulp(1E-9));
    }

    @Test
    public void invLogNumTest() {
        double expected = 0.6020599913279624;
        double actual = calculator.logNum(4);
        Assert.assertEquals("inverse log of 4 = 0.6020599913279624", expected, actual, Math.ulp(1E-9));
    }

    @Test
    public void lnNumTest() {
        double expected = 1.3862943611198906;
        double actual = calculator.lnNum(4);
        Assert.assertEquals("natural log of 4  = 1.3862943611198906", expected, actual, Math.ulp(1E-9));
    }

    @Test
    public void invLnNumTest() {
        double expected = 54.59815003314423;
        double actual = calculator.invLnNum(4);
        Assert.assertEquals("inverse natural log of 4  = 54.59815003314423", expected, actual, Math.ulp(1E-9));    }

    @Test
    public void factNumTest() {
        double expected = 24.0;
        double actual = calculator.factNum(4);
        Assert.assertEquals("factorial of 4  = 24.0", expected, actual, Math.ulp(1E-9));
    }
}
