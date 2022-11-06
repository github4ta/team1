package by.itcademy.team1;

import by.itacademy.team1.Calculator;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest{
    @Test
    public void testCalculateThePercentageOfNumber(){
        Calculator calculator = new Calculator();
        double number = 100;
        double percent = 10;
        double expected = 10;

        double actual = calculator.calculateThePercentageOfNumber(percent, number);

        Assert.assertEquals(expected, actual, 0.1);
    }
    @Test
    public void testCalculatePercentageRationNumberToNumber() {
        Calculator calculator = new Calculator();
        double number1 = 9;
        double number2 = 27;
        double expected = 33.3;

        double actual = calculator.calculatePercentageRationNumberToNumber(number1, number2);

        Assert.assertEquals(expected, actual, 0.1);
    }
}
