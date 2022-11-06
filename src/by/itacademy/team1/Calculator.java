package by.itacademy.team1;

public class Calculator{
    public double calculateThePercentageOfNumber(double percent, double number){
        return (number / 100) * percent;
    }

    public double calculatePercentageRationNumberToNumber(double number1, double number2){
        return (number1 * 100) / number2;
    }

    public double calculateSumOfThePercentageToNumber(double percent, double number){
        return number + ((number / 100) * percent);
    }
}

