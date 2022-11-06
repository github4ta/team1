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
}
